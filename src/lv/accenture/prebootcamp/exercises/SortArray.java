package lv.accenture.prebootcamp.exercises;

import java.util.Random;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        int userSizeOfArray;
        boolean isWithinRange = false;

// limiting the user input in range between 20 and 40 included, getting valid input
        do {
            userSizeOfArray = getSize(sc);
            if (userSizeOfArray < 20 || userSizeOfArray > 40) {
                isWithinRange = false;
                System.out.println("Choose number between 20 and 40!");
            } else {
                isWithinRange = true;
            }
        } while (!isWithinRange);

        sc.close();

// generating an array with the size of user chosen length
        int [] generatedArray = new int[userSizeOfArray];
        System.out.println("Length of array: " + generatedArray.length);

        //etc etc

    }


    public static int getSize(Scanner sc) {
        System.out.println("Enter number between 20 and 40 as an array size to be generated:  ");
        int userSizeOfArray = sc.nextInt();
        return userSizeOfArray;


    }
}
