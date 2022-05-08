package Zad6;
import javax.swing.*;

public class Divider {
    public static void main(String[] args) {
        String number = JOptionPane.showInputDialog(null, "Podaj liczbę");
        String divider = JOptionPane.showInputDialog(null, "Podaj dzielnik");
        try {
            int result = convertToInteger(number) / convertToInteger(divider);
            JOptionPane.showMessageDialog(null, String.format("Wynik dzielenia to %d", result));
        } catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Błąd, nie można dzielić przez zero");
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Błąd, conajmniej jedna z liczb nie jest liczbą");
        }
    }

    private static int convertToInteger(String number){
        return Integer.parseInt(number);
    }
}
