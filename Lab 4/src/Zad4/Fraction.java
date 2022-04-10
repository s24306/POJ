package Zad4;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int num, int den){
        this.numerator = num;
        this.denominator = den;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    private int GCD(int a, int b){
        if (a == 0){
            return b;
        } else {
            return GCD((b % a), a);
        }
    }

    private void simplifyFraction(int num, int den){
        int commonFactor = GCD(num, den);
        this.numerator = num / commonFactor;
        this.denominator = den / commonFactor;
    }

    public void Add(Fraction fraction){
        int newDenominator = GCD(this.denominator, fraction.getDenominator());
        newDenominator = (this.denominator * fraction.getDenominator()) / newDenominator;
        int newNumerator = (this.numerator) * (newDenominator / this.denominator) +
                (fraction.getNumerator()) * (newDenominator / fraction.getDenominator());
        simplifyFraction(newNumerator, newDenominator);
    }

    public void Subtract(Fraction fraction){
        int newDenominator = GCD(this.denominator, fraction.getDenominator());
        newDenominator = (this.denominator * fraction.getDenominator()) / newDenominator;
        int newNumerator = (this.numerator) * (newDenominator / this.denominator) -
                (fraction.getNumerator()) * (newDenominator / fraction.getDenominator());
        simplifyFraction(newNumerator, newDenominator);
    }

    public void Multiply(Fraction fraction){
        int newDenominator = this.denominator * fraction.getDenominator();
        int newNumerator = this.numerator * fraction.getNumerator();
        simplifyFraction(newNumerator, newDenominator);
    }

    public void Divide(Fraction fraction){
        int newDenominator = this.denominator * fraction.getNumerator();
        int newNumerator = this.numerator * fraction.getDenominator();
        simplifyFraction(newNumerator, newDenominator);
    }

    public void printFraction(){
        System.out.printf("%d/%d\n", this.numerator, this.denominator);
    }
}
