package associativeArrays.exercise;

import java.util.*;

public class P8CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> employeeDataMap = new LinkedHashMap<>();

        while(!input.equals("End")){

            String companyName = input.split(" -> ")[0];
            String employeeId = input.split(" -> ")[1];

            if(employeeDataMap.containsKey(companyName)){
                List <String> employees = employeeDataMap.get(companyName);
                if(!employees.contains(employeeId)){
                    employees.add(employeeId);
                }

            }else{
                List<String> employees = new ArrayList<>();
                employees.add(employeeId);
                employeeDataMap.put(companyName, employees);

            }

            input = scanner.nextLine();
        }

        employeeDataMap.entrySet().forEach(entry -> {System.out.println(entry.getKey());
        entry.getValue().forEach(employee -> System.out.println("-- " + employee)); });
    }
}
