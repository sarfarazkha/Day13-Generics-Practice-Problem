package com.bridgelabz;

/**REFACTOR : PROBLEM STATEMENT
 * Refactor all the 3 to One Generic Method and find the maximum
 *
 */

public class Refactor2<T extends Comparable<T>> {
    T x, y, z;

    //constructor test maximum
    public Refactor2(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {
        T max = x;// Initializing x as greater
        if (y.compareTo(max) > 0)
            max = y;// as of now y is greater

        if (z.compareTo(max) > 0)
            max = z;// now z is greater
        printMax(x, y, z, max);
        return max;

    }

    public static <T> void printMax(T x, T y, T z, T max) {
        System.out.printf("the Max of following variables %s , %s and %s is %s\n", x, y, z, max);
    }
}

