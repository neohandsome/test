import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Pick a game! \n [1] Lucky 9 \n [2] Bato Pick");
        int choice = scn.nextInt();

        if (choice == 1) {

        int comno1 = rnd.nextInt(10);
        int comno2 = rnd.nextInt(10);

        int userno1 = rnd.nextInt(10);
        int userno2 = rnd.nextInt(10);

        System.out.println("User's random two numbers are " + userno1 + " and " + userno2);
        System.out.println("Would you like to fight? \n [1] Yes \n [2] No ");

        int fight = scn.nextInt(10);

        int usersum = userno1 + userno2;
        int comsum = comno1 + comno2;

        if (fight == 1 ) {
            if (usersum%10 > comsum%10) {
                System.out.println("You Win!");
            } else if (usersum%10 < comsum%10) {
                System.out.println("You Lose!");
            } else if (usersum%10 == comsum%10) {
                System.out.println("Draw!");

                System.out.println("User's last digit is " + usersum%10);

            }
        }
        if (fight == 2) {
            int userno3 = rnd.nextInt(10);
            int newusersum = userno3 + usersum;

            System.out.println("User's new card is " + userno3);

            if (newusersum % 10 > comsum%10) {
                System.out.println("You Win!");
            } else if (newusersum%10 < comsum%10) {
                System.out.println("You Lose!");
            } else if (newusersum%10 == comsum%10) {
                System.out.println("Draw!");
            }

            System.out.println("User's new last digit is " + newusersum%10);

        }
        System.out.println("Computer's random two numbers are " + comno1 + " and " + comno2);
        System.out.println("Computer's last digit is " + comsum%10);
        }
    }
}