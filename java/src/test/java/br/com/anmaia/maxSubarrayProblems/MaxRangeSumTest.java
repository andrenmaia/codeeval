package br.com.anmaia.maxSubarrayProblems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxRangeSumTest {

    @Test
    public void oneElement() {
        int d = 1;
        int[] array = {1};

        int result = new MaxRangeSum().calc(array, d);

        assertEquals(1, result);
    }


    @Test
    public void oneElementAtTheEnd() {
        int d = 1;
        int[] array = {1, 2, 3};

        int result = new MaxRangeSum().calc(array, d);

        assertEquals(3, result);
    }

    @Test
    public void oneElementAtTheBeginning() {
        int d = 1;
        int[] array = {3,2,1};

        int result = new MaxRangeSum().calc(array, d);

        assertEquals(3, result);
    }


    @Test
    public void twoElementsAtTheEnd() {
        int d = 2;
        int[] array = {1, 2, 3};

        int result = new MaxRangeSum().calc(array, d);

        assertEquals(5, result);
    }

    @Test
    public void twoElementsAtTheEBeginning() {
        int d = 2;
        int[] array = {3,2,1};

        int result = new MaxRangeSum().calc(array, d);

        assertEquals(5, result);
    }

    @Test
    public void sample1() {
        int d = 5;
        int[] array = {7, -3, -10, 4, 2, 8, -2, 4, -5, -2};

        int result = new MaxRangeSum().calc(array, d);

        assertEquals(16, result);
    }

    @Test
    public void sample2() {
        int d = 6;
        int[] array = {-4, 3, -10, 5, 3, -7, -3, 7, -6, 3};

        int result = new MaxRangeSum().calc(array, d);

        assertEquals(0, result);
    }

    @Test
    public void sample3() {
        int d = 6;
        int[] array = {-7, 0, -45, 34, -24, 7};

        int result = new MaxRangeSum().calc(array, d);

        assertEquals(0, result);
    }
}