package com.algorithm;

import java.util.Arrays;

public class ArrayManipulation {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[][] twoDarr = new int[][]
                {
                        {-1,-1, 0,-9,-2,-2},
                        {-2,-1,-6,-8,-2,-5},
                        {-1,-1,-1,-2,-3,-4},
                        {-1,-9,-2,-4,-4,-5},
                        {-7,-3,-3,-2,-9,-9},
                        {-1,-3,-1,-2,-4,-5}
                };
        reverseArray(arr);
        reverseArray2(arr);
        hourglassSum(twoDarr);
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


    public static int hourglassSum(int[][] arr) {
        int sum = Integer.MIN_VALUE;

        outer: for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                if ((j + 2) >= 6) continue outer;

                int tempSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1] +
                        arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                if (tempSum > sum) sum = tempSum;
            }
        }
        System.out.println(sum);
        return sum;
    }

}
