import java.util.Random;

public class Dice {
    // Instance of Random class is a property / attribute of class
    Random rand;
    int previousRoll = -1;

    // Constructor of Dice Instance
    public Dice() {
        this.rand = new Random();
    }

    // Roll method and currentRoll will always be between 1-6
    public int roll() {
        int currentRoll = this.rand.nextInt(6) + 1;
        // Once currentRoll is returned it becomes the previousRoll
        this.previousRoll = currentRoll;
        return currentRoll;
    }
}