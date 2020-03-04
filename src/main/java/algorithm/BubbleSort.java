package algorithm;

import java.util.Arrays;

/**
 * All these implementations run in polynomial time,
 * meaning their O notation is O(n^p). They are not that efficient.
 *
 * @author Ekaterina Marinova
 */
public class BubbleSort {

    /**
     * This method sorts an array of integers
     * in an ascending manner by checking whether the next index
     * of the array is smaller than or equal to the current;
     *
     * If true -> move the smaller value with bigger index
     * on the place of the previous index and vice versa
     *
     * @param ints - list of unsorted integers
     * @throws Exception - if the array contains none or only 1 element
     */
    public int[] sortAscending(int[] ints) throws Exception {
        int size = ints.length;
        int[] temp;

        if (size < 1) {
            throw new Exception("Array cannot be sorted because it does not contain any elements");
        }

        do {
            //for each element of the given array
            for (int i = 0; i < size; i++) {
                //if the next value is smaller than the previous one,
                //swap the values
                if (size > (i + 1) && ints[i + 1] < ints[i]) {
                    temp = Arrays.copyOf(ints, size);
                    ints[i] = temp[i + 1];
                    ints[i + 1] = temp[i];
                }
            }
        } while(isAnyIndexUnordered(ints));

        return ints;
    }

    /**
     * Helper method to check
     * if there is still an unsorted element
     *
     * @param arr - given array
     * @return - whether it is sorted or not yet
     */
    private boolean isAnyIndexUnordered(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            if (size > (i + 1) && arr[i + 1] < arr[i]) {
                return true;
            }
        }

        return false;
    }

    /**
     * Another example of bubble sort, but enhanced.
     *
     * @param input - unsorted array
     */
    public static void sort(int[] input) {
        int inputLength = input.length;
        int temp;
        boolean is_sorted;

        for (int i = 0; i < inputLength; i++) {
            is_sorted = true;

            for (int j = 1; j < (inputLength - i); j++) {
                if (input[j - 1] > input[j]) {
                    temp = input[j - 1];
                    input[j - 1] = input[j];
                    input[j] = temp;
                    is_sorted = false;
                }
            }

            if (is_sorted) break;
        }
    }

}
