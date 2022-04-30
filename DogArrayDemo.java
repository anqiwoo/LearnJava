public class DogArrayDemo {
    public static void main(String[] args) {
        /** Create an array of two dogs. */
        Dog[] dogs = new Dog[] {new Dog(10), new Dog(50)};
        // dogs[0] = new Dog(10);
        // dogs[1] = new Dog(50);

        dogs[0].makeNoise();
        dogs[1].makeNoise();
    }
}
