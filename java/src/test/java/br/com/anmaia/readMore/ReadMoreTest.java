package br.com.anmaia.readMore;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for {@link ReadMore}.
 * <p>
 * Created by andremaia on 2015-11-11.
 */
public class ReadMoreTest {

    ReadMore target = new ReadMore();

    @Test
    public void sample1() {
        final String input = "Tom exhibited.";

        final String result = target.trim(input);

        assertEquals("Tom exhibited.", result);
    }

    @Test
    public void sample2() {
        final String input = "Amy Lawrence was proud and glad, and she tried to make Tom see it in her face - but he wouldn't look.";

        final String result = target.trim(input);

        assertEquals("Amy Lawrence was proud and glad, and... <Read More>", result);
    }


    @Test
    public void sample3() {
        final String input = "Tom was tugging at a button-hole and looking sheepish.";

        final String result = target.trim(input);

        assertEquals("Tom was tugging at a button-hole and looking sheepish.", result);
    }

    @Test
    public void sample4() {
        final String input = "Two thousand verses is a great many - very, very great many.";

        final String result = target.trim(input);

        assertEquals("Two thousand verses is a great many -... <Read More>", result);
    }

    @Test
    public void sample5() {
        final String input = "Tom's mouth watered for the apple, but he stuck to his work.";

        final String result = target.trim(input);

        assertEquals("Tom's mouth watered for the apple, but... <Read More>", result);
    }

}