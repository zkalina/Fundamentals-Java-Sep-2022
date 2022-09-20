package basicsyntax.practice;
import java.util.Scanner;
public class P7TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;
        boolean isValid = false;

        if (age >= 0 && age <= 18) {
            isValid = true;
            switch (typeOfDay) {
                case "Weekday":
                    price = 12;
                    break;
                case "Weekend":
                    price = 15;
                    break;
                case "Holiday":
                    price = 5;
                    break;
            }
        } else if (age > 18 && age <= 64) {
            isValid = true;
            switch (typeOfDay) {
                case "Weekday":
                    price = 18;
                    break;
                case "Weekend":
                    price = 20;
                    break;
                case "Holiday":
                    price = 12;
                    break;
            }
        }else if (age > 64 && age <= 122) {
            isValid = true;
            switch (typeOfDay) {
                case "Weekday":
                    price = 12;
                    break;
                case "Weekend":
                    price = 15;
                    break;
                case "Holiday":
                    price = 10;
                    break;
            }
        }
        if (isValid){
            System.out.println(price + "$");
            }else{
            System.out.println("Error!");
            }
        }
    }
//    int ticketPrice = -1;
//
//        switch (dayType){
//                case "Weekday":
//                if((age >= 0) && (age <= 18) || (age > 64)
//                && (age <= 122)) {
//                ticketPrice = 12;
//                }else if ((age > 18) && (age <= 64)){
//                ticketPrice = 18;
//                }
//                break;
//                case "Weekend":
//                if((age >= 0) && (age <= 18) || (age > 64) && (age <= 122)) {
//                ticketPrice = 15;
//                }else if ((age > 19) && (age <= 64)){
//                ticketPrice = 20;
//                }
//                break;
//                case "Holiday":
//                if((age >= 0) && (age <= 18)) {
//                ticketPrice = 5;
//                }else if ((age > 18) && (age <= 64)){
//                ticketPrice = 12;
//                }else if ((age > 64) && (age <= 122)){
//                ticketPrice = 10;
//                }
//                break;
//                }
//
//                if (ticketPrice == -1){
//                System.out.println("Error!");
//                }else{
//                System.out.printf("%d$", ticketPrice);
//                }
//                }
//                }
