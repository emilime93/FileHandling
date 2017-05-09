package filehandling;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Emil on 2017-05-09.
 */
public class FileLogger implements Logger {

    FileWriter fileWriter;

    public FileLogger() {
        try {
            this.fileWriter = new FileWriter("text.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
