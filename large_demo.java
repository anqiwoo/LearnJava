
/** Demonstrate the creation of a method in Java */
class LargeDemo {
    public static int larger(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }

    public static int max(int[] m) {
        // return the max value in an int array.
        int maximum = m[0];
        for (int i = 1; i < m.length; i++) {
            if (maximum < m[i]) {
                maximum = m[i];
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        System.out.println(larger(-1, 1));
        int[] numbers = new int[] { 9, 2, 15, 2, 22, 10, 6 };
        System.out.println(max(numbers));
    }
}

/**
 * 1. Functions must be declared as part of a class in Java.
 * A function that is part of a class is called a 'method'.
 * So, in Java, all functions are methods.
 * 2. To define a function in Java, we use 'public static'.
 * We will see alternative ways of defining functions/methods later.
 * 3. All parameters of a function must have a declared type, and the return
 * value of the function must have a declared type.
 * 4. Functions in Java return only one value!
 * 5. We call the "public static int larger (int x, int y)" as the method's
 * signature, as it lists the parameters, return types, name, and any modifiers.
 * Here our modifiers are "public" and "static".
 */