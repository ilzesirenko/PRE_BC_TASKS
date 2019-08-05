package lv.accenture.prebootcamp.exercises;

import java.util.Scanner;

public class BasicMath {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int A = sc.nextInt();

        System.out.print("Enter a floating point number: ");
        float B = sc.nextFloat();

        float sum, sub, mult, div, square;
        sum = A + B;
        sub = A / B;
        mult = A * B;
        div = A / B;
        square = (float) Math.sqrt(sum);

        System.out.println("The sum of " + A + " and " + B + " is " + sum);
        System.out.println("The subtraction of " + A + " and " + B + " is " + sub);
        System.out.println("The multiplication of " + A + " and " + B + " is " + mult);
        System.out.println("The dividing of " + A + " and " + B + " is " + div);
        System.out.println("The square of " + A + " and " + B + " sum "+sum+" is " + square);

    }
}
