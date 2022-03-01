package domain;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class RandomNumbers {

    private RandomNumber randomNumber = new RandomNumber();
    private ArrayList<Integer> randomList = new ArrayList<>();

    public RandomNumbers(int bound, int count) {
        IntStream.rangeClosed(0, count)
            .forEach(i -> randomList.add(randomNumber.generate(bound) + 1));
    }

    void setRandomNumber(ArrayList<Integer> changeList) {
        randomList = changeList;
    }

    ArrayList<Integer> getRandomList() {
        return randomList;
    }
}
