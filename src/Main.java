import java.awt.*;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.concurrent.Future;
import java.util.Random;

// Java auto runs the main class and main function when it executes a program
public class Main {
    // Uses Math class from java.lang library which uses class method .pow (didn't have to create instance)
    public static void main(String[] args) {
     double power = Math.pow(5, 3);
     System.out.println(power);

     double squareRoots = Math.sqrt(64);
     System.out.println(squareRoots);

     Random rand = new Random();
     int randomNum = rand.nextInt();
     int randomNumWithBound = rand.nextInt(10);
        System.out.println(randomNum);
        System.out.println(randomNumWithBound);
    }
}