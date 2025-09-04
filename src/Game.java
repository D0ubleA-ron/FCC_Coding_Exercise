import java.util.ArrayList;
import java.util.List;

public class Game {
    private int score;
    private List<Dice> diceList;

    public Game(int diceAmount){
        this.score = 0;
        this.diceList = new ArrayList<>();
        for (int i = 0; i < diceAmount; i++){
            this.diceList.add(new Dice());
        }
    }

    public int getScore(){
        return this.score;
    }

    private List<Dice> getDiceList(){
        return this.diceList;
    }

    private boolean hasThrees(){
        for (Dice d : getDiceList()){
            if (d.getValue() == 3){
                return true;
            }
        }
        return false;
    }

    private void removeThrees(){
        getDiceList().removeIf(d -> d.getValue() == 3);
    }

    private Dice getLowestDice(){
        Dice lowestDice = getDiceList().get(0);
        for (Dice d : getDiceList()){
            if (d.getValue() < lowestDice.getValue()){
                lowestDice = d;
            }
        }
        return lowestDice;
    }

    private void removeSingleDice(Dice d){
        getDiceList().remove(d);
    }

    private void rollAllDice(){
        for (Dice d : getDiceList()){
            d.rollDice();
        }
    }

    private boolean hasDice(){
        if (getDiceList().size() == 0){
            return false;
        }
        return true;
    }

    private void addValuetoScore(int value){
        this.score = this.score + value;
    }

    public void runGame(){
        while (hasDice()){
            rollAllDice();
            if(hasThrees()){
                removeThrees();
            }
            else{
                Dice lowestDice = getLowestDice();
                addValuetoScore(lowestDice.getValue());
                removeSingleDice(lowestDice);
            }
        }
    }



}
