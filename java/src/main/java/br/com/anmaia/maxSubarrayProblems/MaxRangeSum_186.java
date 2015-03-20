package br.com.anmaia.maxSubarrayProblems;

/**
 * Created by cin_amaia on 3/20/15.
 *
 * ref:
 * https://www.codeeval.com/browse/186/
 * http://en.wikipedia.org/wiki/Maximum_subarray_problem
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;

        MaxRangeSum_186 calc = new MaxRangeSum_186();

        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            String[] items = line.split(" ");

            int[] results = new int[items.length];

            for (int i = 0; i < items.length; i++) {
                try {
                    results[i] = Integer.parseInt(items[i]);
                } catch (NumberFormatException nfe) {
                }
            }

            System.out.println(calc.calc(results));
        }
    }
}

class MaxRangeSum_186 {

    /* Sample code to read in test cases: */

    public int calc(int[] array) {
        int max_ending_here = 0;
        int max_so_far = 0;

        for (int x : array) {
            max_ending_here = Math.max(0, max_ending_here + x);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }

        return max_so_far;
    }
}
