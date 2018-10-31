package SetGetExample;

import java.io.File;

public class Example {

    private File file;

    public void setFile(String file) {
        if (file.substring(file.length() - 3, file.length()).equals("txt")){
            this.file = new File(file);
        } else System.out.println("Можно читать только файлы формата \"txt\".");
    }

    public File getFile() {
        return file;
    }
}
