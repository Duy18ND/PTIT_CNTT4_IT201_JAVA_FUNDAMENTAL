package SESSION12.Abstract_Interface.QuanLyThue;

import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList<Vehicle> vehicleList = new ArrayList<>();

        vehicleList.add(new Car("Toyota Camry", 1000000000));
        vehicleList.add(new Car("Mazda 3", 800000000));

        vehicleList.add(new Motorbike("Honda SH", 100000000));
        vehicleList.add(new Motorbike("Yamaha Vision", 40000000));

        //In
        System.out.println("BẢNG TÍNH THUẾ PHƯƠNG TIỆN");

        for(Vehicle v : vehicleList){
            System.out.println("Hãng xe: "+ v.getBrand());
            System.out.println("Giá trị: "+ String.format("%,.0f",v.getPrice()));
            System.out.println("Thuế phải nộp: => "+ String.format("%,.0f", v.calculateTax()));
            System.out.println("=====================================");
        }
    }
}
