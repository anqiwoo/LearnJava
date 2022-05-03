import java.lang.Math;

public class Body {
    public double xxPos;
    public double yyPos;
    public double xxVel;
    public double yyVel;
    public double mass;
    public String imgFileName;

    public static double G = 6.67e-11;

    public Body(double xP, double yP, double xV,
                    double yV, double m, String img) {
        this.xxPos = xP;
        this.yyPos = yP;
        this.xxVel = xV;
        this.yyVel = yV;
        this.mass = m;
        this.imgFileName = img;
    }

    public Body(Body b) {
        this.xxPos = b.xxPos;
        this.yyPos = b.yyPos;
        this.xxVel = b.xxVel;
        this.yyVel = b.yyVel;
        this.mass = b.mass;
        this.imgFileName = b.imgFileName;
    }

    public double calcDistance(Body b) {
        /**This method will take in a single Body and
         * should return a double equal to the distance
         * between the supplied body and the body that is doing the calculation*/
        double d = 0;
        d = Math.pow(this.xxPos - b.xxPos, 2) + Math.pow(this.yyPos - b.yyPos, 2);
        return Math.sqrt(d);
    }

    public double calcForceExertedBy(Body b) {
        /**The calcForceExertedBy method takes in a Body, and
         * returns a double describing the force exerted on this body
         * by the given body.*/
        double d = this.calcDistance(b);
        return Body.G * this.mass * b.mass / Math.pow(d, 2);
    }

    public double calcForceExertedByX(Body b) {
        /**Calculate the forece exerted in this body by the given body in the X direction*/
        double d = this.calcDistance(b);
        double dx = b.xxPos - this.xxPos;
        double f = this.calcForceExertedBy(b);
        return f * (dx / d);
    }

    public double calcForceExertedByY(Body b) {
        /**Calculate the force exerted in this body by the given body in the Y direction*/
        double d = this.calcDistance(b);
        double dy = b.yyPos - this.yyPos;
        double f = this.calcForceExertedBy(b);
        return f * (dy / d);
    }

    public double calcNetForceExertedByX(Body[] bodies) {
        /**Calculate the net force on this body in the X direction
         * exerted by all bodies, except itself, in the given Body array*/
        double netx = 0;
        for (int i = 0; i < bodies.length; i++) {
            if (bodies[i].equals(this)) {
                continue;
            } else {
                netx += this.calcForceExertedByX(bodies[i]);
            }
        }
        return netx;
    }

    public double calcNetForceExertedByY(Body[] bodies) {
        /**Calculate the net force on this body in the Y direction
         * exerted by all bodies, except itself, in the given Body array*/
        double nety = 0;
        for (int i = 0; i < bodies.length; i++) {
            if (bodies[i].equals(this)) {
                continue;
            } else {
                nety += this.calcForceExertedByY(bodies[i]);
            }
         }
        return nety;
    }

    public void update(double dt, double fx, double fy) {
        /**Update this body's velocity and position
         * in a small period of time dt
         * given the x-force fx and y-force fy*/

        // Calculate the acceleration using the provided x- and y-forces
        double ax = fx / this.mass;
        double ay = fy / this.mass;
        // Calculate the new velocity by using the acceleration and current velocity
        this.xxVel += ax * dt;
        this.yyVel += ay * dt;
        // Calculate the new position by using the velocity computed in step 2 and the current position
        this.xxPos += this.xxVel * dt;
        this.yyPos += this.yyVel * dt;
    }


}

/**
 * 1. It is good practice to declare any constants as a ‘static final’ variable in your class, and to use that variable anytime you wish to use the constant.
 * 2. Java supports scientific notation. For example, I can write double someNumber = 1.03e-7;.
 *
 * */
