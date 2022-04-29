
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

/*
 * 1. All code in Java must be part of a class.
 * 2. Classes ara defined by public class CLASSNAME.
 * 3. We delimit the beginning and end of segments of code using { and }.
 * Curly braces are very important in Java!
 * Unlike Python, statements are grouped by braces, and NOT by indentation.
 * 4. All statements in Java must end in a semi-colon.
 * 5. For code to run, we need public static void main(String[] args){}.
 * 6. One of the most important features of Java is that
        all variables and expressions have a so-called static type.
        Java variables can contain values of that type, and only that type.
        Furthermore, the type of a variable can never change.
        【静态类型语言Static Typing是编译期间或运行前做数据类型检查，编写代码时要明确变量数据类型；
         动态类型语言Dynamic Typing是运行时做数据类型检查，编写代码时不必明确变量数据类型】
    To summarize, static typing has the following advantages:
     - The compiler ensures that all types are compatible, making it easier for the programmer to debug their code.
     - Since the code is guaranteed to be free of type errors, users of your compiled programs will never run into type errors. For example, Android apps are written in Java, and are typically distributed only as .class files, i.e. in a compiled format. As a result, such applications should never crash due to a type error since they have already been checked by the compiler.
     - Every variable, parameter, and function has a declared type, making it easier for a programmer to understand and reason about code.

    However, we'll see that static typing comes with disadvantages, to be discussed in a later chapter.

 */
