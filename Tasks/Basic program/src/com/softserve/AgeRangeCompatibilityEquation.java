package com.softserve;

public class AgeRangeCompatibilityEquation {
    public static void main(String[] args) {
        System.out.println(datingRange(17));
    }
    public static String datingRange(int age) {
        int min;
        int max;
        if(age > 14) {
            min = (age / 2) + 7;
            max = 2 * (age - 7);
        }
        else {
            min = (int)(age - 0.10 * age);
            max = (int)(age + 0.10 * age);
        }
        return min + "-" + max;
    }
}