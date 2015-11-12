package br.com.anmaia.stepwiseWord;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Problem: https://www.codeeval.com/open_challenges/202/
 * <p>
 * Created by andremaia on 2015-11-12.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;

        StepwiseWord stepwiseWord = new StepwiseWord();

        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            System.out.println(stepwiseWord.transform(line));
        }
    }

    public static class StepwiseWord {

        public String transform(final String world) {

            final String[] worlds = world.split(" ");

            final String selectedWorld = Collections.max(Arrays.asList(worlds), new Comparator<String>() {
                public int compare(String o1, String o2) {
                    return o1.length() - o2.length();
                }
            });

            return transformSelected(selectedWorld);
        }

        private String transformSelected(String world) {
            final StringBuilder builder = new StringBuilder();
            int pos = 0;

            for (char c : world.toCharArray()) {
                builder.append(" ")
                        .append(new String(new char[pos++]).replace("\0", "*"))
                        .append(c);
            }

            return builder.toString().trim();
        }
    }
}
