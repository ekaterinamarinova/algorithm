package com.algorithm;

import java.util.Arrays;

public class ArrayManipulation {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        reverseArray(arr);
        reverseArray2(arr);
    }

    public static int[] reverseArray(int[] arr) {
        int[] temp = new int[arr.length];
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            temp[count] = arr[i];
            ++count;
        }
        System.out.println(Arrays.toString(temp));
        return temp;
    }

    public static int[] reverseArray2(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int back;
            back = arr.length - (i+1);
            arr[i] = arr[i] + arr[back];
            arr[back] = arr[i] - arr[back];
            arr[i] = arr[i] - arr[back];
        }
        return arr;
    }
}
