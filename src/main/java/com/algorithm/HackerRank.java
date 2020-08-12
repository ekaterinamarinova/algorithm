package com.algorithm;

import java.util.*;

/**
 * Solutions from HackerRank problems are contained here
 */
public class HackerRank {

    /**
     * As Gary is hiking, he enters sequences of mountains and valleys.
     *
     * A mountain is when he has exceeded sea level and walked back down,
     * for example /\ is a mountain, represented as string it would be 'UD'.
     *
     * A valley is when he has gotten below sea level and walked back up,
     * for example \/ is a valley, represented as a string it would be 'DU'.
     *
     * Given a string, representing Gary's path, count how many valleys
     * he has entered and walked out of.
     *
     * @param s - string representing Gary's path.
     * @return - how many valleys had Garry passed
     */
    public int countGarrysValleys(String s) {
        int seaLevel = 0;
        int valleyCount = 0;
        String[] eachStep = s.toLowerCase().split("");

        for (String direction : eachStep) {
            if ("u".equals(direction)) {
                ++seaLevel;
            } else {
                --seaLevel;
                continue;
            }

            if (seaLevel == 0) {
                ++valleyCount;
            }
        }
        System.out.println(valleyCount);
        return valleyCount;
    }

    /**
     * Emma is playing a new mobile game that starts with consecutively numbered clouds.
     * Some of the clouds are thunderheads and others are cumulus.
     * She can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus 1 or 2.
     * She must avoid the thunderheads. Determine the minimum number of jumps it will take Emma to jump from her starting
     * position to the last cloud. It is always possible to win the game.
     *
     * For each game, Emma will get an array of clouds numbered 0 if they are safe or 1 if they must be avoided.
     *
     * @param c - array, containing the 'clouds' in order
     * @return - minimum number of steps required to finish the trace
     */
    public static int countEmmasEasiestPath(int[] c) {
        int steps = 0;
        int twoSteps;

        for (int i = 0; i < c.length - 1; i++) {
            twoSteps = i + 2;

            if (twoSteps < c.length && c[twoSteps] == 0) {
                ++i;
                ++steps;
                continue;
            }

            if (c[i] == 0) {
                ++steps;
            }
        }
        return steps;
    }

    /**
     * Given a string {@code s} that is "printed" {@code n} amount of times,
     * get the first {@code n} characters and return how many times does the
     * character 'a' occur.
     *
     * @param s - starting string
     * @param n - get the first {@code n} characters
     * @return  - how many times does 'a' occur in the given substring
     */
    public static int repeatedString(String s, int n) {
        return new String(new char[n])
                .replace("\0", s)
                .toLowerCase()
                .substring(0, n)
                .replaceAll("[b-z]", "")
                .split("")
                .length;
    }

    /**
     * Same as above, but with streams
     *
     * @param s - starting string
     * @param n - get the first {@code n} characters
     * @return  - how many times does 'a' occur in the given substring
     */
    public static int repeatedStringWithStream(String s, int n) {
        String[] chars = new String(new char[n])
                .replace("\0", s)
                .split("");

        return (int) Arrays.stream(chars)
                .filter("a"::equals)
                .count();

    }

    /**
     * Left rotation on an array.
     *
     * @param a - an array of integers
     * @param d - number of left rotations
     * @return - {@code a}, but rotated
     */
    static int[] rotLeft(int[] a, int d) {
        int temp;
        for (int i = 0; i < d; i++) {
            for (int j = a.length - 1; j > 0; j--) {
                temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
            }
        }

        System.out.println(Arrays.toString(a));
        return a;
    }

    /**
     * Given a 2D array, sum the hourglass with the
     * highest score. A hourglass is considered the
     * following part of the array: a b c
     *                                d
     *                              e f g
     * For example, given the array 1 1 1 0 0 0
     *                              0 1 0 0 0 0
     *                              1 1 1 0 0 0
     *                              0 0 0 0 0 0
     * the highest hourglass score is 7.
     * @param arr - the 2D array
     * @return - the highest score
     */
    static int hourglassSum(int[][] arr) {
        int maxXY = 3;
        int total = -64;
        int sum = 0;

        for (int x = 0; x < maxXY; x++) {
            for (int y = 0; y < maxXY; y++) {
                sum = arr[x][y] + arr[x][y + 1] + arr[x][y + 2];
                sum += arr[x+1][y+1];
                sum += arr[x+2][y] + arr[x+2][y+1] + arr[x+2][y+2];
            }
        }

        if (total < sum)
            total = sum;

        return total;
    }
    


}
