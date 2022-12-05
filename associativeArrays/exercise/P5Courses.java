package associativeArrays.exercise;

import java.util.*;

public class P5Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> studentsCoursesMap = new LinkedHashMap<>();

        while(!input.equals("end")){

            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];

            if(!studentsCoursesMap.containsKey(courseName)){
               studentsCoursesMap.put(courseName, new ArrayList<>());
            }
            studentsCoursesMap.get(courseName).add(studentName);

            input = scanner.nextLine();

            }

            studentsCoursesMap.entrySet().forEach(entry -> {System.out.printf("%s: %s%n",entry.getKey(), entry.getValue().size());
            entry.getValue().forEach(student -> System.out.println("-- " + student)); });

        }
}
