package br.com.anmaia.stepwiseWord;

import br.com.anmaia.stepwiseWord.Main.StepwiseWord;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Unit tests for {@link StepwiseWord}.
 * Created by andremaia on 2015-11-12.
 */
public class StepwiseWordTest {

    StepwiseWord target = new StepwiseWord();

    @Test
    public void oneWord() {
        final String world = "hello";

        final String actual = target.transform(world);

        assertThat("h *e **l ***l ****o", is(actual));
    }

    @Test
    public void twoWordsWithDifferentLength() {
        final String world = "hello a";

        final String actual = target.transform(world);

        assertThat("h *e **l ***l ****o", is(actual));
    }

    @Test
    public void twoWordsWithTheSameLength() {
        final String world = "hello world";

        final String actual = target.transform(world);

        assertThat("h *e **l ***l ****o", is(actual));
    }

    @Test
    public void twoWordsWithTheSameLength_shouldSelectTheFirstWord() {
        final String world = "world hello";

        final String actual = target.transform(world);

        assertThat("w *o **r ***l ****d", is(actual));
    }

    @Test
    public void sample1() {
        final String world = "cat dog hello";

        final String actual = target.transform(world);

        assertThat("h *e **l ***l ****o", is(actual));
    }

    @Test
    public void sample2() {
        final String world = "stop football play";

        final String actual = target.transform(world);

        assertThat("f *o **o ***t ****b *****a ******l *******l", is(actual));
    }

    @Test
    public void sample3() {
        final String world = "music is my life";

        final String actual = target.transform(world);

        assertThat("m *u **s ***i ****c", is(actual));
    }

}