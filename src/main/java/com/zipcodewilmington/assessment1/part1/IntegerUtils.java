package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {

        Integer sumOfN = 0;

        while (n > 0) {
            sumOfN += n - 1;
            n--;
        }

        return sumOfN;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {

        Integer productOfN = 1;

        while (n > 0) {
            productOfN *= n;
            n--;
        }

        return productOfN;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {

        Integer reversedNum = 0;

        while (val != 0) {
            reversedNum = reversedNum * 10 + val % 10;
            val = val / 10;
        }

        return reversedNum;
    }
}
