package br.com.anmaia.stringsAndArrows;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by cin_amaia on 3/20/15.
 * <p>
 * ref:
 * https://www.codeeval.com/open_challenges/203/
 * <p>
 * Created by andremaia on 2015-11-10.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;

        final StringsAndArrowsCounter counter = new StringsAndArrowsCounter();

        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            System.out.println(counter.count(line));
        }
    }

}

class StringsAndArrowsCounter {

    private static final char[] LEFT = new char[]{'<', '-', '-', '<', '<'};
    private static final char[] RIGHT = new char[]{'>', '>', '-', '-', '>'};
    private static final int ARROW_SIZE = 5;

    public int count(final String text) {
        int counter = 0;


        for (int i = 0; i < text.length(); i++) {


            if (text.length() - i < ARROW_SIZE)
                break;


            char[] temp = new char[ARROW_SIZE];
            text.getChars(i, i + ARROW_SIZE, temp, 0);
            if (Arrays.equals(temp, LEFT) || Arrays.equals(temp, RIGHT)) {
                counter++;
            }
        }


        return counter;
    }
}
