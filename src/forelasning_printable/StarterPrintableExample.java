package forelasning_printable;

/**
 * The starter/controller class for the printable example
 */
public class StarterPrintableExample {

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print(new Horse("Icelandic", 200, 240));
        printer.print(new Boat("Yamaha", "X50"));
        printer.print(new BankAccount(13376000, "Daniel", 100));
    }
}
