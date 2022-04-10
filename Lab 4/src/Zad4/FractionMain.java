package Zad4;

public class FractionMain {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(1, 2);
        fraction1.Add(fraction2);
        fraction1.printFraction();

        fraction1 = new Fraction(1, 2);
        fraction1.Subtract(fraction2);
        fraction1.printFraction();

        fraction1 = new Fraction(1, 2);
        fraction1.Multiply(fraction2);
        fraction1.printFraction();

        fraction1 = new Fraction(1, 2);
        fraction1.Divide(fraction2);
        fraction1.printFraction();
    }
}
