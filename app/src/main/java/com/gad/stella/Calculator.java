package com.gad.stella;

/**
 * Calculates the pints required.
 */
public class Calculator {

    public int calc(int age, int dress, int rating, int x) throws Exception {
        if ((rating > 10) || (rating < 1)) {
            throw new Exception("Rating must be between 1 and 10");
        }
        int ret = ((age + dress) / rating) - x;
        return ret;
    }
}
