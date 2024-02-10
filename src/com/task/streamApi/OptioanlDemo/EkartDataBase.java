package task.streamApi.OptioanlDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {
    public static List<Customer> getAll(){
        return Stream.of(
                new Customer(1,"John","johan@g.c", Arrays.asList("9764310258","7845123690")),
                new Customer(2,"Raj","raj@gmail.com", Arrays.asList("9764310258","7845123690")),
                new Customer(3,"smith", "smith@g.c", Arrays.asList("9685321470","9865320147")),
                new Customer(4,"peter", "peter@g.c",Arrays.asList("1236457890","7913648520")))
                .collect(Collectors.toList());
    }
}
