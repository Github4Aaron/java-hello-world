// Java auto runs the main class and main function when it executes a program
public class Main {
    //  "public" - this function can be accessed outside of this class;
    //  "static"-VM makes call to the main method there is no object existing for the class being called therefore it
    //  has to have static method to allow invocation from class.
    //  "void" - return type does not return any value
    public static void main(String[] args) {

        System.out.println("hello world");
    }
}


// System is a class; out is static is static property, and println is function