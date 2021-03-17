package itacademy.streams.terminalops;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamCollectExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("TWO");
        stringList.add("ONE");
        stringList.add("THREE");
        stringList.add("FOUR");

        // Example 1 - to set
        Set<String> streamedStringsToSet = stringList.stream()
                .collect(Collectors.toSet());
        System.out.println("streamed strings to set = " + streamedStringsToSet);


        // Example 2 - to specific implementation of collection: LinkedList, ArrayList, TreeSet, HashSet, ...
        List<String> streamedStringsToLinkedList = stringList.stream()
                .collect(toCollection(LinkedList::new));
        System.out.println("streamed strings to linked list = " + streamedStringsToLinkedList);


        // Example 3 - partitioning by condition
        Map<Boolean, List<String>> partitionedBySize = stringList.stream()
                .collect(partitioningBy(s -> s.length() > 3));
        System.out.println("partitioned by length = " + partitionedBySize);


        // Example 4 - grouping by condition
        Map<Character, List<String>> groupedByByFirstLetter = stringList.stream()
                .collect(groupingBy((String s) -> s.charAt(0)));
        System.out.println("grouped by first letter = " + groupedByByFirstLetter);
    }
}
