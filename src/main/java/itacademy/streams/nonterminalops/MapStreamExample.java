package itacademy.streams.nonterminalops;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreamExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");

        List<Integer> stringsSizes = stringList.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());

        System.out.println("length of items = " + stringsSizes);
    }
}