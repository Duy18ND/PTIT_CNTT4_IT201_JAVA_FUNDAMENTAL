package SESSION09.SESSION09_04;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();

        System.out.print("Phương thức chung: ");
        animal.sound();
        System.out.println("\n----- Xử lý ép kiểu------");
        if(animal instanceof Dog){
            Dog dogCasted = (Dog) animal;
            dogCasted.watchHouse();
        }else{
            System.out.println("Đây không phải là Dog!");
        }
    }
}
