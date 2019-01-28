import java.awt.*;
import java.util.Scanner;
import java.util.Arrays;

// Java auto runs the main class and main function when it executes a program
public class Main {

    public static void main(String[] args) {

      System.out.println("Do - While Loop");
      int y = 3;
      do  {
          System.out.println("Current y " + y);
          y = y - 1;
      } while (y > 0);
      System.out.println("Final y " + y);
      System.out.println();
    }
}