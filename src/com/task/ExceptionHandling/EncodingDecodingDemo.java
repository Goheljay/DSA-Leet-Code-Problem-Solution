package task.ExceptionHandling;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncodingDecodingDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String base64Encod = Base64.getEncoder().encodeToString("TutorialsPoint?java8".getBytes("utf-8"));
        System.out.println("ENcodeed Data :- " +base64Encod);

        byte[] base64Decode = Base64.getDecoder().decode("VHV0b3JpYWxzUG9pbnQ/amF2YTg=");
        System.out.println("Original String: " + new String(base64Decode));
    }
}
