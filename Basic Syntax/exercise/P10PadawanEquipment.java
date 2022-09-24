package basicSyntax.exercise;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsabersPrice  = Double.parseDouble(scanner.nextLine());
        double robesPrice  = Double.parseDouble(scanner.nextLine());
        double beltsPrice  = Double.parseDouble(scanner.nextLine());


        double lightsabersPlus = Math.ceil(students + students * 0.1) * lightsabersPrice;
        double robesSum = students * robesPrice;
        double beltsSum = (students - students/6) * beltsPrice;

        double totalSum = lightsabersPlus + robesSum + beltsSum;

        if( money >= totalSum){
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        }else{
            double dif = Math.abs(money - totalSum);
            System.out.printf("George Lucas will need %.2flv more.", dif);
        }


    }
}
