class ArrayEg {
    public static void main(String[] args) {
        // Cannot define dimension expressions when an array initializer is provided
        int[] a = new int[] { 1, 2, 4, 8 };
        System.out.println(a);
        System.out.println(a.length);
        System.out.println(a[0]);
    }
}

/**
 * 1. Array is like lists in Python.
 * 2. Array is an object containing a numbered list of variables, indexing from
 * zero.
 * 3. You can access an array's length through array.length.
 */
