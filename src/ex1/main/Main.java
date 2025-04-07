package ex1.main;

import ex1.interfaces.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println("Ex1");
        List<String> names = new ArrayList<>(Arrays.asList(
                "Joan", "Maria", "Pere", "Aina", "Carlos", "Ana"));
        ListFilter.filterByFirstLetter(names, 'A');
        ListFilter.filterByLength(names, 3);
        System.out.println(ListFilter.filterByFirstLetterAndLength(names, 'A', 3));


        System.out.println("Ex2");
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(ListIntToString
                .addPrefixToEvenOddSeparatedBy(intList, "e", "o", ", "));

        System.out.println("Ex3");
        Arithmetics arithmetics = (x, y) -> x + y;
        System.out.println(arithmetics.operation(2,3));


        List<Object> mixedList = Arrays.asList("Hello", 123, "abc123", 45.67, "Test456", 789);

        System.out.println("Ex4");
        System.out.println(OrderList.alphaFirstLetter(mixedList));
        System.out.println(OrderList.alphaAllString(mixedList));

        System.out.println(OrderList.firstStringsContaining(mixedList,"e"));

        System.out.println(ListModifier.replaceText(mixedList, "a", "4"));

        System.out.println(ListModifier.showElementsWithNumbers(mixedList));
    }
}