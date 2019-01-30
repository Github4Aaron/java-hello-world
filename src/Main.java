import java.awt.*;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.concurrent.Future;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        //Creation of Dice instance
        Dice dice = new Dice();
        System.out.println(dice.roll());
        System.out.println(dice.roll());
    }

}