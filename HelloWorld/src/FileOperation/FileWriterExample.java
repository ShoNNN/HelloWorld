package FileOperation;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterExample {
    public void writer(){
        StringBuilder str;
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите \"stop\" что бы остановить запись");
        try {
            FileWriter fileWriter = new FileWriter(
                    "C:\\Users\\user\\Desktop\\IntelliJ IDEA workspace\\HelloWorld\\src\\FileOperation\\text.txt"
            );
            do {
                System.out.println(": ");
                str = new StringBuilder(scanner.readLine());
                if (str.toString().compareTo("stop") == 0) break; //break выполняется, если строка не равна стоп
                str.append("\n");
                fileWriter.write(str.toString());

            } while (str.toString().compareTo("stop") != 0);
            fileWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
