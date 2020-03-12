package com.algorithm;

import java.util.LinkedHashMap;
import java.util.Map;

public class DynamicProgramming {

    public DynamicProgramming(int capacity) {
        memo = new LinkedHashMap<>(capacity);
    }

    private Map<Integer, Integer> memo;

    public static void main(String[] args) {
        DynamicProgramming dp = new DynamicProgramming(10);
        int i = dp.fib(9);
        System.out.println(i);
    }

    public int fib(int n) {
        int f;
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        if (n <= 2) f = 1;
        else f = fib(n - 1) + fib(n - 2);

        memo.put(n, f);
        return f;
    }

}
