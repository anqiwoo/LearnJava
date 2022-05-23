class SLList1<purr> {
    private class StuffNode {
        private purr item;
        private StuffNode next;

        public StuffNode(purr i, StuffNode n) {
            item = i;
            next = n;
        }
    }

    private StuffNode first;
    private int size;


    /** Returns a list that starts from sentinel.next. */
    public SLList1(purr x) {
        first = new StuffNode(x, null);
        size = 1;
    }

    /** Add x to the front of the list. */
    public void addFirst(purr x) {
        size++;
        first = new StuffNode(x, first);
    }

    /** Returns the first item in the list. */
    public purr getFirst() {
        return first.item;
    }

    /** Adds an item to the end of the list. */
    public void addLast(purr x) {
        size++;
        StuffNode p = first;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new StuffNode(x, null);
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        SLList1<Integer> L = new SLList1<>(15);
        L.addLast(1);
        L.addFirst(10);
        L.addFirst(5);
        System.out.println(L.getFirst());
        System.out.println(L.size());

        SLList1<String> SL = new SLList1<>("Hello");
        SL.addLast("World!");
        System.out.println(SL.getFirst());
        System.out.println(SL.size());
    }
}
