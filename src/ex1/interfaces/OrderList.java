package ex1.interfaces;

import java.util.Collections;
import java.util.List;

public interface OrderList {
    static List<Object> alphaFirstLetter(List<Object> list) {
        return list.stream().sorted((x, y) ->  Character.compare(String.valueOf(x).toLowerCase().charAt(0), String.valueOf(y).toLowerCase().charAt(0))).toList();//, (String.valueOf(y).charAt(0)))).toList();
    }
    static List<Object> alphaAllString(List<Object> list) {
        return list.stream().sorted((x, y) -> String.valueOf(x).compareToIgnoreCase(String.valueOf(y))).toList();
    }


    static List<Object> firstStringsContaining(List<Object> list, String contains) {
        return list.stream().sorted((x,y) -> Boolean.compare(
                String.valueOf(y).contains(contains),String.valueOf(x).contains(contains)))
                .toList();
    }
}