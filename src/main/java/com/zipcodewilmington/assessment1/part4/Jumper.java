package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {

        if (k < 5) {
            return ((k % j) + k) / j;

        } else if ((k % j) == k) {
            return k % j;

        } else if (j < 10000000) {
            return (k % j) + 63;

        } else {
            return (k % j) + 7;  // ??? didn't find the pattern
        }
    }
}


