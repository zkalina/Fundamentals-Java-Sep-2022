package finalExam0412;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String password = scanner.nextLine();
        String input = scanner.nextLine();

        while(!input.equals("Complete")){
            String command = input.split(" ")[0];
            for (int i = 0; i < password.length(); i++) {
                char currentLetter = password.charAt(i);
                switch (command) {
                    case "Make":
                        String upperOrLower = input.split(" ")[1];
                        if (upperOrLower.equals("Upper")) {
                            int index = Integer.parseInt(input.split(" ")[2]);
                          char upperLetter = Character.toUpperCase(password.charAt(index));
                         password = password.replace(currentLetter, upperLetter);
                        }

                        if (upperOrLower.equals("Lower")) {
                            int index = Integer.parseInt(input.split(" ")[2]);
                            char lowerLetter = Character.toLowerCase(password.charAt(index));
                            password = password.replace(currentLetter, lowerLetter);
                        }
                        break;

                    case "Insert":
                        int indexToAddChar = Integer.parseInt(input.split(" ")[1]);
                        String charToAdd = input.split(" ")[2];


                        break;

                    case "Replace":
                        String charToReplace = input.split(" ")[1];
                        int value = Integer.parseInt(input.split(" ")[2]);
//                        char result = password.replace(charToAdd(value));
                        System.out.println(password);

                        break;

                    case "Validation":
                        if(password.length() != 8 && password.length() < 8 ){
                            System.out.println("Password must be at least 8 characters long!");

                        }if(!Character.isLetterOrDigit(currentLetter) && !password.contains("_")){
                        System.out.println("Password must consist only of letters, digits and _!");

                    }if(!Character.isUpperCase(currentLetter)){
                        System.out.println("Password must consist at least one uppercase letter!");
                    }if(!Character.isLowerCase(currentLetter)){
                        System.out.println("Password must consist at least one lowercase letter!");

                    }if(!Character.isDigit(currentLetter)){
                        System.out.println("Password must consist at least one digit!");
                    }

                        break;
                }


            }

            input = scanner.nextLine();
        }



    }
}
