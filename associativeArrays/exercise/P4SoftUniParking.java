package associativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P4SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int usersCount = Integer.parseInt(scanner.nextLine());

        Map<String, String> licencePlatesNumbersMap = new LinkedHashMap<>();


        for (int users = 1; users <= usersCount; users++) {
            String input = scanner.nextLine();
            String command = input.split(" ")[0];

            if(command.equals("register")){
                String user = input.split(" ")[1];
                String licencePlateNumber = input.split(" ")[2];

                if(!licencePlatesNumbersMap.containsKey(user)){
                    licencePlatesNumbersMap.put(user, licencePlateNumber);

                   System.out.printf("%s registered %s successfully%n", user, licencePlateNumber);

                }else{
                    System.out.printf("ERROR: already registered with plate number %s%n", licencePlatesNumbersMap.get(user));
                }
            }else if (command.equals("unregister")){
                String user = input.split(" ")[1];

                if(licencePlatesNumbersMap.containsKey(user)){

                    licencePlatesNumbersMap.remove(user);
                    System.out.printf("%s unregistered successfully%n", user);
                }else{
                   System.out.printf("ERROR: user %s not found%n", user);

                }

            }

        }
        licencePlatesNumbersMap.entrySet().forEach(entry -> System.out.printf("%s => %s%n", entry.getKey(), entry.getValue()));

    }
}
