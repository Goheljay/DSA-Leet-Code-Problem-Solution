package task.streamApi.StreamExample;

import java.util.ArrayList;
import java.util.List;

public class Datbase {
    public static List<Emplyee> getEmployeeDetail() {
        List<Emplyee> emp = new ArrayList<>();
        emp.add(new Emplyee(1,"Roshan", "Civil",60000));
        emp.add(new Emplyee(2,"Jay", "IT",70000));
        emp.add(new Emplyee(3,"Nisarg", "Defence",90000));
        emp.add(new Emplyee(4,"Sourav","Core",40000));
        emp.add(new Emplyee(5,"Parkash","Social",80000));
        return emp;
    }

}
