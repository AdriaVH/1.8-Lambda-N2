package ex1.interfaces;

import java.util.List;
import java.util.stream.Collectors;

public interface ListIntToString {
    static String addPrefixToEvenOddSeparatedBy (List<Integer> list, String evens, String odds, String separator) {
        return list.stream().map(x -> x % 2 == 0 ? evens + x : odds + x)
                .collect(Collectors.joining(separator));
    }
}
