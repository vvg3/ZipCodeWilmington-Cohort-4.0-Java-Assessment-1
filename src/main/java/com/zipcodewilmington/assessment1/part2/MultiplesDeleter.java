package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {

        int countOfEvens = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                countOfEvens++;
            }
        }

        Integer[] oddsArray = new Integer[ints.length - countOfEvens];

        int secondIterator = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                oddsArray[secondIterator] = ints[i];
                secondIterator++;
            }
        }

        return oddsArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {

        int countOfEvens = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                countOfEvens++;
            }
        }

        Integer[] evensArray = new Integer[ints.length - countOfEvens];

        int secondIterator = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                evensArray[secondIterator] = ints[i];
                secondIterator++;
            }
        }


        return evensArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {

        int count = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 3 == 0) {
                count++;
            }
        }

        Integer[] newArray = new Integer[ints.length - count];

        int iterator = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 3 != 0) {
                newArray[iterator] = ints[i];
                iterator++;
            }
        }

        return newArray;
    }

    /**
     * @param ints     array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {

        int count = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % multiple == 0) {
                count++;
            }
        }

        Integer[] newArray = new Integer[ints.length - count];

        int iterator = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % multiple != 0) {
                newArray[iterator] = ints[i];
                iterator++;
            }
        }

        return newArray;
    }


}
