package basicSyntax.exercise;

import java.util.Scanner;

public class P5Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    String username = scanner.nextLine();

    String password = "";

    for (int i = username.length() - 1; i >= 0; i--){
        char currentCharacter = username.charAt(i);
        password += currentCharacter;
    }
        String enteredPassword = scanner.nextLine();
    int failedTries = 1;

    while (!password.equals(enteredPassword)){

        System.out.println("Incorrect password. Try again.");

        failedTries++;
        if (failedTries == 4){
            System.out.printf("User %s blocked!", username);
            break;
        }


        enteredPassword = scanner.nextLine();

        }
    if (password.equals(enteredPassword)){
        System.out.printf("User %s logged in.", username);
    }
    }
}
