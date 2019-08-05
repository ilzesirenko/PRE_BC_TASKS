package lv.accenture.prebootcamp.exercises;

import java.util.Scanner;

public class Training {

    public static void main(String[] args) {
input();

    }

    static void input(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();

        System.out.print("Your name "+ name);
        System.out.print("Your age "+ age);


        sc.close();

    }
}
