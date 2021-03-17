package itacademy.lambas.introduction;

import java.util.ArrayList;
import java.util.List;

public class BasicLamdasExample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("ONE");
        strings.add("TWO");
        strings.add("THREE");

        // Example 1 - Functional interface in list
        strings.forEach(s -> System.out.println(s));

        // Example 2 - Functional interface in list using a method reference
        strings.forEach(System.out::print);

        // Example 3 - custom Functional interface usage
        User user = () -> "Some Name";
        System.out.println(user.getName());

    }
}
