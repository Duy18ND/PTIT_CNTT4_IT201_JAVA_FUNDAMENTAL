package SESSION09.DEMO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {
    private String fullName;
    private Boolean gender;
    private Date birthDay;
    private String address;

    public Person(){};

    public Person(String fullName, Boolean gender, Date birthDay, String address) {
        this.fullName = fullName;
        this.gender = gender;
        this.birthDay = birthDay;
        this.address = address;
    }

    public void input(){
     Scanner input = new Scanner(System.in);

        System.out.print("Nhập họ tên: ");
        fullName = input.nextLine();

        System.out.print("Nhập giới tính: ");
        gender = Boolean.parseBoolean(input.nextLine());

        System.out.print("Nhập ngày sinh: ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{
            birthDay = sdf.parse(input.nextLine());
        }catch (ParseException e){
            e.printStackTrace();
        }

        System.out.print("Nhập quê quán: ");
        address = input.nextLine();
    }

    public String display() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Kiểm tra null để tránh lỗi nếu nhập ngày sinh bị sai
        String strDate = (birthDay != null) ? sdf.format(birthDay) : "Chưa có";

        return "fullName: " + fullName +
                "\ngender: " + (gender ? "Nam" : "Nữ") +
                "\nbirthDay: " + strDate +
                "\naddress: " + address;
    }
}
