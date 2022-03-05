package domain;

import java.util.ArrayList;

public class DicesInfo {

    private static final String DICE_TEXT = "주사위";
    private static final String COLON = " : ";
    private static final String NEW_LINE = "\n";
    private String dicesInfo = "";

    public DicesInfo(Dices dices) {
        ArrayList<Dice> diceArrayList = dices.getDices();
        for (int i = 0; i < diceArrayList.size(); i++) {
            String tmp = DICE_TEXT + (i + 1) + COLON + diceArrayList.get(i).getDiceNumber() + NEW_LINE;
            dicesInfo = dicesInfo + tmp;
        }
    }

    public String getMessage() {
        return dicesInfo;
    }
}
