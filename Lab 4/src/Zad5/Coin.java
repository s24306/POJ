package Zad5;

import java.util.*;

public class Coin {
    private String[] sides = {"Head", "Tail"};
    private int numOfThrows;

    public Coin(int numOfThrows){
        this.numOfThrows = numOfThrows;
    }

    public void throwCoins(){
        float heads = 0;
        float tails = 0;
        for(int i = 0; i < this.numOfThrows; i++){
            Random rand = new Random();
            int value = rand.nextInt(2);
            String result = this.sides[value];
            if (result == "Head"){
                heads++;
            } else {
                tails++;
            }
        }
        System.out.printf("The chances are: %.2f%% for a head, and %.2f%% for a tail\n",
                (heads/this.numOfThrows * 100), (tails /this.numOfThrows * 100));
    }

}
