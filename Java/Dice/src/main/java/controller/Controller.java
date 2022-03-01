package controller;

import domain.Dices;
import domain.RandomNumbers;
import domain.Throwing;
import view.InputView;
import view.OutputView;

public class Controller {

    private static final int MAX_DICE_NUMBER = 6;

    public void run() {
        InputView inputView = new InputView();
        RandomNumbers randomNumbers = new RandomNumbers(MAX_DICE_NUMBER, inputView.input());
        Dices dices = new Dices(randomNumbers);
        Throwing throwing = new Throwing(dices);
        OutputView outputView = new OutputView();
        outputView.output(throwing);
    }
}
