package LearnJava;

/** Demonstrate Java's static typing feature */
public class HelloNumbers {
    /** Print out 0-9 numbers */
    public static void main(String[] args) {
        int x = 0;
        while (x < 10) {
            System.out.println(x);
            x = x + 1;
        }
    }
}

/*
 * 1. Before Java variables can be used, they must be declared with a specific
 * type.
 * 2. Java variable types can never change.
 * 3. Types are verified before the code even runs!!!
 * 
 * Good about the static typing feature:
 * 1. Catches certain types of errors, making it easier on the programmer to
 * debug their code
 * 2. Type errors can (almost) never occur on the end user's computer.
 * 3. Shows the type all the time, making it easier to read and reason about
 * code.
 * 4. Code can run more efficiently, e.g. no need to do expensive runtime type
 * checks.
 * 
 * Bad about the static typing feature:
 * 1. Code is more verbose.
 * 2. Code is less general(like the type constraint). There is a way around this
 * in Java(generics).
 */