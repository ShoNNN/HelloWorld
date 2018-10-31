package FileOperation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public void reader(){
        String str;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(
                    "C:\\Users\\user\\Desktop\\IntelliJ IDEA workspace\\HelloWorld\\src\\FileOperation\\text.txt"));
            while ((str = reader.readLine()) != null){
                System.out.println(str);
            }
        } catch (IOException ex){
            System.out.println("IOException");
            System.out.println(ex.getMessage());
        }
    }

    public void secondReader(){
        try {
//            int num;
                String str;
            FileReader reader = new FileReader(
                    "C:\\Users\\user\\Desktop\\IntelliJ IDEA workspace\\HelloWorld\\src\\FileOperation\\text.txt"
            );
            while ((str = reader.getEncoding()) != null){
                System.out.println(str);
            }
        } catch (FileNotFoundException ex){
            System.out.println("FileNotFoundException");
        } catch (IOException ex){
            System.out.println("IOException");
        }
    }
}
