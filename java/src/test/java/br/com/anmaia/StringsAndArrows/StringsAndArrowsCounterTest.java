package br.com.anmaia.StringsAndArrows;

import br.com.anmaia.StringsAndArrows.StringsAndArrowsCounter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for {@link StringsAndArrowsCounter}.
 * <p>
 * Created by andremaia on 2015-11-10.
 */
public class StringsAndArrowsCounterTest {

    StringsAndArrowsCounter target = new StringsAndArrowsCounter();

    @Test
    public void oneArrowToLeft() {
        final String arrow = "<--<<";

        int count = target.count(arrow);

        assertEquals(count, 1);
    }

    @Test
    public void oneArrowToRight() {
        final String arrow = ">>-->";

        int count = target.count(arrow);

        assertEquals(count, 1);
    }

    @Test
    public void twoArrowsLeftAndRight() {
        final String arrow = "<--<<>>-->";

        int count = target.count(arrow);

        assertEquals(count, 2);
    }

    @Test
    public void inputSample1() {
        final String arrow = "<--<<--<<";

        int count = target.count(arrow);

        assertEquals(count, 2);
    }

    @Test
    public void inputSample2() {
        final String arrow = "<<>>--><--<<--<<>>>--><";

        int count = target.count(arrow);

        assertEquals(count, 4);
    }

    @Test
    public void inputSample3() {
        final String arrow = "<-->>";

        int count = target.count(arrow);

        assertEquals(count, 0);
    }


}