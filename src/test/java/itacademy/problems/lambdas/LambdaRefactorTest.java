package itacademy.problems.lambdas;

import itacademy.lambas.Apple;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;

import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LambdaRefactorTest {

    //TODO: refactor with lambda expression
    @Test
    public void sortApplesByWeight() {
        List<Apple> apples = asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"));
        apples.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple apple1, Apple apple2) {
                return apple2.getWeight().compareTo(apple1.getWeight());
            }
        });

        assertThat(apples, is(asList(new Apple(155, "green"), new Apple(120, "red"), new Apple(80, "green"))));
    }

    // TODO: refactor with lambda expression
    // TODO: refactor with standard functional interface
    @Test
    public void filterGreenApples() {

        List<Apple> apples = asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"));

        List<Apple> greenApples = filterApples(apples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "green".equals(apple.getColor());
            }
        });

        assertThat(greenApples, is(asList(new Apple(80, "green"), new Apple(155, "green"))));

    }

    //TODO: refactor with lambda expressions
    @Test
    public void squareNumber() {
        UnaryOperator<Integer> square = new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * integer;
            }
        };

        assertThat(square.apply(2), is(4));
    }


    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    interface ApplePredicate {
        boolean test(Apple apple);
    }

}