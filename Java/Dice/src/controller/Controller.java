package controller;

import domain.Dice;
import domain.Dices;
import domain.Throwing;
import view.InputView;
import view.OutputView;

public class Controller {

    public void run(){
        InputView inputView = new InputView();
        Dices dices = new Dices(inputView.input());
        Throwing throwing = new Throwing(dices);
        OutputView outputView = new OutputView();
        outputView.output(throwing);
    }
}
