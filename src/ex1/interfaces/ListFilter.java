package ex1.interfaces;

import java.util.List;
import java.util.stream.Stream;

public interface ListFilter extends Stream {
    static List<String> filterByFirstLetter(List<String> list, char toFilter) {
        return list.stream().filter(x -> x.charAt(0) == toFilter).toList();
    }
    static List<String> filterByLength (List<String> list, int length) {
        return  list.stream().filter( s -> s.length() == length).toList();
    }
    static List<String> filterByFirstLetterAndLength (List<String> list, char toFilter, int length) {
        return  list.stream().filter( s -> (s.charAt(0) == toFilter & s.length() == length)).toList();
    }


}
