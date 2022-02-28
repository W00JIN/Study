package domain;

import java.util.Random;

public class Dice {

    private final int number;

    public Dice() {
        Random random = new Random();
        number = random.nextInt(6) + 1;
    }

    public int getDiceNumber() {
        return number;
    }

}
