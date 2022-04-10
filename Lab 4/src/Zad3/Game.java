package Zad3;

import java.util.*;

public class Game {
    private int magicNumber;
    private int smallestNumber;
    private int biggestNumber;
    private int triesLeft = 5;

    public Game(){
    }

    public void play(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("For starters lets define the range of numbers.");
        System.out.println("Please enter the smallest number: ");
        this.smallestNumber = scanner.nextInt();
        while(true){
            System.out.println("Please enter the biggest number: ");
            this.biggestNumber = scanner.nextInt();
            if(this.biggestNumber <= this.smallestNumber){
                System.out.println("Biggest number cannot be smaller or equal to the smallest");
            } else {
                break;
            }
        }
        this.magicNumber = (int)Math.floor(Math.random()*(this.biggestNumber-this.smallestNumber+1)+this.smallestNumber);

        while(true){

            if(this.triesLeft == 0){
                System.out.printf("Sorry buddy, game over. The correct number was %d.\n", this.magicNumber);
                break;
            }

            System.out.println("Guess the number: ");
            int guess = scanner.nextInt();

            if(guess == this.magicNumber){
                System.out.println("Congratulations, you won!");
                break;
            } else if (guess < this.magicNumber){
                System.out.println("Too small");
            } else if (guess > this.magicNumber){
                System.out.println("Too big");
            }

            this.triesLeft--;

        }
    }

}
