public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    public int size() {
        /* Return the size of the IntList in a recursive way. */
        if (rest == null) {
            return 1;
        } else {
            return 1 + this.rest.size();
        }
    }

    public int iterativeSize() {
        /* Return the size of the IntList in an iterative way. */
        int totalSize = 0;
        IntList p = this;
        while (p != null) {
            totalSize++;
            p = p.rest;
        }
        return totalSize;
    }

    public int get(int i) {
        /* Return the ith item in the IntList.
            For simplicity, OK to assume the item exists.
        */
        IntList p = this;
        int count = 0;
        while (count < i) {
            count += 1;
            p = p.rest;
        }
        return p.first;
    }

    public int recursiveGet(int i) {
        /* Return the ith item in the IntList.
            For simplicity, OK to assume the item exists.
        */
        if (i == 0) {
            return first;
        } else {
            return rest.recursiveGet(i - 1);
        }
    }

    public static IntList incrList(IntList L, int x) {
        /* Return an IntList identical to L, but with
            all values incremented by x.
            (Values in L cannot chang!)
         */

    }

    public static IntList dincrList(IntList L, int x) {
        /* Return an IntList identical to L, but with
            all values incremented by x.
            (Not use the keyword new)
         */

    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L = new IntList(10, L);
        L = new IntList(15, L);

        System.out.println(L.recursiveGet(0));
        System.out.println(L.recursiveGet(1));
        System.out.println(L.recursiveGet(2));

        System.out.println(L.get(0));
        System.out.println(L.get(1));
        System.out.println(L.get(2));

        System.out.println(L.size());
        System.out.println(L.iterativeSize());
    }
}
