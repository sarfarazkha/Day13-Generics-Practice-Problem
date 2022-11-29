package com.bridgelab;

public class TestMax {

    static String maxNumber(String a1, String a2, String a3) {
        if (a1.compareTo(a2) >= 1) {
            if (a1.compareTo(a3) >= 1) {
                return a1;
            } else
                return a3;
        } else if (a2.compareTo(a3) >= 1) {
            return a2;
        } else {
            return a3;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Test of maximum 3 variables program ");

        String a1 = "Apple", a2 = "peach", a3 = "Banana";

        System.out.println("Biggest String is : " + maxNumber(a1, a2, a3));

    }
}
