public class Dog {
    public int weight; // an instance/non-static variable
    public static String color = "black"; // a class/static variable

    public Dog(int w) { // a constructor
        weight = w;
    }

    public void makeNoise() { // an instance/non-static method
        if (weight < 10) {
            System.out.println("yap yap yap");
        } else if (weight < 30) {
            System.out.println("bark bark bark");
        } else {
            System.out.println("wooooof!");
        }
    }

    public static Dog maxDog(Dog d1, Dog d2) { // a class/static method
        if (d1.weight > d2.weight) {
            return d1;
        } else {
            return d2;
        }
    }
}

/**
 * 1. The constructor with signature public Dog(int w)
 *      will be invoked anytime that we try to create a Dog
 *      using the new keyword and a single integer parameter.
 *      For those of you coming from Python, the constructor
 *      is very similar to the __init__ method.
 * 2. Java allows us to define two types of methods:
 *      - Class methods, a.k.a. static methods. [invoked by a class name]
 *      - Instance methods, a.k.a. non-static methods. [invoked by an instance name]
 *          - we use the keyword this to refer to the current object.
 * 3. Static variables are properties inherent to the class itself, rather than the instance.
 *      - Static variables should be accessed using the name of the class rather than a specific instance, e.g. you should use Dog.binomen, not d.binomen.
 *      - While Java technically allows you to access a static variable using an instance name, it is bad style, confusing, and in my opinion an error by the Java designers.
 * */
