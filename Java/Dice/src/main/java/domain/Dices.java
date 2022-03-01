package domain;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Dices {

    private ArrayList<Dice> dices = new ArrayList<>();

    public Dices(RandomNumbers randomNumber) {
        randomNumber.getRandomList().forEach(i -> dices.add(new Dice(i)));
    }

    public ArrayList<Dice> getDices() {
        return dices;
    }
}
