package SESSION09.DEMO.DEMO01;

import java.util.Scanner;

public class Bird extends Animal  {
    private boolean isFly;
    private String birdSound;

    public Bird() {
        super();
    }

    public Bird(String animalName, int numberOfLegs, String furColor, int everageLifeExpectancy, boolean isFly, String birdSound) {
        super(animalName, numberOfLegs, furColor, everageLifeExpectancy);
        this.isFly = isFly;
        this.birdSound = birdSound;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public String getBirdSound() {
        return birdSound;
    }

    public void setBirdSound(String birdSound) {
        this.birdSound = birdSound;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Có bay được không (True: có | False: Không): ");
        isFly = sc.nextBoolean();
        sc.nextLine();

        System.out.print("Tiếng hót: ");
        birdSound = sc.nextLine();
    }

    @Override
    public void display(){
        System.out.println("--------------------------------");
        super.display();
        System.out.println("IsFly: "+ (isFly ? "Bay được" : "Không bay được"));
        System.out.println("Bird Sound: "+ birdSound);
    }
}
