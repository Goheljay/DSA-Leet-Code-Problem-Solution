package task.opps.objects;

public class UsingClone implements Cloneable {


//    protected Object clone() throws CloneNotSupportedException
//    {
//        return super.clone();
//    }

    String name = "Hello World";
    public static void main(String[] args) {
        UsingClone cloneObj = new UsingClone();

        try{
            UsingClone cloneObj1 = (UsingClone) cloneObj.clone();
            System.out.println(cloneObj1.name);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
