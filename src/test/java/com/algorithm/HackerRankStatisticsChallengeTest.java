package com.algorithm;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class HackerRankStatisticsChallengeTest {

    private HackerRankStatisticsChallenge challenge;

    @BeforeEach
    public void init() {
        challenge = new HackerRankStatisticsChallenge();
    }

    @Test
    public void testMeanMedianMode() {
        int n = 6;
        List<Double> elements = new ArrayList<>(n);
        elements.addAll(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0));
        List<Number> result = challenge.meanMedianMode(n, elements);

        Assert.assertNotNull(result);
        Assert.assertEquals( 3.5, result.get(0));
        Assert.assertEquals(3.5, result.get(1));
        Assert.assertEquals(1, result.get(2));
    }
}
