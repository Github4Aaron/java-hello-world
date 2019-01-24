import java.awt.*;

// Java auto runs the main class and main function when it executes a program
public class Main {

    public static void main(String[] args) {

        System.out.println("hello world");

        // Calls the constructor method in the car class

       Car myCar = new Car(25.5,
                            "IBIE4",
                            Color.BLUE,
                            true);

       Car aaronsCar = new Car(13.3,
               "45378B",
               Color.RED,
               false);

       System.out.println("My car's license plate is" + myCar.licensePlate);
       System.out.println("Aarons car's license plate is   " + aaronsCar.licensePlate);

       System.out.println(myCar.paintColor.toString());
       myCar.changePaintColor(Color.PINK);
        System.out.println(myCar.paintColor.toString());
    }
}


