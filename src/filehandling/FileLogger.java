package filehandling;

import java.io.FileWriter;
import java.io.IOException;

/**
 * A logging class that logs to a file.
 */
public class FileLogger implements Logger {

    FileWriter fileWriter;

    public FileLogger() {
        try {
            this.fileWriter = new FileWriter("text.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void log(String message) {
        try {
            fileWriter.write(message);
        } catch (IOException e) {
            System.out.println("Unable to write to file");
            e.printStackTrace();
        }
        System.out.println(message);
    }
}
