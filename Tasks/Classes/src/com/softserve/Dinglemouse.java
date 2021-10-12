package com.softserve;

public class Dinglemouse {
    private static int ONE_HUNDRED = 100; // shifted up this variable to make code work correctly

    public static final Dinglemouse INST = new Dinglemouse();


    private final int value;

    private Dinglemouse() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }

}