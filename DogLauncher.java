public class DogLauncher {
    public static void main(String[] args) {
        // Dog d = new Dog(40);
        // d.weight = 40;
        // d.makeNoise();
        Dog d1 = new Dog(30);
        Dog d2 = new Dog(14);
        Dog d = Dog.maxDog(d1, d2);
        d.makeNoise();

        // test the static variable
        System.out.println(Dog.color);
    }
}

/**
 * 1. A class that uses another class is sometimes called a "client" of that class, i.e. DogLauncher is a client of Dog.
 *      Neither of the two techniques is better:
        dding a main method to Dog may be better in some situations,
        and creating a client class like DogLauncher may be better in others.
 * 2. An Object in Java is an instance of any class.
 * 3. The Dog class has its own variables, also known as instance variables or non-static variables.
 *      These must be declared inside the class, unlike languages like Python or Matlab,
 *      where new variables can be added at runtime.
 * 4. The method that we created in the Dog class did not have the static keyword.
 *      We call such methods instance methods or non-static methods.
 * 5. To call the makeNoise method, we had to first instantiate a Dog
 *      using the new keyword, and then make a specific Dog bark.
 *      In other words, we called d.makeNoise() instead of Dog.makeNoise().
 * 6. Once an object has been instantiated,
 *      it can be assigned to a declared variable of the appropriate type,
 *      e.g. d = new Dog();
 * 7. Variables and methods of a class are also called members of a class.
 * 8. Members of a class are accessed using dot notation.
 * */
