package task.FileIo;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class CSVWriteDemo {
    public static void main(String[] args) throws Exception {
        List<List<String>> rows = Arrays.asList(
                Arrays.asList("Jean", "author", "Java"),
                Arrays.asList("David", "editor", "Python"),
                Arrays.asList("Scott", "editor", "Node.js")
        );
        String fileName = "E:\\tutorials\\daily-Dsa\\src\\task\\FileIo\\test.csv";

        FileWriter csvWriter = new FileWriter(fileName);
        csvWriter.append("Name");
        csvWriter.append(",");
        csvWriter.append("Role");
        csvWriter.append(",");
        csvWriter.append("Topic");
        csvWriter.append("\n");

        for (List<String> rowData : rows) {
            csvWriter.append(String.join(",", rowData));
            csvWriter.append("\n");
        }

        csvWriter.flush();
        csvWriter.close();


        //Read file

        File csvFile = new File(fileName);
        if (csvFile.isFile()){
            String row;
            BufferedReader bf = new BufferedReader(new FileReader(fileName));
            while ((row = bf.readLine()) != null){
                String[] data = row.split(",");
                System.out.println(Arrays.toString(data));
            }
        }

    }
}
