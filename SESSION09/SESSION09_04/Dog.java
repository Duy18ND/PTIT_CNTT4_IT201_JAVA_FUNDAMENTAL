package SESSION09.SESSION09_04;

public class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("Gâu Gâu!");
    }
    //Phương thức riêng
    public void watchHouse() {
        System.out.println("Chó đang trông nhà...");
    }
}
