package domain;

import java.util.Random;

public class RandomNumber {

    private static final Random random = new Random();

    public int generate(int bound) {
        return random.nextInt(bound + 1);
    }
}
