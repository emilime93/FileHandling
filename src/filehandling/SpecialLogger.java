package filehandling;

/**
 * Created by Emil on 2017-05-09.
 */
public class SpecialLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("Special log: " + message);
    }
}
