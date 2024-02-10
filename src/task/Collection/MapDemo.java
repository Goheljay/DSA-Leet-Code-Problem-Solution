package task.Collection;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> maps = new ConcurrentHashMap<>();
        maps.put("One", 1);
        maps.put("Two", 2);
        maps.put("abcs", 3);
        maps.put("Four",4);
        maps.put("Five", 5);

        System.out.println(maps);
        maps.forEachEntry(0, e -> System.out.println("key: " + e.getKey() + ", Value: " + e.getValue()));

//        for (Map.Entry nums: maps.entrySet()) {
//            System.out.println(nums);
//            System.out.println(nums.getValue());
//        }
    }
}

class DateTimeDmo{
    public static void main(String[] args) {
        LocalTime time = LocalTime.now(ZoneId.of("Indian/Mayotte"));
        System.out.println(time);
        for (String s: ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }
    }
}
