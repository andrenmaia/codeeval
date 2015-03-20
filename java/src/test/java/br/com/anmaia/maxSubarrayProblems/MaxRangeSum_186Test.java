package br.com.anmaia.maxSubarrayProblems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxRangeSum_186Test {

    @Test
    public void KadanesAlgorithm() {
        int[] array = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        assertEquals(6, new MaxRangeSum_186().calc(array));
    }
}