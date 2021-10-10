package com.softserve;


public class BeginnerSeriesNumber2Clock {
    public static void main(String[] args) {
        System.out.println(Past(0, 1, 1));
    }

    public static int Past(int h, int m, int s) {
        return s * 1000 + m * 60 * 1000 + h * 60 * 60 * 1000;
    }
}