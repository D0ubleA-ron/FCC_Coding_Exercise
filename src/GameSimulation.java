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

    private int[] getScoreStorage() {
        return scoreStorage;
    }

    public void printHeader(){
        System.out.println("Number of simulations was " + getSimAmount() + " using " + getDiceAmount() + " dice.");
    }

    private void addScoretoStore(int score){
        this.scoreStorage[score] = this.scoreStorage[score] + 1;
    }

    private void printProbabilities(){
        for(int i = 0; i < scoreStorage.length; i++){
            System.out.println("Total " + i + " occurs " + ((float) getScoreStorage()[i] / getSimAmount()) + " occured " + (float)getScoreStorage()[i] + " times.");
        }
    }

    private void printTimeTaken(long start, long end){
        long timeTaken = end - start;
        double seconds = (double) timeTaken / 1000.0;
        System.out.println("Total simulation took " + seconds + " seconds.");
    }

    private void printReport(long start, long end){
        printHeader();
        printProbabilities();
        printTimeTaken(start, end);
    }

    public void simulateGames(){
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < getSimAmount(); i++){
            Game simGame = new Game(getDiceAmount());
            simGame.runGame();
            addScoretoStore(simGame.getScore());
        }
        long endTime = System.currentTimeMillis();
        printReport(startTime, endTime);
    }



}
