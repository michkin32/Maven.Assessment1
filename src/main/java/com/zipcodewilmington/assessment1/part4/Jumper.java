package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        Integer totalJumps = 0;
        Integer distanceToTop = 0;
        for (int i = 0; i <= k - j; i += j) {
            totalJumps++;
            distanceToTop += j;
        }
        for (int i = distanceToTop; i < k; i++){
                totalJumps++;
            }

        return  totalJumps;
        }
}

