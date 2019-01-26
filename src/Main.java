import java.awt.*;
import java.util.Scanner;
import java.util.Arrays;

// Java auto runs the main class and main function when it executes a program
public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter your age.");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        if (age >= 0 && age <= 5) {
            System.out.println("Baby");
        } else if (age >= 6 && age <= 11) {
            System.out.println("kid");
        } else if (age >= 12 && age <= 18) {
            System.out.println("teen");
        } else if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Invalid");

        }
        System.out.println("Thanks for using this program!");


    }
}