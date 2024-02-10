package task.streamApi.StreamExample;

import javax.xml.crypto.Data;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTexServices {
//    public static List<Emplyee> eveluateTextUser(){
//        return Datbase.getEmployeeDetail().stream().filter(t -> t.getSalary() > 60000).collect(Collectors.toList());
//    }

    public static void main(String[] args) {
        /**
         * simple comperesion with salary which come to model class using database class
         */
        System.out.println("----------------------Using filter ---------------------------");
        Datbase.getEmployeeDetail().stream().filter(t->t.getSalary() > 60000).forEach(System.out::println);
        /**
         * get data from database using model class and pass in filter and sort it.
         */
        System.out.println("------------------------using sorted in stream-----------------------------");
        List<Emplyee> incomeTexSalary = Datbase.getEmployeeDetail().stream().filter(salary -> salary.getSalary() > 60000)
                .sorted(Comparator.comparing(salary -> salary.getSalary())).collect(Collectors.toList());

        for (Emplyee salary: incomeTexSalary) {
            System.out.println(salary);
        }

        System.out.println("-----------------------Using Iterator--------------------------------");

        Iterator<Emplyee> emplyeeIterator = incomeTexSalary.iterator();
        for (int i=0; emplyeeIterator.hasNext(); i++){
            System.out.println(emplyeeIterator.next());
        }
    }
}
