package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Integer[] objectArray, Integer objectToCount) {

        Integer counter = 0;

        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] == objectToCount) {
                counter++;
            }
        }

        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Integer[] objectArray, Integer objectToRemove) {

        Integer[] cleanArray = new Integer[objectArray.length - getNumberOfOccurrences(objectArray, objectToRemove)];

        int cleanArrayIndex = 0;

        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] != objectToRemove) {
                cleanArray[cleanArrayIndex] = objectArray[i];
                cleanArrayIndex++;
            }
        }


        return cleanArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Integer getMostCommon(Integer[] objectArray) {

        Integer commonObject = 0;
        Integer highestCount = 0;

        for (int i = 0; i < objectArray.length; i++) {
            if (getNumberOfOccurrences(objectArray, objectArray[i]) > highestCount) {
                commonObject = objectArray[i];
                highestCount = getNumberOfOccurrences(objectArray, objectArray[i]);
            }
        }

        return commonObject;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Integer getLeastCommon(Integer[] objectArray) {

        Integer uncommonObject = 0;
        Integer leastCount = objectArray.length;

        for (int i = 0; i < objectArray.length; i++) {
            if (getNumberOfOccurrences(objectArray, objectArray[i]) < leastCount) {
                uncommonObject = objectArray[i];
                leastCount = getNumberOfOccurrences(objectArray, objectArray[i]);
            }
        }

        return uncommonObject;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Integer[] objectArray, Integer[] objectArrayToAdd) {

        Integer[] mergedArray = new Integer[objectArray.length + objectArrayToAdd.length];

        for (int i = 0; i < objectArray.length; i++) {
            mergedArray[i] = objectArray[i];
        }

        int secondIterator = objectArray.length;

        for (int i = 0; i < objectArrayToAdd.length; i++) {
            mergedArray[secondIterator] = objectArrayToAdd[i];
            secondIterator++;
        }

        return mergedArray;
    }
}
