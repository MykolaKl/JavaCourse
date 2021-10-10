package com.softserve;

public class ConvertToBinary {
    public static void main(String[] args) {
        System.out.println(toBinary(2));
    }

    public static int toBinary(int n) {
        String str = "";
        while (n != 1) {
            str += (n - 2 * (n / 2));
            n /= 2;
        }
        str += (n - 2 * (n / 2));
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(str);
        strBuilder.reverse();
        n = Integer.parseInt(strBuilder.toString());
        return n;
    }
}
