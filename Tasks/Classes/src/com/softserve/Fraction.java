package com.softserve;

public class Fraction implements Comparable<Fraction> {
    private final long top;
    private final long bottom;

    public Fraction(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    @Override
    public int hashCode() {
        return 17 * Long.hashCode(top) + Long.hashCode(bottom);
    }

    @Override
    public boolean equals(Object o) {
        return compareTo((Fraction) o) == 0;
    }

    @Override
    public int compareTo(Fraction f2) {
        return Long.compare(top * f2.bottom, f2.top * bottom);
    }

    // Your work here!

    public static long replaceA(long a, long b) {
        while (b != 0) {
            long temporary = a % b;
            a = b;
            b = temporary;
        }
        return a;
    }

    public Fraction addFractions(Fraction f2) {
        long numeratorPart = this.top * f2.bottom + f2.top * this.bottom;
        long denominatorPart = this.bottom * f2.bottom;

        long gcd = replaceA(numeratorPart, denominatorPart);
        numeratorPart = numeratorPart / gcd;
        denominatorPart = denominatorPart / gcd;

        Fraction result = new Fraction(numeratorPart, denominatorPart);
        return result;
    }

    @Override
    public String toString() {
        return this.top + "/" + this.bottom;
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 3);
        System.out.println(f1.addFractions(new Fraction(3, 9)));
    }

}