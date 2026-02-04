package SESSION09.TongHop;

import java.util.Scanner;

public class Manager extends Employee {
    private int menberManager;
    private double bounus;

    public Manager(){super();};

    public Manager(String empName, double basicSalary, int menberManager, double bounus) {
        super(empName, basicSalary);
        this.menberManager = menberManager;
        this.bounus = bounus;
    }

    public int getMenberManager() {
        return menberManager;
    }

    public void setMenberManager(int menberManager) {
        this.menberManager = menberManager;
    }

    public double getBounus() {
        return bounus;
    }

    public void setBounus(double bounus) {
        this.bounus = bounus;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Nhập số người quản lý: ");
        menberManager = sc.nextInt();
        System.out.print("Nhập bonus: ");
        bounus = sc.nextDouble();
    }

    @Override
    public void display() {
        System.out.println("---------------------------------");
        super.display();
        System.out.println("Số người quản lý: "+ menberManager);
        System.out.printf("Tiền thưởng (Bonus): %.2f\n", bounus);
    }
}
