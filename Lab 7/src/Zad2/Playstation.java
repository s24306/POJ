package Zad2;

public class Playstation extends GameConsole{
    @Override
    void playGame(Game game) {
        if(game.getGameType() == "Playstation"){
            System.out.println("Starting the game.");
        } else {
            System.out.println("This is not a valid disk.");
        }
    }
}
