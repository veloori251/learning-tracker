package day1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EvenNumbers {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,6,8,10);

        // Direct Printing
        list.stream().filter(num -> num%2==0).forEach(System.out::println);

        // Taking into a list
        List<Integer> result = list.stream().filter(num -> num%2==0).toList();

        System.out.println(result);

        // without duplicates
        //Approach1
        Set<Integer> noDuplicates = list.stream().filter(num -> num%2==0).collect(Collectors.toSet());
        System.out.println(noDuplicates);

        List<Integer> distinct = list.stream().distinct().filter(num -> num%2==0).toList();
        System.out.println(distinct);

    }
}
