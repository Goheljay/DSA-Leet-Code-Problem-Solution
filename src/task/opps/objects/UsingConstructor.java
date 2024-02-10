package task.opps.objects;

import java.lang.reflect.*;

//Using Constructor
public class UsingConstructor {
    private String name;

    UsingConstructor(){}

    public UsingConstructor(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        try{
            Constructor<UsingConstructor> constructor = UsingConstructor.class.getDeclaredConstructor();
            UsingConstructor r = constructor.newInstance();
            r.setName("Hello World");
            System.out.println(r.name);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


