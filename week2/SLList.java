/** An SLList is a list of integers,
 * which hides the terrible truth
 * of the nakedness within.
 * (The SLList hides the detail that
 * there exists a null link from the user. )
 *
 * 1. Private variables and methods can
 * only be accessed by code inside the
 * same .java file
 *
 * 2. In large software engineering projects,
 * the private keyword is an invaluable signal
 * that certain pieces of code should
 * be ignored (and thus need not be understood)
 * by the end user.
 *
 * 3. Likewise, the public keyword should be
 * thought of as a declaration that
 * a method is available and
 * will work forever exactly as it does now
 * (for the sake of backward compatibility).
 *
 * 4. When you create a public member
 * (i.e. method or variable), be careful,
 * because you're effectively committing to
 * supporting that member's behavior
 * exactly as it is now, forever.
 *
 * 5. Having a nested class has no meaningful
 * effect on code performance, and is simply
 * a tool for keeping code organized.
 *
 * 6. The position of the nested class does
 * not matter but there is a convention to
 * put it in the front.
 *
 * 7. If the nested class has no need to
 * use any of the instance methods or variables
 * of SLList, you may declare the nested class
 * static【NeverLookOutwards!!!】, as follows.
 * Declaring a nested class as static means that methods inside the
 * static class can not access any of the members
 * of the enclosing class. In this case, it means
 * that no method in IntNode would be able to
 * access first, addFirst, or getFirst, etc.
 * (This saves a bit of memory,
 * because each IntNode no longer needs to
 * keep track of how to
 * access its enclosing SLList.)
 *
 * 8. An invariant is a fact about a data structure
 * that is guaranteed to be true (assuming there are no bugs in your code).
 *
 * A SLList with a sentinel node has at least the following invariants:
 *  - The sentinel reference always points to a sentinel node.
 *  - The front item (if it exists), is always at sentinel.next.item.
 *  - The size variable is always the total number of items that have been added.
 * Invariants make it easier to reason about code,
 * and also give you specific goals to strive for in making sure your code works.
 * */
public class SLList {
    /** Nested class example:
     * the IntNode is really just a supporting character in the story of SLList.*/
    private static class IntNode {
        private int item;
        private IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    /* The first item (if it exists) is at sentinel.next.item. */
    private IntNode sentinel;
    private int size;

    /** Returns an empfty list.
     * (A cleaner, though less obvious solution,
     * is to make it so that all SLLists are the "same",
     * even if they are empty. We can do this by
     * creating a special node that is always there,
     * which we will call a sentinel node. The sentinel
     * node will hold a value, which we won't care about.)*/
    public SLList() {
        sentinel = new IntNode(85, null);
        size = 0;
    }

    /** Returns a list that starts from sentinel.next. */
    public SLList(int x) {
        sentinel = new IntNode(85, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    /** Add x to the front of the list. */
    public void addFirst(int x) {
        size++;
        sentinel.next = new IntNode(x, sentinel.next);
    }

    /** Returns the first item in the list. */
    public int getFirst() {
        return sentinel.next.item;
    }

    /** Adds an item to the end of the list. */
    public void addLast(int x) {
        size++;
        IntNode p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    public int getLast() {
        IntNode p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        return p.item;
    }

    /** Inserts an integer x at the given position.
     *   If position is after the end of the list,
     *      insert the new node at the end. */
    public void insert(int x, int position) {
        if (position >= size) {
            addLast(x);
        } else {
            size++;
            IntNode p = sentinel;
            while (position != 0) {
                p = p.next;
                position--;
            }
            p.next = new IntNode(x, p.next);
        }
    }

    /** Reverses the elements iteratively and destructively. */
    public void reverse() {
        // If we only have one or zero element, we do nothing.
        if (size <= 1) {
            return;
        }
        IntNode first = sentinel.next;
        IntNode second = sentinel.next.next;
        sentinel.next = null;
        first.next = null;
        // reconnect between two IntNode
        while (second != null) {
            // save the ref. to the remaining list elements
            IntNode third = second.next;
            // redirect the current IntNode to its previous IntNode
            second.next = first;
            // move one step ahead along the original remaining list elements
            first = second;
            second = third;
        }
        // don't forget our special sentinel!!!
        sentinel.next = first;
    }

    /** Helper method fot reverseRec() */
    private IntNode reverseRecHelper(IntNode first, IntNode second) {
        if (second == null) {
            return first;
        } else {
            IntNode third = second.next;
            second.next = first;
            return reverseRecHelper(second, third);
        }
    }
    /** Reverses the elements recursively and destructively. */
    public void reverseRec() {
        if (size <= 1) {
            return;
        } else {
            IntNode first = sentinel.next;
            IntNode second = sentinel.next.next;
            first.next = null;
            sentinel.next = reverseRecHelper(first, second);
        }
    }

    // /** Gets the size of the list. */
    // public int size() {
    //     IntNode p = first;
    //     int total = 0;
    //     while (p != null) {
    //         total++;
    //         p = p.next;
    //     }
    //     return total;
    // }

    /** Returns the size of the list that starts at IntNode p.
     * ( Instead, we'll use a common pattern that
     * is used with middleman classes like SLList
     * -- we'll create a private helper method that
     * interacts with the underlying
     * naked recursive data structure.)*/
    // private static int size(IntNode p) {
    //     if (p.next == null) {
    //         return 1;
    //     }

    //     return 1 + size(p.next);
    // }

    /** Here, we have two methods, both named size.
     * This is allowed in Java, since they
     * have different parameters (different number of parameters, different paramter types, or both).
     * We say that two methods with the same name
     * but different signatures are overloaded.  */
    public int size() {
        // return size(first);
        return size;
    }

    public static void main(String[] args) {
        /* Creates a list of one integer, namely 10 */
        SLList L = new SLList(15);
        L.addLast(1);
        L.addFirst(10);
        L.addFirst(5);
        System.out.println(L.getFirst());
        System.out.println(L.getLast());
        System.out.println(L.size());
        L.reverse();
        System.out.println(L.getFirst());
        System.out.println(L.getLast());
        L.reverseRec();
        System.out.println(L.getFirst());
        System.out.println(L.getLast());
    }
}
