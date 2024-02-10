package task.streamApi.OptioanlDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class OptinalDemo {

    public Customer getAllCustEmail(String email) throws Exception {
        List<Customer> custEmail = EkartDataBase.getAll();
        return custEmail.stream().filter(customer -> customer.getEmail().equals(email))
                .findAny().orElseThrow(()-> new Exception("Not Availbale"));
    }

    public static void main(String[] args) throws Exception {
        Customer customer = new Customer(1,"John","null" , Arrays.asList("3939393939","2154873690"));

        //empty
        Optional<Object> emptyOptinal = Optional.empty();
        //of
        //Optional<Object> ofOptinal = Optional.of(customer.getEmail());
        //nullAble
        Optional<Object> nullAbleOptinal = Optional.ofNullable(customer.getEmail());
        //System.out.println(nullAbleOptinal.orElse("default..."));
        System.out.println(nullAbleOptinal.orElseGet((() -> "default...")));

        OptinalDemo custEmail = new OptinalDemo();
        custEmail.getAllCustEmail("pqr");
    }
}

class GFG{
    public static void main(String[] args) throws IOException {
        File file = new File("Textfile.txt");
        file.createNewFile();

        //parallel Stream
        Stream<String> text = Files.lines(Path.of("Textfile.txt"));
        text.parallel().forEach(System.out::println);
        text.close();
    }
}
