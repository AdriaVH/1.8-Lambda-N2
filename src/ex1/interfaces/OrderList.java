package ex1.interfaces;

import java.util.Collections;
import java.util.List;

public interface OrderList {
    static List<Object> alphaFirstLetter(List<Object> list) {
        return list.stream().sorted((x, y) -> String.valueOf(x).compareToIgnoreCase(String.valueOf(y))).toList();
    }

    static List<Object> firstStringsContaining(List<Object> list, String contains) {
        return list.stream().sorted((x,y) -> Boolean.compare(
                String.valueOf(x).contains(contains),String.valueOf(y).contains(contains)))
                .toList();
    }
}