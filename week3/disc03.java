class disc03 {
    /** Inserts an int item into an int[] arr at the given position. */
    public static int[] insert(int[] arr, int item, int position) {
        /* Solution 1 */
        // int[] result = new int[arr.length + 1];
        // if (position > result.length) {
        //     System.arraycopy(arr, 0, result, 0, arr.length);
        //     result[result.length - 1] = item;
        // } else {
        //     System.arraycopy(arr, 0, result, 0, position);
        //     result[position] = item;
        //     System.arraycopy(arr, position, result, position + 1, arr.length - position);
        // }
        // return result;

        /* Solution 2 */
        int[] result = new int[arr.length + 1];
        position = Math.min(position, arr.length);
        for (int i = 0; i < position; i++) {
            result[i] = arr[i];
        }
        result[position] = item;
        for (int i = position; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }
        return result;
    }

    /** Reverses the items in arr destructively. */
    public static void reverse(int[] arr) {
        /* Solution 1 */
        // // make a copy of arr
        // int[] p = new int[arr.length];
        // System.arraycopy(arr, 0, p, 0, arr.length);
        // // reverse the arr destructively
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = p[arr.length - 1 - i];
        // }

        /* Solution 2 */
        for (int i = 0; i < arr.length; i++) {
            int j = arr.length - 1 - i;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    /** Replaces the number at index i with arr[i] copies of itself non-destructively.
     *  For this question assume that all elements of the array are positive. */
    public static int[] replicate(int[] arr) {
        // get the sum of the all elements in the arr
        int new_size = 0;
        for (int item : arr) {
            new_size += item;
        }
        // create a new array with the size of the calculated sum
        int[] result = new int[new_size];
        // loop through the origianl arr and fill the new array
        int i = 0;
        for (int item : arr) {
            for (int counter = 0; counter < item; counter++) {
                result[i] = item;
                i++;
            }
        }
        // return the new array
        return result;
    }

    public static void main(String[] args) {
        // test insert()
        int[] arr = new int[]{1, 2};
        int[] result = insert(arr, 3, 0);
        for (int i : result) {
            System.out.println(i);
        }
        System.out.println(" ");

        // test reverse()
        reverse(result);
        for (int i : result) {
            System.out.println(i);
        }
        System.out.println(" ");

        // test replicate()
        int[] res = replicate(result);
        for (int i : res) {
            System.out.println(i);
        }
    }

}
