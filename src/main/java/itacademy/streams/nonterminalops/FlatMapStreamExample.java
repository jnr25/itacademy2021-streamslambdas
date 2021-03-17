package itacademy.streams.nonterminalops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapStreamExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        stringList.add("ONE one");
        stringList.add("TWO two");
        stringList.add("THREE three");

        List<String> stringsWords = stringList.stream()
                .flatMap(s -> {
                    String[] split = s.split(" ");
                    return (Stream<String>) Arrays.asList(split).stream();
                })
                .collect(Collectors.toList());

        System.out.println("items = " + stringsWords);
    }
}