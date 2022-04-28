public class LeapYear {
    public static boolean isLeapYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.print(isLeapYear(2001));
    }
}