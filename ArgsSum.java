public class ArgsSum {
    public static void main(String[] args) {
        int N = args.length;
        int i = 0;
        int sum = 0;
        while (i < N) {
            sum += Integer.parseInt(args[i]);
            i++;
        }
        System.out.println(sum);
    }
}

/**
 * 1. public static void main(String[] args)
 *      - public: So far, all of our methods start with this keyword.
 *      - static: The method is a static method and not associated with any particular instance.
 *      - void: The method has no return type.
 *      - main: The name of the method.
 *      - String[] args: This is a parameter that is passed to the main method. (An Array of Strings)
 * */
