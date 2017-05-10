package forelasning_printable;

/**
 * A class to represent a bank account and it's properties.
 */
public class BankAccount implements Printable {

    private int bankAccountNumber;
    private String holder;
    private double balance;

    BankAccount(int bankAccountNumber, String holder, int balance) {
        this.bankAccountNumber = bankAccountNumber;
        this.holder = holder;
        this.balance = balance;
    }

    private int getBankAccountNumber() {
        return bankAccountNumber;
    }

    private String getHolder() {
        return holder;
    }

    private double getBalance() {
        return balance;
    }

    @Override
    public String generatePrintableRepresentation() {
        return String.format("Bank account #:%d that belongs to %s and holds %.2f currencies", getBankAccountNumber(), getHolder(), getBalance());
    }
}
