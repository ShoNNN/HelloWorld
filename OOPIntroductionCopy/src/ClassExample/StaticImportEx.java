package ClassExample;
//пример статического импорта
import static java.lang.Math.*;

public class StaticImportEx {

    public static void main(String[] args) {

        double hypot = Math.sqrt(Math.pow(1, 2) + Math.pow(2,2));
        double newHypot = sqrt(pow(1,2) + pow(2,2));
    }

}
