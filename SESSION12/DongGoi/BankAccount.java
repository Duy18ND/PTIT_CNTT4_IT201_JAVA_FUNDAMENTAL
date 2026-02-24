package SESSION12.DongGoi;

import java.sql.SQLOutput;

public class BankAccount {
    private static int autoId = 1;
    private double balance;
    private final String accountId;

    public BankAccount(double balance) {
        this.balance = balance;
        this.accountId = String.format("Acc%02d", autoId);
        autoId++;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        BankAccount.autoId = autoId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountId() {
        return accountId;
    }

    //Nạp tiền
    public void deposit(double amount){
        //Check số tiền nộp
        if(amount > 0){
            balance += amount;
            System.out.println("NẠP THÀNH CÔNG");
            System.out.println("Số tài khoản: " + accountId);
            System.out.println("Số tiền nộp: "+ amount);
            System.out.println("Số dư hiện tại: "+ balance);
        }else{
            System.out.println("Số tiền nộp phải lớn hơn 0!");
        }
    }

    //Rút tiền
    public void withraw(double amount){
        //Kiểm tra so tiền rút
        if(amount <= 0){
            System.out.println("Số tiền rút phải lớn hơn 0");
        }else if(amount > balance){
            //Ngăn chặn rút quá số dư
            System.out.println("Số dư không đủ để rút. Vui lòng xem lại!");
        }else{
            balance -= amount;
            System.out.println("RÚT TIỀN THÀNH CÔNG");
            System.out.println("Số tài khoản: " + accountId);
            System.out.println("Số tiền nộp: "+ amount);
            System.out.println("Số dư hiện tại: "+ balance);
        }
    }

    //Hiển thị thông tin nhanh
    public void display(){
        System.out.println("THÔNG TIN TÀI KHOẢN");
        System.out.println("Chủ TK: " + accountId);
        System.out.println("Số dư: "+ balance);
    }
}
