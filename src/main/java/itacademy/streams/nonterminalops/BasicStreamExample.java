package itacademy.streams.nonterminalops;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BasicStreamExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");

        List<String> lowered = stringList.stream()             // stream initiation
                .map(s -> s.toLowerCase())                     // non terminal operation
                .collect(Collectors.toList());                 // terminal operation

        System.out.println("lowered = " + lowered);
    }
}
