package controller;

import domain.Dices;
import domain.RandomNumbers;
import domain.DicesInfo;
import view.InputView;
import view.OutputView;

public class Controller {

    private static final int MAX_DICE_NUMBER = 6;

    public void run() {
        InputView inputView = new InputView();
        RandomNumbers randomNumbers = new RandomNumbers(MAX_DICE_NUMBER, inputView.input());
        Dices dices = Dices.createDices(randomNumbers);
        DicesInfo dicesInfo = new DicesInfo(dices);
        OutputView outputView = new OutputView();
        outputView.output(dicesInfo);
    }
}
