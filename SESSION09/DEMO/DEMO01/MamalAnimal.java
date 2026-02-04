package SESSION09.DEMO.DEMO01;

import java.util.Scanner;

public class MamalAnimal extends Animal {
    private String foodType;
    private boolean isLiveWithHuman;
    private String mamalSound;

    public MamalAnimal() {
        super();
    }

    public MamalAnimal(String animalName, int numberOfLegs, String furColor, int everageLifeExpectancy, String foodType, boolean isLiveWithHuman, String mamalSound) {
        super(animalName, numberOfLegs, furColor, everageLifeExpectancy);
        this.foodType = foodType;
        this.isLiveWithHuman = isLiveWithHuman;
        this.mamalSound = mamalSound;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public boolean isLiveWithHuman() {
        return isLiveWithHuman;
    }

    public void setLiveWithHuman(boolean liveWithHuman) {
        isLiveWithHuman = liveWithHuman;
    }

    public String getMamalSound() {
        return mamalSound;
    }

    public void setMamalSound(String mamalSound) {
        this.mamalSound = mamalSound;
    }

    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------");
        super.input();
        System.out.print("Kiểu thức ăn: ");
        foodType = sc.nextLine();

        System.out.print("Sống với con người (True: Có | False: Không)");
        isLiveWithHuman = sc.nextBoolean();
        sc.nextLine();

        System.out.print("Tiếng kêu: ");
        mamalSound = sc.nextLine();
    }

    @Override
    public void display() {
        System.out.println("----------HIỂN THỊ THÔNG TIN-----------");
        super.display();
        System.out.println("Kiểu thức ăn: "+ foodType);
        System.out.println("Sống với con người: "+ (isLiveWithHuman ? "Có" : "Không"));
        System.out.println("Tiếng kêu: "+ mamalSound);
    }
}
