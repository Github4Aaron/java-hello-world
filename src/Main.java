import java.awt.*;
import java.util.Scanner;

// Java auto runs the main class and main function when it executes a program
public class Main {

    public static void main(String[] args) {


        //Creating instance of Scanner Class imported above
        // Scanner knows to look for input in "System.in"

        Scanner sc = new Scanner(System.in);

        // Next will grab the next input from System.in
        String userInput = sc.next();
        String upperCase = userInput.toUpperCase();

        System.out.println(upperCase);

       char firstCharacter = userInput.charAt(0);
       System.out.println(firstCharacter);

        System.out.println("Contains:  " + userInput.contains("enter"));
    }
}


