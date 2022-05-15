class test {
    public static void main(String[] args) {
        short s = 1;
        int i = 2;
        // s = i; // spillage [Not Okay]
        i = s; // implicit widening [Okay]
    }
}
