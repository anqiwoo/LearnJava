class DrawTriangle {
    public static void drawTriangle(int N) {
        // print out N lines asterisk triangles
        int row = 1;
        while (row <= N) {
            int col = 1;
            while (col < row) {
                System.out.print('*');
                col++;
            }
            System.out.println('*');
            row++;
        }
    }

    public static void main(String[] args) {
        drawTriangle(5);
        drawTriangle(10);
    }
}

/**
 * 1. System.out.print() method does not include the automatic newline, compared
 * with the System.out.println() method.
 * 
 */