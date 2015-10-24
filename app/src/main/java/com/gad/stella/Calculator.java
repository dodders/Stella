package com.gad.stella;

/**
 * Calculates the pints required.
 */
public class Calculator {

    public int calc(int age, int dress, int rating, int x) throws Exception {
        if (0 == rating) {
            throw new Exception("cannot specify a zero rating");
        }
        int ret = ((age + dress) / rating) - x;
        return ret;
    }
}
