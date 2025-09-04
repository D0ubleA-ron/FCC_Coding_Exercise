public class GameSimulation {
    private int diceAmount;;
    private int simAmount;
    private int[] scoreStorage;

    public GameSimulation(int diceAmount, int simAmount) {
        this.diceAmount = diceAmount;
        this.simAmount = simAmount;

        //maxscore is if you get 6 for all rolls, 6 * 6 with possibility of 0 because all 3s means 37 possibilities
        this.scoreStorage = new int[diceAmount * 6 + 1];
    }

    private int getDiceAmount() {
        return diceAmount;
    }

    private int getSimAmount() {
        return simAmount;
    }

    public void printHeader(){
        System.out.println("Number of simulations was " + getSimAmount() + " using " + getDiceAmount() + " dice.");
    }
}
