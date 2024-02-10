package task.streamApi;

import java.util.*;
import java.util.stream.Collectors;

public class SortedMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> sortedMApDemo = new HashMap<>();
        sortedMApDemo.put("Eight", 8);
        sortedMApDemo.put("four", 4);
        sortedMApDemo.put("Ten",10);
        sortedMApDemo.put("two",2);
        System.out.println(sortedMApDemo);

        /**
         * Using Normal FUnction
         */
        List<Map.Entry<String,Integer>> entries = new ArrayList<>(sortedMApDemo.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        /**
         * Using Lembda and stream
         */
        Collections.sort(entries,(o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        sortedMApDemo.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        //Applied for each loop and print it.

        for (Map.Entry<String,Integer> entry: entries) {
            System.out.println(entry.getKey() +": "+entry.getValue());
        }
    }
}
