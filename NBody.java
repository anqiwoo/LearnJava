/** Your goal for this project is to write a program
 * simulating the motion of N objects in a plane,
 * accounting for the gravitational forces mutually affecting each object
 * as demonstrated by Sir Isaac Newton’s Law of Universal Gravitation.
 *
 * NBody is a class that will actually run your simulation.
 * This class will have NO constructor.
 * The goal of this class is to simulate a universe
 * specified in one of the data files.
 *
 * The input format is a text file that contains the information
 * for a particular universe (in SI units).
 * The first value is an integer N which represents the number of planets.
 * The second value is a real number R which represents the radius of
 * the universe, used to determine the scaling of the drawing window.
 * Finally, there are N rows, and each row contains 6 values.
 * The first two values are the x- and y-coordinates of the initial position;
 * the next pair of values are the x- and y-components of the initial velocity;
 * the fifth value is the mass;
 * the last value is a String that is the name of an image file used to display the planets.
 * Image files can be found in the images directory.
 * The file above contains data for our own solar system (up to Mars).
 *
 * */
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.*;

public class NBody {
    public static double readRadius(String fp) throws Exception{
        /**Given a file name as a String,
         * it should return a double corresponding
         * to the radius of the universe in that file,
         * e.g. readRadius("./data/planets.txt") should
         * return 2.50e+11.*/
        File file = new File(fp);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String first_line = br.readLine();
        String second_line = br.readLine();
        return Double.parseDouble(second_line);
    }

    public static void readBodies(String fp) throws Exception{
        /**Given a file name, it should return
         * an array of Bodys corresponding to the bodies in the file*/
        File file = new File(fp);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = br.readLine();
        int count = 0;
        while (line!=null) {
            if (count < 2) {
                continue;
            }
            String[] parts = line.split(" ");
            System.out.println(parts[0]);
            System.out.println(parts[-1]);
            count++;
            line = br.readLine();
        }
    }

    public static void main(String[] args) throws Exception {
        // System.out.println(readRadius("planets.txt"));
        readBodies("planets.txt");
    }
}
