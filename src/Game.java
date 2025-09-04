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


}
