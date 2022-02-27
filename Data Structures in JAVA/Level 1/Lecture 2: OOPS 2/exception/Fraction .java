package exceptions;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            // TODO error out
        }
        this.denominator = denominator;
        simplify();
    }


    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int n) {
        this.numerator = n;
        simplify();
    }


    public void setDenominator(int d) throws ZeroDenominatorException {
        if (d == 0){
            ZeroDenominatorException e= new ZeroDenominatorException();
            throw e;
        }
        this.denominator = d;
        this.simplify();
    }

    public void print() {
        if (denominator == 1) {
            System.out.println(numerator);
        } else {
            System.out.println(numerator + "/" + denominator);
        }
    }

    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for (int i = 2; i <= smaller; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        numerator = numerator/gcd;
        denominator = denominator/gcd;
    }

    public static Fraction add(Fraction f1, Fraction f2) {
        int newNum = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
        int newDen = f1.denominator * f2.denominator;
        Fraction f = new Fraction(newNum, newDen);
        return f;
    }

    public void add(Fraction f2) {
        this.numerator = this.numerator * f2.denominator + this.denominator*f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

    public void multiply(Fraction f2) {
        this.numerator = this.numerator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

}
