import java.awt.*;

public class Car {

    // DATA TYPES: int -> 1,2,3; double -> 2.5; String -> "apd 345"; Color -> abstract window toolkit; Boolean -> true/false;

    double averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailightsWorking;

    // Constructor method used to build instances of the class with inputs to initialize car with.
    // 'this' keyword is reference to new instance being created.

    public Car(double inputAverageMPH,
               String inputLicensePlate,
               Color inputPaintColor,
               boolean inputAreTailightsWorking) {
        this.averageMilesPerGallon = inputAverageMPH;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTailightsWorking = inputAreTailightsWorking;
    }

    public void changePaintColor(Color newPaintColor) {
        this.paintColor = newPaintColor;
    }

}
