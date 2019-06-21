import java.util.Random;
import java.util.Scanner;

public class Main {


    //Function to roll the dice
    public static int dice_roll() {
        Random r = new Random();
        int roll = 1 + r.nextInt(6);
        return roll;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int roll1;
        int roll2;
        int score = 0;
        boolean flag = true;
        String response;

        System.out.println("Welcome! Let's Play Roll Dice!");

        while (flag) {
            roll1 = dice_roll();
            roll2 = dice_roll();
            System.out.println("Your rolls " + roll1 + " & " + roll2);
            if (roll1 == 1 && roll2 == 1) {
                score = score + 25;
                System.out.println("Score: " + score);
                if(score>100){
                    flag = false;
                }
            }
            else if (roll1 == 1 || roll2 == 1) {
                System.out.println("Score: " + score);
            }
            else {
                score = score + roll1 + roll2;
                System.out.println("Score: " + score);
                if(score>100){
                    flag = false;
                }
            }
            if((score<100) && (flag = true)) {
                System.out.print("Roll again?");
                response = in.next();
                if (response.equals("yes")) {
                    flag = true;
                } else {
                    flag = false;
                }
            }

        }

        if (score > 100) {
            System.out.println("You have scored over 100!");
            System.out.println("Thank You For Playing!");
        } else {
            System.out.println("Thank You For Playing!");
        }
    }
}
