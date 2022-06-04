import java.util.*;

public class ArrayListMagnet {
    public static void printAt(ArrayList<String> a1) {
        for (String element : a1) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add(0, "zero");
        a.add(1, "one");
        if (a.contains("two")) {
            a.add("2.2");
        }
        a.add(2, "two");
        a.add(3, "three");
        printAt(a);
        if (a.contains("three")) {
            a.add("four");
        }
        a.remove(2);
        printAt(a);
        if (a.indexOf("four") != 4) {
            a.add(4, "4.2");
        }
        printAt(a);
        printAt(a);
    }
}
