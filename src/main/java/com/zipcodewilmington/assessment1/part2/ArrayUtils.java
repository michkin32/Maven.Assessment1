package com.zipcodewilmington.assessment1.part2;

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
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int counter = 0;
        for (Object s : objectArray){
            if (s == objectToCount){
                counter += 1;
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
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        Integer counter = 0;
        for(Object i : objectArray){
            if(!(i.equals(objectToRemove))){
                counter++;
            }
        }

        Integer[] arrayValues = new Integer[counter];
        Integer secondCounter = 0;
        for(Object i : objectArray){
            if(!(i.equals(objectToRemove))){
                arrayValues[secondCounter] = (Integer) i;
                secondCounter++;
        }
        }

        return arrayValues;


    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Integer[] repeatingNums = {0,0,0,0,0,0,0,0,0,0,0};
        int element = 0;
        for (Object i: objectArray){
            for (Object j : objectArray){
                if (j==i){
                    repeatingNums[element]++;
                }
            }
            element++;
        }
        Object mostCommon = 0;
        for (int i = 0; i < repeatingNums.length - 1; i++){
            if (repeatingNums[i] > repeatingNums[i+1]) {
                mostCommon = objectArray[i];
            }
        }

        return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Integer[] repeatingNums = {0,0,0,0,0,0,0,0,0,0};
        int element = 0;
        for (Object i: objectArray){
            for (Object j : objectArray){
                if (j==i){
                    repeatingNums[element]++;
                }
            }
            element++;
        }
        Integer[] lowestValue = {2};
        Object leastCommon = 0;
        for (int i = 0; i < repeatingNums.length - 1; i++){
            if (repeatingNums[i] < lowestValue[0]) {
                leastCommon = objectArray[i];
                lowestValue[0] = (Integer) objectArray[i];
            }
        }

        return leastCommon;

    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Integer counter = 0;
        for (Object i : objectArray){
            counter++;}
        for (Object i : objectArrayToAdd){
                counter++;
            }


        Integer[] bigArray = new Integer[counter];
        Integer secondCounter = 0;
        for (Object i : objectArray){
            bigArray[secondCounter] = (Integer) i;
            secondCounter++;
        }
        for (Object i : objectArrayToAdd){
            bigArray[secondCounter] = (Integer) i;
            secondCounter++;
        }
        return bigArray;
    }

}
