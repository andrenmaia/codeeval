package br.com.anmaia.maxSubarrayProblems;

/**
 * Created by cin_amaia on 3/20/15.
 * <p>
 * ref:
 * https://www.codeeval.com/open_challenges/186/
 * http://en.wikipedia.org/wiki/Maximum_subarray_problem
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        final MaxRangeSum maxRangeSum = new MaxRangeSum();

        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            final String[] list = line.split(";");
            final int d = Integer.parseInt(list[0]);

            final String[] tail = list[1].split(" ");

            int[] results = new int[tail.length];

            for (int i = 0; i < tail.length; i++) {
                results[i] = Integer.valueOf(tail[i]);
            }

            System.out.println(maxRangeSum.calc(results, d));
        }
    }
}

class MaxRangeSum {

    public int calc(int[] array, int d) {

        int total = 0;

        for (int i = 0; i <= array.length - d; i++) {
            int[] slice = Arrays.copyOfRange(array, i, i + d);
            int current = 0;

            for (int x : slice) {
                current += x;
            }

            total = Math.max(total, current);
        }

        return total;
    }
}
