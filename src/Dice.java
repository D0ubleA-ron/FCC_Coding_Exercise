import java.util.Random;

public class Dice {
    private int value;
    private Random rand;

    public Dice(){
        this.value = 1;
        this.rand = new Random();
    }

    public int getValue(){
        return this.value;
    }

    public void rollDice(){
        this.value = this.rand.nextInt(6) + 1;
    }

}
