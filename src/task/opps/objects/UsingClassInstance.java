package task.opps.objects;

public class UsingClassInstance {
    String name="Hello world";
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("com.opps.ObjClass");
            ObjCLass objCLass = (ObjCLass) cls.newInstance();
            System.out.println(objCLass);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
