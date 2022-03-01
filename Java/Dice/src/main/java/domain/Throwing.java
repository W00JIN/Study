package domain;

import java.util.ArrayList;

public class Throwing {

    private String message = "";

    public Throwing(Dices dices) {
        ArrayList<Dice> diceArrayList = dices.getDices();
        for (int i = 0; i < diceArrayList.size(); i++) {
            String tmp = "주사위" + (i + 1) + " : " + diceArrayList.get(i).getDiceNumber() + "\n";
            message = message + tmp;
        }
    }

    public String getMessage() {
        return message;
    }
}
