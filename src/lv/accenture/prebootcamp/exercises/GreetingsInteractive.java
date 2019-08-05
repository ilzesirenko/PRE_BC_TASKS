package lv.accenture.prebootcamp.exercises;

import java.util.Scanner;

public class GreetingsInteractive {

//    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter your name: ");
//        String name = sc.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = sc.nextInt();
//        sc.close();
//
//        System.out.println("Hello, my name is " + name + " I am " + age + " years old");

//}

    public static void main(String[] args) {
        String text = read();
        System.out.print(text);

    }

// method version, need to be checked

    public static String read() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = sc.nextLine();

        System.out.print("Enter your age:");
        int age = sc.nextInt();

        String text = "Hello, my name is " + name + " I am " + age + " years old";

        sc.close();

        return text;

    }
}

