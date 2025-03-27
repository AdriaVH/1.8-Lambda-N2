package ex1.main;

import ex1.interfaces.ListFilter;

import java.util.ArrayList;
import java.util.List;


public abstract class Main implements ListFilter {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Joan");
        names.add("Maria");
        names.add("Pere");
        names.add("Aina");
        names.add("Carlos");
        names.add("Ana");

        ListFilter.filterByFirstLetter(names, 'A');

    }
}