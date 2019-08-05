package lv.accenture.prebootcamp.exercises;

import java.util.Scanner;

public class ConditionalMath {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter whole number: ");
        int A = sc.nextInt();
        System.out.print("Enter whole number: ");
        int B = sc.nextInt();
        sc.close();

        if (A > B) {
            System.out.print(A + " is greater than " + B);

        } else if (A < B) {
            System.out.print(A + " is less than " +B);
        } else {
            System.out.print(A + " and " + B + " are equal");

        }

    }


}
