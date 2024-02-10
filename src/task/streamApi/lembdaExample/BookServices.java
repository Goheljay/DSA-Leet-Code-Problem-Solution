package task.streamApi.lembdaExample;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookServices {

    public List<Book> getBookSorted(){
        List<Book> books= new BookDAO().getBooks();
        Collections.sort(books,new MyComparetor());
        return books;
    }


    public static void main(String[] args) {
        System.out.println(new BookServices().getBookSorted());
    }
}

class MyComparetor implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return o1.bookPrice-o2.bookPrice;

    }
}
