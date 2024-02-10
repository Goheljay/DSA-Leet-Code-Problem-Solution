package task.streamApi;

import task.streamApi.StreamExample.Datbase;
import task.streamApi.StreamExample.Emplyee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSortingDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(1);
        Collections.sort(numbers);
        System.out.println(numbers);

        List<Emplyee> emplyees = Datbase.getEmployeeDetail();

        /**
         * Using Lembda Expression
         */
        Collections.sort(emplyees,(o1,o2)->(o1.getSalary() - o2.getSalary()));
        //Using Comparing
        Collections.sort(emplyees, Comparator.comparing(emp -> emp.getSalary()));
        System.out.println(emplyees);

        System.out.println("---------------------------------------------------------------------");

        //stream method
        emplyees.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::println);

    }
}

