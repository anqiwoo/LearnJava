/**write a test that creates two bodies and prints out the pairwise force between them
 * */

public class TestBody {
    public static void main(String[] args) {
        Body Samh = new Body(1, 0, 0, 0, 10, "");
        Body Aegir = new Body(3, 3, 0, 0, 5, "");
        Body Rocinante = new Body(5, -3, 0, 0, 50, "");
        Body[] bodies = new Body[] {Aegir, Rocinante};
        double f_net_x_on_Samh = Samh.calcNetForceExertedByX(bodies);
        double f_net_y_on_Samh = Samh.calcNetForceExertedByY(bodies);
        System.out.println("Net Force - X: " + f_net_x_on_Samh);
        System.out.println("Net Force - Y: " + f_net_y_on_Samh);
    }
}
