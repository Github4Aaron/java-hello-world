import java.util.Random;

public class Dice {
    // Instance of Random class is a property
    Random rand;

    // Constructor of Dice Instance
    public Dice() {
        this.rand = new Random();
    }

    // Roll method and currentRoll will always be between 1-6
    public int roll() {
        int currentRoll = this.rand.nextInt(6) + 1;
        return currentRoll;
    }
}