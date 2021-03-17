package itacademy.answers.lambdas;

import itacademy.lambas.Apple;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LambdaRefactorTest {

    @Test
    public void sortApplesByWeight() {
        List<Apple> apples = asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"));
        apples.sort((apple1, apple2) -> apple2.getWeight().compareTo(apple1.getWeight()));

        assertThat(apples, is(asList(new Apple(155, "green"), new Apple(120, "red"), new Apple(80, "green"))));
    }

    @Test
    public void filterGreenApples() {

        List<Apple> apples = asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"));

        List<Apple> greenApples = filterApples(apples, apple -> "green".equals(apple.getColor()));

        assertThat(greenApples, is(asList(new Apple(80, "green"), new Apple(155, "green"))));

    }

    @Test
    public void squareNumber() {
        UnaryOperator<Integer> square = integer -> integer * integer;

        assertThat(square.apply(2), is(4));
    }

    private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

}