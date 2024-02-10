package task.streamApi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateMethod {
    public static void main(String[] args) {
        Predicate<String> predicate = (s) -> {
            if (s.length() > 5) {
                return true;
            }
            return false;
        };

        System.out.println(predicate.test("hello"));
    }
}

//write with stream

class WithStream{
    public static void main(String[] args) {
        Predicate<Integer> priPredicate = (t)-> t%2 == 0;

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9);
        list.stream().filter(priPredicate).forEach(t-> System.out.println("print "+t));
    }
}


class MapReduceDemo{
    public static void main(String[] args) {
        List<Integer> mapReduceList = List.of(1,2,3,4,5,6,7,8,9);

        //Using Stream
        int allSum = mapReduceList.stream().mapToInt(p -> p).sum();
        System.out.println(allSum);

        //Using Reduce
        Integer reduceSum = mapReduceList.stream().reduce(0, (p, q) -> p + q);
        System.out.println(reduceSum);
    }
}
