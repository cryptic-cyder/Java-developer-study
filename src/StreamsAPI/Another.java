package StreamsAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Another {
    public static void main(String[] args) {

       List<Integer> integerList = List.of(3,5,2,1,3,7,6);

       integerList.stream()
               .forEach(
                       element-> System.out.println(element)
               );

       // Modifying values
       List<Double> changedList = integerList.stream()
               .map(element-> element*1.1)
               .collect(Collectors.toList());

       changedList.stream().
               forEach(changedLists->
                       System.out.println(changedLists)
               );

       // Filtering values less than or equal to 2
       List<Integer> specificInteger = integerList.stream()
               .filter(integer -> integer>2)
               .collect(Collectors.toList());

       System.out.println(specificInteger);

       // Skip first two, take next 3 and skip rest elements
       List<Integer> specificPortion = integerList.stream()
               .skip(2)
               .limit(3)
               .collect(Collectors.toList());

       specificPortion.stream()
               .forEach(specificPortions->
                       System.out.println(specificPortions)
               );

       List<Integer> sortedList = integerList.stream()
               .sorted((o1, o2) -> o1.compareTo(o2))
               .collect(Collectors.toList());

       sortedList.stream()
               .forEach(sortedLists->
                       System.out.print(sortedLists+" ")
               );

       // Find total sum
       int totalSum = integerList.stream()
               .reduce(0, (acc,x)-> acc+x );

       System.out.println(totalSum);

       // Find average
       Double avg =integerList.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println(avg);

        List<String> stringList = List.of("Red","Green","Black","Blue", "Yellow");

        // Uppercase-lowercase conversion
        List<String> uppercaseStrings = stringList.stream()
                .map(e->e.toUpperCase())
                .collect(Collectors.toList());

        uppercaseStrings.stream()
                .forEach(e-> System.out.print(e+" "));

        System.out.println();

        // Sum of Even
        int sumOfEven = integerList.stream()
                .filter(num->num%2==0)
                .mapToInt(Integer::intValue).sum();

        System.out.println(sumOfEven);

        // Sum of ODD
        int sumOfOdd = integerList.stream()
                .filter(num->num%2!=0)
                .reduce(0, (acc,x)->acc+x);

        System.out.println(sumOfOdd);

        // Find distinct elements
        Set<Integer> set = integerList.stream()
                .collect(Collectors.toSet());

        System.out.println(set);

        // Find distinct elements
        List<Integer> collect = integerList.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(collect);

        //Count the string starting with the 'B'
        long count = stringList.stream().filter(s->s.startsWith(String.valueOf('B'))).count();
        System.out.println(count);

        //Sorting
        List<String> sorted = stringList.stream().sorted((o1, o2) -> o1.compareToIgnoreCase(o2)).collect(Collectors.toList());
        System.out.println(sorted);

        // Second smallest
        int secondSmallest = integerList.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst().orElse(0);

        System.out.println(secondSmallest);

        // Second largest
        int secondLargest = integerList.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().orElse(0);

        System.out.println(secondLargest);

    }
}
