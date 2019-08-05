package lv.accenture.prebootcamp.exercises;

import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Name Surname: ");
        String input = sc.nextLine();

        sc.close();

//        String input = "   ilze    sirenko   opaaa  jjj  ";

        // removing leading and trailing spaces from input
        input = input.trim();


        System.out.println("'" + input + "'");

        int spaceIndex = input.indexOf(' ');


        if (spaceIndex > 0) { //noversis kludu, ja neievada uzvardu

            String name = input.substring(0, spaceIndex);//izgriezis vardu no 0 pozicijas lidz pirmajai atstarpei
            name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();


            String surname = input.substring(spaceIndex).trim().toUpperCase();
//            surname = surname.trim();
//            surname = surname.toUpperCase();

            while (surname.contains(" ")) {

                int spaceIndexSurname = surname.indexOf(" ");
                surname = surname.substring(0, spaceIndexSurname) + "-" + surname.substring(spaceIndexSurname).trim();

            }
            System.out.println("'" + name + " " + surname + "'");
        } else {
            System.out.println("Not valid input");
        }
    }
}
