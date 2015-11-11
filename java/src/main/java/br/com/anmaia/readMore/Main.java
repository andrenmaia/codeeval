package br.com.anmaia.readMore;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * https://www.codeeval.com/open_challenges/167
 * <p>
 * Created by andremaia on 2015-11-11.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        ReadMore readMore = new ReadMore();

        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(readMore.trim(line));
        }
    }

}

class ReadMore {

    public static final String READ_MORE = "... <Read More>";

    public String trim(final String input) {
        if (input.length() <= 55) {
            return input;
        }

        String slice = input.substring(0, 40);
        int last = slice.lastIndexOf(' ');

        if (last != -1) {
            slice = slice.substring(0, last);
        }


        return slice.concat(READ_MORE);
    }
}
