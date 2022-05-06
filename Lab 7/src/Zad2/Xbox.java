package Zad2;

public class Xbox extends GameConsole{
    @Override
    void playGame(Game game) {
        if(game.getGameType() == "Xbox"){
            System.out.println("Starting the game.");
        } else {
            System.out.println("This is not a valid disk.");
        }
    }
}
