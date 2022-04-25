public class BreakContinue {
    public static void windowPosSum(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                continue;
            }
            for (int j = i + 1; j <= i + n; j++) {
                if (j >= a.length) {
                    break;
                }
                a[i] += a[j];
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, -3, 4, 5, 4 };
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}

/**
 * 1. In Java, the for keyword has the syntax: for (initialization; termination;
 * increment) {statement;}
 * 2. The continue statement skips the rest of the current iteration of the
 * loop, effectively jumping straight to the increment condition.
 * 3. By contrast, the break keyword completely terminates the innermost loop
 * when it is called.
 */