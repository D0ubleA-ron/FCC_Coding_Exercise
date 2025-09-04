public class Main {
    public static void main(String[] args) {
        //GameSimulation left parameter for diceAmount, right for simAmount
        GameSimulation sim = new GameSimulation(5, 10000);
        sim.simulateGames();
    }
}