package domain;

import java.util.ArrayList;

public class Dices {
    ArrayList<Dice> dices = new ArrayList<>();
    public Dices(int number){
        for(int i=0; i<number; i++){
               dices.add(new Dice());
        }
    }

    public ArrayList<Dice> getDices(){
        return dices;
    }
}
