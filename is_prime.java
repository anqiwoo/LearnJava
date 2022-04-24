public class IsPrime {
    public static boolean isPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 10;
        int m = 5;
        System.out.println(isPrime(n));
        System.out.println(isPrime(m));
    }
}

/**
 * 1. Boolean values in Java are true and false, not True and False.
 * 2. for (initialization; loop condition; next)
 * 3. while (loop condition)
 */