package SESSION09.SESSION09_01;

import java.util.Scanner;

public class Person {
    private String fullName;
    private int age;

    public Person(){};

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập họ tên: ");
        fullName = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        age = sc.nextInt();
        sc.nextLine();
    }

    public void display(){
        System.out.println("FullName: "+ fullName);
        System.out.println("Age: "+ age);
    }
}
