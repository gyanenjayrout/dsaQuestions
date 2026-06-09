package Wissen_technology;

import java.util.*;
import java.util.stream.*;

public class FlattenWithStream {
    
    public static List<Integer> flatten(Object[] array) {
        return Arrays.stream(array)
            .flatMap(obj -> {
                if (obj instanceof Integer) {
                    return Stream.of((Integer) obj);
                } else if (obj instanceof Object[]) {
                    return flatten((Object[]) obj).stream(); // recursive
                } else {
                    return Stream.empty(); // ignore unexpected types
                }
            })
            .collect(Collectors.toList());
    }
    
    public List<String> flatten(List<?> nestedList) {
        List<String> result = new ArrayList<>();
        for (Object item : nestedList) {
            if (item instanceof List) {
                result.addAll(flatten((List<?>) item));  // recursive call
            } else {
                result.add(item.toString());  // base case
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Object[] array = {1, 2, new Object[]{3, 4, new Object[]{5}, 6, 7}};
        List<Integer> flatList = flatten(array);
        
        System.out.println(flatList);  // [1, 2, 3, 4, 5, 6, 7]
    }
}
