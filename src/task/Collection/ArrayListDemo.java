package task.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
    }
}

class LinkListDemo{
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        System.out.println(list1);
    }
}
