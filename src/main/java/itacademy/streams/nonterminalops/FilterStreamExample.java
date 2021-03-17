package itacademy.streams.nonterminalops;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStreamExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");

        List<String> filteredStrings = stringList.stream()
                .filter(s -> "TWO".equals(s))
                .collect(Collectors.toList());

        System.out.println("only TWO = " + filteredStrings);
    }
}
