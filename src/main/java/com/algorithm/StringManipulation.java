package com.algorithm;

import java.util.Map;
import java.util.TreeMap;

public class StringManipulation {

    private static final String WHITE_SPACE = " ";

    /**
     * A method that counts the words in a given message string.
     * The com.algorithm saves each word and how many times it has
     * occurred in the current string.
     *
     * @param message - working string
     * @return - a {@link TreeMap} containing the word itself as a {@link String} key
     * and how many times it has been repeated as an {@link Integer} value
     */
    public Map<String, Integer> countWords(String message) {
        TreeMap<String, Integer> differentWords = new TreeMap<>();

        String[] words = message.toLowerCase()
                .replaceAll("[,.\\-!?\"\n\r]", WHITE_SPACE)
                .split("\\s+");

        for (String word : words) {
            Integer count = differentWords.get(word);
            differentWords.put(word, count == null ? 1 : count + 1);
        }

        return differentWords;
    }

    /**
     * Prints a string given amount of times without using a loop
     *
     * @param str - string to print
     * @param timesTobePrinted - amount of times to be printed in the console
     */
    static void printStringGivenTimes(String str, int timesTobePrinted) {
        String repeated = new String(new char[timesTobePrinted]).replace("\0", str);
        System.out.println(repeated);
    }
}
