package ex1.interfaces;

import java.util.List;
import java.util.stream.Collectors;

public interface ListModifier {
    static List<Object> replaceText (List<Object> list, String toReplace, String replacer) {
        return list.stream().map( x -> x.toString().contains(toReplace) ?
                x.toString().replace(toReplace, replacer) : x)
                .toList();
    }
    static List<Object> showElementsWithNumbers (List<Object> list){
        return list.stream().filter(x -> x.toString().matches(".*\\d.*") ).toList();
    }
}
