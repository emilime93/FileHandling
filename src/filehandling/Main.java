package filehandling;

/**
 * Created by Emil on 2017-05-09.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        ClassThatLogs classThatLogs = new ClassThatLogs();

        classThatLogs.setLogger(new FileLogger());
        main.logStuffTenTimes(classThatLogs);

        classThatLogs.setLogger(new SpecialLogger());
        main.logStuffTenTimes(classThatLogs);
    }

    private void logStuffTenTimes(Logger logger) {
        for (int i = 0; i < 10; i++) {
            logger.log(Integer.toString(i));
        }
    }
}
