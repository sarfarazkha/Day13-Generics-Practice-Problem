package com.bridgelbz;

public class TestMaxUc5 {
    static <T extends Comparable<T>> T maxNumber(T a1, T a2, T a3, T a4) {

        if (a1.compareTo(a2) >= 1) {
            if (a1.compareTo(a3) >= 1) {
                if (a1.compareTo(a4) >= 1) {
                    return a1;
                } else {
                    return a4;
                }
            } else if (a3.compareTo(a4) >= 1) {
                return a3;
            } else {
                return a4;
            }
        } else if (a2.compareTo(a3) >= 1) {
            if (a2.compareTo(a4) >= 1) {
                return a2;
            } else {
                return a4;
            }
        } else if (a3.compareTo(a4) >= 1) {
            return a3;
        } else {
            return a4;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Test of maximum 3 variables program ");

        String a1 = "Apple", a2 = "paech", a4 = "Banana", a3 = "hello";

        System.out.println("Biggest String is : " + maxNumber(a1, a2, a3, a4));
    }
}
