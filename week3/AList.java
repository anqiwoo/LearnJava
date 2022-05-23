/**
 * Invariants:
 *  addLast: The next item we want to add will go to the position size.
 *  getLast: The item we want to return is in position (size - 1).
 *  size: The number of items in the list should size.
 * */

public class AList<Item> {
    private Item[] items;
    private int size;

    /** Create an empty list. */
    public AList() {
        items = (Item[]) new Object[100]; // Java does not allow us to create an array of generic objects due to an obscure issue with the way generics are implemented.
        size = 0;
    }

    /** Resizes the underlying items array to the target capacity. */
    private void resize(int capacity) {
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    /** Inserts x into the back of the list. */
    public void addLast(Item x) {
        if (size == items.length) {
            resize(size * 2);
        }
        items[size] = x;
        size++;
    }

    /** Returns the item from the back of the list. */
    public Item getLast() {
        return items[size - 1];
    }

    /** Deletes item from the back of the list and
     *  returns deleted item. */
    public Item removeLast() {
        Item last = getLast();
        items[size - 1] = null; // avoid loitering
        size--;
        return last;
    }

    /** Gets the item in the list (0 is the front). */
    public Item get(int i) {
        if (i >= size) return null;
        return items[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

}