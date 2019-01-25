import java.awt.*;
import java.util.Scanner;
import java.util.Arrays;

// Java auto runs the main class and main function when it executes a program
public class Main {

    public static void main(String[] args) {

            //Setting the size of the array, and cannot be changed
            int[] numbers = new int[5];

            numbers[0] = 31;
            numbers[1] = 45;
            numbers[2] = 27;
            numbers[3] = 43;
            numbers[4] = 13;

            Arrays.sort(numbers);
            System.out.println(numbers); // This will print out memory address
            System.out.println(Arrays.toString(numbers));  // This will print out numbers in their order

            // Below declares, allocates memory, and initializes int
            int[] numbers2 = {22, 34, 45, 56, 21};

            System.out.println(numbers[0]);
            System.out.println(numbers2[1]);

            String[] myFavoriteCandyBars = {"twix", "hersheys", "payday", "reeses", "snickers"};
            System.out.println(myFavoriteCandyBars[3]);

    }
}


