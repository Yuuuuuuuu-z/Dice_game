import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("What is your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        int total = dice1 + dice2;

        System.out.println("Rolling dice...");
        System.out.println("Die 1: " + dice1);
        System.out.println("Die 2: " + dice2);
        System.out.println("Total value: " + total);
    }
}