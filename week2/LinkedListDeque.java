/** Deque (usually pronounced like “deck”) is an irregular acronym of double-ended queue.
 * Double-ended queues are sequence containers with dynamic sizes that can be expanded or
 * contracted on both ends (either its front or its back).
 *
 * Do not maintain references to items that are no longer in the deque.
 * */
public class LinkedListDeque<T> {
    public int size;
    public T item;
    public LinkedListDeque sentinel;

    private class LinkedList(T item, LinkedList prev, LinkedList next) {

    }

    /* Creates an empty linked list deque. */
    public LinkedListDeque() {

    }

    /* Normal Linked list deque constructor. */
    public LinkedListDeque(T item) {

        sentinel = new LinkedList(85, null);
        sentinel
    }

    /* Creates a deep copy of other.
    * Creating a deep copy means that you create an entirely new LinkedListDeque,
    * with the exact same items as other. However, they should be different objects.
    *
    * A solution for this copy constructor is available at https://www.youtube.com/watch?v=JNroRiEG7U4
    *  */
    public LinkedListDeque(LinkedListDeque other) {

    }

    /* Adds an item of type T to the front of the deque. */
    public void addFirst(T item) {

    }

    /* Adds an item of type T to the back of the deque. */
    public void addLast(T item) {

    }

    /* Returns true if deque is empty, false otherwise. */
    public boolean isEmpty() {

    }

    /* Returns the number of items in the deque.
    * size must take constant time. */
    public int size() {

    }

    /* Print the items in the deque from first to last,
    * separated by a space. Ended with a new line. */
    public void printDeque() {

    }

    /* Removes and returns the item at the front of the deque.
    * If no such item exists, returns null. */
    public T removeFirst() {

    }

    /* Removes and returns the item at the back of the deque.
    * If no such item exists, returns null. */
    public T removeLast() {

    }

    /* Gets the item at the given index, where 0 is the front,
    * 1 is the next item, and so forth.
    * If no such item exists, returns null.
    * Must not alter the deque.
    * Use iteration. */
    public T get(int index) {

    }

    /* Same as get, but uses recursion. */
    public T getRecursive(int index)
}