import java.util.Random;


public class Coin {

    // 'Public' -> method IS visible and can be called from other types
    // 'Void' -> the method has no return value
    // 'Static' ->  method is associated with a class, it can be called without creating an instance of class.
    public final static int HEADS = 0;
    public final static int TAILS = 1;

    // Keeps track what side is faceup.
    private int faceUp;

    // Constructor that allows us to start with faceUP
    public Coin() {
        flip();
    }

    public void flip() {
        Random rand = new Random();
        faceUp = rand.nextInt( 2);
    }

    public String getFaceUp() {
        if (faceUp == HEADS) {
            return "HEADS";
        } else if (faceUp == TAILS) {
            return "TAILS";
        } else {
            return "INVALID";
        }
    }
}
