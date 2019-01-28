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

        Coin c = new Coin(Coin.HEADS);
        System.out.println("Initial Value is " + c.getFaceUp());
        for (int i = 0; i < 10; i++) {
            c.flip();
            System.out.println("After flip: " + c.getFaceUp());
        }
    }
}