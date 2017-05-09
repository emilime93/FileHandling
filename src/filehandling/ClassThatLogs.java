package filehandling;

/**
 * Created by Emil on 2017-05-09.
 */
public class ClassThatLogs implements Logger {

    private Logger logger;

    public void log(String message) {
        logger.log(message);
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
