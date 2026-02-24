package SESSION12.DongGoi;

public class Main {
    static void main() {
        BankAccount b1 = new BankAccount(500000);
        BankAccount b2 = new BankAccount(300000);
        BankAccount b3 = new BankAccount(330000);
        BankAccount b4 = new BankAccount(90000);

        BankAccount[] bookList = {b1,b2,b3,b4};

        b1.deposit(5000);
        b1.withraw(50000000);
    }
}
