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

        Integer[] cleanArray = new Integer[ints.length - countOfEvens];
        int cleanArrayIndex = 0;

        for (int j = 0; j < ints.length; j++) {
            if (ints[j] % 2 != 0) {
                cleanArray[cleanArrayIndex] = ints[j];
                cleanArrayIndex++;
            }
        }

        return cleanArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {

        int countOfOdds = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                countOfOdds++;
            }
        }

        Integer[] cleanArray = new Integer[ints.length - countOfOdds];
        int cleanArrayIndex = 0;

        for (int j = 0; j < ints.length; j++) {
            if (ints[j] % 2 == 0) {
                cleanArray[cleanArrayIndex] = ints[j];
                cleanArrayIndex++;
            }
        }

        return cleanArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {

        int countOfMultiplesOfThree = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 3 == 0) {
                countOfMultiplesOfThree++;
            }
        }

        Integer[] cleanArray = new Integer[ints.length - countOfMultiplesOfThree];
        int cleanArrayIndex = 0;

        for (int j = 0; j < ints.length; j++) {
            if (ints[j] % 3 != 0) {
                cleanArray[cleanArrayIndex] = ints[j];
                cleanArrayIndex++;
            }
        }

        return cleanArray;
    }

    /**
     * @param ints     array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {

        int countOfMultiplesOfN = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % multiple == 0) {
                countOfMultiplesOfN++;
            }
        }

        Integer[] cleanArray = new Integer[ints.length - countOfMultiplesOfN];
        int cleanArrayIndex = 0;

        for (int j = 0; j < ints.length; j++) {
            if (ints[j] % multiple != 0) {
                cleanArray[cleanArrayIndex] = ints[j];
                cleanArrayIndex++;
            }
        }

        return cleanArray;    }


}
