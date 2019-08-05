package lv.accenture.prebootcamp.exercises;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random rnd = new Random();
        
        /* generates a number in range 1...10*/
        int randomInt = rnd.nextInt(10) + 1;

        /*check manually if the code works*/
        //   int randomInt = 5;

        int userNumber;
        boolean guessed = false;

        do {
            userNumber = getInput(sc);

            if (userNumber == randomInt) {
                guessed = true;
                System.out.println("You guessed the right number!");
            } else if (userNumber < randomInt) {
                guessed = false;
                System.out.println("Your guessed number is too small. Try again!");
            } else if (userNumber > randomInt) {
                guessed = false;
                System.out.println("Your guessed number is too large. Try again!");
            }

        } while (!guessed);

        sc.close();

    }

    public static int getInput(Scanner sc) {

        System.out.println("Guess the number from 1 to 10: ");
        int userNumber = sc.nextInt();
        return userNumber;
    }

}