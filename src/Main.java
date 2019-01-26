import java.awt.*;
import java.util.Scanner;
import java.util.Arrays;

// Java auto runs the main class and main function when it executes a program
public class Main {

    public static void main(String[] args) {

            Dog myDog = new Dog("brown",
                    "German Shepherd",
                    false);

            if (myDog.doesHeBite == false)
                {System.out.println("My dog does NOT bite!"); }
            else {System.out.println("My does DOES bite...watch out!");}


            System.out.println("The color of my dog is " + myDog.dogColor);
            System.out.println("The breed of my dog is " + myDog.dogBreed);

    }
}


