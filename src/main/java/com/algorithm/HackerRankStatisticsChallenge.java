package com.algorithm;

import java.util.*;

public class HackerRankStatisticsChallenge {

    /**
     * Find the Mean, Median and Mode of a given list of numbers
     * @param n - number of elements in list
     * @param elements - list of numbers
     * @return - a list, containing the Mean, Median and Mode of the {@code elements}
     */
    public List<Number> meanMedianMode(int n, List<Double> elements) {
        List<Number> resultList = new ArrayList<>(3);
        List<Double> maxModes = new ArrayList<>(n);
        Map<Double, Integer> modes = new HashMap<>(elements.size());

        double mean = 0.0D;
        double median;
        int mode;
        int midElementPosition = elements.size() / 2;

        for (int i = 0; i < n; i++) {
            mean += elements.get(i);
            int value = modes.getOrDefault(elements.get(i), 0);
            modes.put(elements.get(i), ++value);
        }

        Collections.sort(elements);
        if (elements.size() % 2 == 0) {
            median = (elements.get(midElementPosition) + elements.get(midElementPosition - 1)) / 2;
        } else {
            median = elements.get(midElementPosition);
        }

        //get max value
        //if max values are > 1 -> fetch the smallest
        //else return
        int maxValue = Collections.max(modes.values());
        for (Map.Entry<Double, Integer> entry : modes.entrySet()) {
            if (entry.getValue() == maxValue) {
                maxModes.add(entry.getKey());
            }
        }

        if (maxModes.size() > 1) {
            mode = Collections.min(maxModes).intValue();
        } else {
            mode = Collections.max(maxModes).intValue();
        }

        resultList.add(Double.parseDouble(String.format("%.1f", mean/n)));
        resultList.add(Double.parseDouble(String.format("%.1f", median)));
        resultList.add(mode);

        return resultList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> x = new ArrayList<>(n);
        List<Integer> w = new ArrayList<>(n);
        for (int i = 0; i < n*2; i++) {
            if (i <= n-1) {
                x.add(scanner.nextInt());
            } else {
                w.add(scanner.nextInt());
            }
        }

        System.out.println(weighedMean(n, x, w));
    }

    public static Float weighedMean(int n, List<Integer> x, List<Integer> w) {
        float sumOfXW = 0.0f;
        float sumOfW = 0.0f;

        for (int i = 0; i < n; i++) {
            sumOfW += w.get(i);
            sumOfXW += x.get(i) * w.get(i);
        }
        return Float.parseFloat(String.format("%.1f", sumOfXW/sumOfW));
    }
}
