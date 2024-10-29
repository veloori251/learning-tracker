package day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringsToUppercase {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple","mango","grapes","orange");

        List<String> upperCase = list.stream().map(String::toUpperCase).toList();

        System.out.println("Uppercase of each string in a list: "+upperCase);
    }
}
