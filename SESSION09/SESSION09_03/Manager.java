package SESSION09.SESSION09_03;

public class Manager extends Employee {
    private String phongban;

    public Manager() {
        super();
    }

    public Manager(String name, double salary, String phongban) {
        super(name, salary);
        this.phongban = phongban;
    }
    public void display(){
        System.out.println("---------------------");
        System.out.println("Tên: "+ getName());
        System.out.println("Lương: "+ getSalary());
        System.out.println("Tên phòng ban: "+ phongban);
    }
}
