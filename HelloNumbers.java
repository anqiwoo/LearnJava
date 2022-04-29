public class HelloNumbers {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i < 10) {
            /** In this case,System.out.print(sum + " ");,
             * Java, strongly typed as it is,
             * expects a string type result,
             * and smoothly interprets the arguments
             * as a string concatentation. */
            System.out.print(sum + " ");
            i++;
            sum += i;
        }
        //test string concatenation
        System.out.println(5 + "10"); // print "510"
    }
}
