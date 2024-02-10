package task.streamApi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SupplierExample {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(15,2,3,4,5,6,7,8,9);
        Supplier<Integer> nothing = () -> -1;
        Integer value = list1.stream().findAny().orElseGet(nothing);
        System.out.println(value);

        //Map using stream
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");

        List<Map.Entry<Integer, String>> collect = map.entrySet().stream().filter(t -> t.getKey().equals(3)).collect(Collectors.toList());
        System.out.println(collect);
        map.forEach((key,val) -> System.out.println(key + ":"+val));
        map.entrySet().stream().forEach(obj -> System.out.println(obj));

    }
}
