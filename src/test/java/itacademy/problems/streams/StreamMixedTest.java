package itacademy.problems.streams;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class StreamMixedTest {
    @Test
    public void doubleNumbers() {
        Stream<Integer> input = Stream.of(0, 1, 2, 3, 4, 5);

        // TODO: double numbers
        List<Integer> doubleNumbers = new ArrayList<>();

        assertThat(doubleNumbers, is(Arrays.asList(0, 2, 4, 6, 8, 10)));
    }

    @Test
    public void findEvenNumbers() {
        Stream<Integer> input = Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // TODO: find only the even numbers
        List<Integer> evenNumbers = new ArrayList<>();

        assertThat(evenNumbers, is(Arrays.asList(0, 2, 4, 6, 8, 10)));
    }

    @Test
    public void flatteningLists() {
        Stream<List<Integer>> input = Stream.of(asList(1, 2), asList(3, 4));
        // TODO: flatten the lists into one list
        List<Integer> together = new ArrayList<>();

        assertEquals(asList(1, 2, 3, 4), together);
    }
}
