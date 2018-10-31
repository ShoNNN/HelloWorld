package ExeptionExample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionEx {
    public static void main(String[] args) {
        ExceptionEx exceptionEx = new ExceptionEx();
        exceptionEx.makeException();
        try {
            exceptionEx.makeExceptionAgain();
        } catch (FileNotFoundException ex){
            System.out.println("FileNotFoundException");
        } catch (IOException ex){
            System.out.println("IOException");
        }

    }

    public void makeException(){
        String str;
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("text.txt"));
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }
            throw new NullPointerException();
        }catch (NullPointerException ex){
            System.out.println("NullPointerException");
        } catch (FileNotFoundException ex){
            System.out.println("FileNotFoundException");
        } catch (IOException ex){
            System.out.println("IOException");
        } finally {
            System.out.println("Я исполняюсь всегда");
        }
    }

    public void makeExceptionAgain() throws FileNotFoundException, IOException {
        String str;
            BufferedReader reader = new BufferedReader(
                    new FileReader("text.txt"));
            while ((str = reader.readLine()) != null){
                System.out.println(str);
            }
            Throwable myException = new Throwable();
    }
}
