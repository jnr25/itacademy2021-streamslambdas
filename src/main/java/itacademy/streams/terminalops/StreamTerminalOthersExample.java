package itacademy.streams.terminalops;

import java.util.*;

public class StreamTerminalOthersExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("TWO");
        stringList.add("ONE");
        stringList.add("THREE");

        // Example 1 - any match
        boolean anyContainsTextThree = stringList.stream()
                .anyMatch(s -> s.equalsIgnoreCase("three"));
        System.out.println("contains any three = " + anyContainsTextThree);

        // Example 2 - all match
        boolean allContainsTextThree = stringList.stream()
                .allMatch(s -> s.equalsIgnoreCase("three"));
        System.out.println("contains all three = " + allContainsTextThree);

        // Example 3 - find first
        Optional<String> firstOne = stringList.stream()
                .filter(s -> s.equals("TWO")).findFirst();
        System.out.println("find first = " + firstOne);
    }
}
