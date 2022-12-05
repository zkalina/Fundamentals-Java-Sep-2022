package textProcessing.exercise;

import java.util.Scanner;

public class P1ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] userNames = scanner.nextLine().split(", ");

        for (int i = 0; i < userNames.length; i++) {

            String currentUsername = userNames[i];
            if(isValidUserName(currentUsername)){
                System.out.println(currentUsername);
            }
        }

    }
    public static boolean isValidUserName(String username){

        if(username.length() < 3 || username.length() > 16) {
            return false;
        }

            for (int i = 0; i < username.length(); i++) {
                char currentSymbol = username.charAt(i);
                if (!Character.isLetterOrDigit(currentSymbol) && currentSymbol != '-' && currentSymbol != '_') {
                    return false;
                }

        }
        return true;
    }
}
