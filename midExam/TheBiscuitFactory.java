package midExam;

import java.util.Scanner;

public class TheBiscuitFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int biscuitsPerDayPerWorker = Integer.parseInt(scanner.nextLine());
        int workersCount = Integer.parseInt(scanner.nextLine());
        int otherFactoryProductionPerMonth = Integer.parseInt(scanner.nextLine());

        int productionPerDay = biscuitsPerDayPerWorker * workersCount;

        double everyThirdDayProduction = Math.floor(productionPerDay * 0.75);

        double totalProductionPerMonth = productionPerDay * 20 + everyThirdDayProduction * 10;

        double diff = 0;
        String moreOrLess = "";

        if (otherFactoryProductionPerMonth < totalProductionPerMonth){
            moreOrLess = "more";
        }else{
            moreOrLess = "less";
        }
        diff = otherFactoryProductionPerMonth - totalProductionPerMonth;
        double percentage = (diff /otherFactoryProductionPerMonth) * 100;

        System.out.printf("You have produced %.0f biscuits for the past month.%n", totalProductionPerMonth);
        System.out.printf("You produce %.2f percent %s biscuits.", Math.abs(percentage), moreOrLess);




    }
}
