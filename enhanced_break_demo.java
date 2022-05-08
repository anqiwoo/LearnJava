class EnhancedForBreakDemo {
    public static void main(String[] args) {
        // Print out identity in an array three times and only one times for any
        // identity containing "cat"
        String[] a = { "kitty", "jenny", "jack", "toy", "cat" };

        for (String s : a) {
            for (int j = 0; j < 3; j++) {
                System.out.println(s);
                if (s.contains("cat")) {
                    break;
                }
            }
        }
    }
}

/**
 * 1. String in Java should have double quotes!
 * 2. Don't forget the parenthesis in the if statement & for/while/do while
 * loop.
 */