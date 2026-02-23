package SESSION10.SESSION10_03;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck("Vịt Donald");
        Fish fish = new Fish("Cá Nemo");

        System.out.println("=== KHẢ NĂNG CỦA VỊT ===");
        duck.swim();
        duck.fly();

        System.out.println("\n=== KHẢ NĂNG CỦA CÁ ===");
        fish.swim();
    }
}