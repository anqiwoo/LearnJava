/** Deque (usually pronounced like “deck”) is an irregular acronym of double-ended queue.
 * Double-ended queues are sequence containers with dynamic sizes that can be expanded or
 * contracted on both ends (either its front or its back).
 *
 * Do not maintain references to items that are no longer in the deque.
 * */
public class LinkedListDeque<T> {
    public class LinkedList {
        private T item;
        private LinkedList prev;
        private LinkedList next;

        public LinkedList(T i, LinkedList p, LinkedList n) {
            item = i;
            prev = p;
            next = n;
        }
    }

    private int size;
    public LinkedList sentinel;

    /* Creates an empty linked list deque. */
    public LinkedListDeque() {
        sentinel = new LinkedList(null, sentinel, sentinel);
        size = 0;
    }

    /* Normal Linked list deque constructor. */
    public LinkedListDeque(T x) {
        sentinel = new LinkedList(null, sentinel, sentinel);
        sentinel.next = new LinkedList(x, sentinel, sentinel);
        sentinel.prev = sentinel.next;
        size++;
    }

    /* Creates a deep copy of other.
    * Creating a deep copy means that you create an entirely new LinkedListDeque,
    * with the exact same items as other. However, they should be different objects.
    *
    * A solution for this copy constructor is available at https://www.youtube.com/watch?v=JNroRiEG7U4
    *  */
    public LinkedListDeque(LinkedListDeque other) {
        sentinel = new LinkedList(null, sentinel, sentinel);
        size = 0;

        for (int i = 0; i < other.size(); i++) {
            addLast((T) other.get(i));
        }
    }

    /* Adds an item of type T to the front of the deque. */
    public void addFirst(T x) {
        LinkedList p = new LinkedList(x, sentinel, sentinel.next);
        sentinel.next.prev = p;
        sentinel.next = p;
        size++;
    }

    /* Adds an item of type T to the back of the deque. */
    public void addLast(T x) {
        LinkedList p = new LinkedList(x, sentinel.prev, sentinel);
        sentinel.prev.next = p;
        sentinel.prev = p;
        size++;
    }

    /* Returns true if deque is empty, false otherwise. */
    public boolean isEmpty() {
        return size == 0;
    }

    /* Returns the number of items in the deque.
    * size must take constant time. */
    public int size() {
        return size;
    }

    /* Print the items in the deque from first to last,
    * separated by a space. Ended with a new line. */
    public void printDeque() {
        LinkedList p = sentinel;
        while (p.next != sentinel) {
            System.out.print(p.next.item);
            System.out.print(" ");
            p = p.next;
        }
        System.out.println(" ");
    }

    /* Removes and returns the item at the front of the deque.
    * If no such item exists, returns null. */
    public T removeFirst() {
        if (size == 0) {
            return null;
        } else {
            T first =  sentinel.next.item;
            LinkedList p = sentinel.next.next;
            sentinel.next.next.prev = sentinel;
            sentinel.next = p;
            size--;
            return first;
        }
    }

    /* Removes and returns the item at the back of the deque.
    * If no such item exists, returns null. */
    public T removeLast() {
        if (size == 0) {
            return null;
        } else {
            T last = sentinel.prev.item;
            LinkedList p = sentinel.prev.prev;
            sentinel.prev.prev.next = sentinel;
            sentinel.prev = p;
            size--;
            return last;
        }
    }

    /* Gets the item at the given index, where 0 is the front,
    * 1 is the next item, and so forth.
    * If no such item exists, returns null.
    * Must not alter the deque.
    * Use iteration. */
    public T get(int index) {
        LinkedList p = sentinel;
        while (p.next != sentinel && index >= 0) {
            if (index == 0) {
                return p.next.item;
            }
            p = p.next;
            index--;
        }
        return null;
    }

    private T getRecursive(LinkedList p, int idx) {
        if (idx == 0) {
            return p.item;
        } else {
            return getRecursive(p.next, idx-1);
        }
    }
    /* Same as get, but uses recursion.
    * Assume that the input index >= 0.*/
    public T getRecursive(int index) {
        if (index > (size - 1)) {
            return null;
        } else {
            return getRecursive(sentinel.next, index-1);
        }
    }
}