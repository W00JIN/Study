package domain;

import java.util.ArrayList;

public final class Dices {

    private static final ArrayList<Dice> dices = new ArrayList<>();

    public Dices(RandomNumbers randomNumber) {
        randomNumber.getRandomList()
            .forEach(i -> dices.add(new Dice(i)));
    }

    public static Dices createDices(RandomNumbers randomNumber) {
        return new Dices(randomNumber);
    }

    public ArrayList<Dice> getDices() {
        ArrayList<Dice> copyOfDices = dices;
        return copyOfDices;
    }
}
