package Zad2;

public class MainConsoles {
    public static void main(String[] args) {
        Playstation playstation = new Playstation();
        Xbox xbox = new Xbox();
        PlaystationGame psgame = new PlaystationGame();
        XboxGame xgame = new XboxGame();
        playstation.playGame(psgame);
        playstation.playGame(xgame);
        xbox.playGame(psgame);
        xbox.playGame(xgame);
    }
}
