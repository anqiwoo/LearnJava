/**
 * Invariants:
 *  addLast: The next item we want to add will go to the posititon size.
 *  getLast: The item we want to return is in position (size - 1).
 *  size: The number of items in the list should size.
 * */

public class AList {
    private int[] items;
    private int size;

    /** Create an empty list. */
    public AList() {
        items = new int[100];
        size = 0;
    }

    /** Inserts x into the back of the list. */
    public void addLast(int x) {
        items[size] = x;
        size++;
    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return items[size - 1];
    }

    /** Deletes item from the back of the list and
     *  returns deleted item. */
    public int removeLast() {x
        int last = getLast();
        size--;
        return last;
    }

    /** Gets the item in the list (0 is the front). */
    public int get(int i) {
        if (i >= size) return 0;
        return items[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

}