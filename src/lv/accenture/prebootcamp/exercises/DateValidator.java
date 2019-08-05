package lv.accenture.prebootcamp.exercises;


import java.util.Scanner;

public class DateValidator {
    public static void main (String[] args) {


        String [] months = {
                "January",  //31
                "February", //28 or 29
                "March",    //31
                "April",    //30
                "May",      //31
                "June",     //30
                "July",     //31
                "August",   //31
                "September",//30
                "October",  //31
                "November", //30
                "December"  //31
        };

        Scanner sc = new Scanner(System.in);

            System.out.println("Enter date: ");
            int date = sc.nextInt();

            System.out.println("Enter month: ");
            int month = sc.nextInt();

            System.out.println("Enter year: ");
            int year = sc.nextInt();
            sc.close();

            boolean isleapYear = year%4==0&&( year%100 != 0||year%400==0);
      //      System.out.println(isleapYear);



            if (month <1 || month>12){
                System.out.println("Wrong month");

            } else if ((month==1 || month==3 || month==5 || month==7 || month==8 ||month==10 || month==12)&&(date<1||date>31)){
                System.out.println("in month "+months[month-1]+" tere are not  "+ date + " days");
            } else if ((month==4 || month==6 || month==9|| month==11)&&(date<1||date>30)){
                System.out.println("in month "+months[month-1]+ " there are not  "+ date + "days");
            } else if ((month==2 &&!isleapYear&&(date<1||date>28))||(month==2 &&isleapYear&&(date<1||date>29))) {
                System.out.println("in month " + months[month - 1] + " of given year there are not " + date + " days");
            }

            else if (date==1||date==31){
                    String date1 = date+"st ";
                System.out.println(date1+months[month-1]+", "+year);
            } else if (date==2){
                String date2 = date+"nd ";
                System.out.println(date2+months[month-1]+", "+year);
            } else if (date==3){
                String date3 = date+"rd ";
                System.out.println(date3+months[month-1]+", "+year);
            }
             else if (date>3 && date<31){
                String date4 = date+"th ";
                System.out.println(date4+months[month-1]+", "+year);
            }

    }
}
