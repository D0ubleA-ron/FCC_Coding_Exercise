public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();
        System.out.println(dice.getValue());
        dice.rollDice();
        System.out.println(dice.getValue());
    }
}