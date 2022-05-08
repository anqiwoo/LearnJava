class IntList {
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

//    public static IntList incrList(IntList L, int x) {
//        /* Return an IntList identical to L, but with
//            all values incremented by x.
//            (Values in L cannot chang!)
//         */
//
//    }

//    public static IntList dincrList(IntList L, int x) {
//        /* Return an IntList identical to L, but with
//            all values incremented by x.
//            (Not use the keyword new)
//         */
//
//    }

    public static void dSquareList(IntList L){
        /* Square the given IntList destructively.
        * (The underlying IntList passed into the methods does get modified!)
        * */
        while (L != null) {
            L.first = L.first * L.first;
            L = L.rest;
        }
    }

    /** Both methods take in two IntLists, and concatenate them together.
     * So catenate(IntList A, IntList B) and dcatenate(IntList A, IntList B)
     * both result in an IntList which contains the elements of A followed by
     * the elements of B.
     *
     * The only difference between these two methods is that
     * dcatenate modifies the original IntList A (i.e. it’s destructive)
     * and catenate does not. */
    public static IntList catenate(IntList A, IntList B) {
        if (A.rest == null) {
            return new IntList(A.first, B);
        } else {
            return new IntList(A.first, catenate(A.rest, B));
        }
    }

    public static IntList dcatenate(IntList A, IntList B) {
        if (A.rest == null) {
            A.rest = B;
            return A;
        } else {
            return new IntList(A.first, dcatenate(A.rest, B));
        }
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

//        System.out.println(L.size());
//        System.out.println(L.iterativeSize());
        System.out.println("Square it!");
        dSquareList(L);
        System.out.println(L.get(0));
        System.out.println(L.get(1));
        System.out.println(L.get(2));

        // test the dcatenate method
        IntList a = new IntList(1, null);
        a = new IntList(2, a);
        IntList b = new IntList(3, null);
        b = new IntList(4, b);
        System.out.println(a.size()); // 2
        System.out.println(b.size()); // 2
        IntList c = dcatenate(a, b);
        System.out.println(c.size()); // 4
        System.out.println(a.size()); // 4: destructive!!!
        System.out.println(b.size()); // 2
        System.out.println("");

        // test the catenate method
        IntList d = new IntList(5, null);
        d = new IntList(6, d);
        IntList e = new IntList(7, null);
        e = new IntList(8, e);
        System.out.println(d.size()); // 2
        System.out.println(e.size()); // 2
        IntList f = catenate(d, e);
        System.out.println(f.size()); // 4
        System.out.println(d.size()); // 2: non-destructive!!!
        System.out.println(e.size()); // 2

    }
}
