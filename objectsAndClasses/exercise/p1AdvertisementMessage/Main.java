package objectsAndClasses.exercise.p1AdvertisementMessage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int messagesNumber = Integer.parseInt(scanner.nextLine());
        Message message = new Message();

        for (int i = 1; i <= messagesNumber; i++) {
            String output = message.randomMessage();
            System.out.println(output);

        }
    }
}
