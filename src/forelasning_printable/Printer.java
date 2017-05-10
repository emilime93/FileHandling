package forelasning_printable;

/**
 * A printer class that can print stuff.
 */
class Printer {

    /**
     * Prints a <code>String</code> representation of an object to the System.out stream
     * @param printable The representation to be printed.
     */
    void print(Printable printable) {
        System.out.println(printable.generatePrintableRepresentation());
    }
}
