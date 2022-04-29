public class HelloNumbers {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i < 10) {
            System.out.println(sum);
            i++;
            sum += i;
        }
    }
}
