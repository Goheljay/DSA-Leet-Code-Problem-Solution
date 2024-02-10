package task.streamApi.lembdaExample;

import java.util.ArrayList;
import java.util.List;


public class BookDAO {

    public List<Book> getBooks(){
        List<Book> booksList = new ArrayList<>();
        booksList.add(new Book(1,"Core Java", 5000));
        booksList.add(new Book(2,"Advance Java", 2000));
        booksList.add(new Book(3,"Servlet and JSP", 1500));
        booksList.add(new Book(4,"Spring and Hibernet",4500));
        return booksList;
    }

}
