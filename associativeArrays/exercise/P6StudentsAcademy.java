package associativeArrays.exercise;

import java.util.*;

public class P6StudentsAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsGradesMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
           String studentName = scanner.nextLine();
           double grade = Double.parseDouble(scanner.nextLine());

           if (!studentsGradesMap.containsKey(studentName)){
               studentsGradesMap.put(studentName, new ArrayList<>());
           }
           studentsGradesMap.get(studentName).add(grade);
        }

        Map<String, Double> averageGradeMap = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : studentsGradesMap.entrySet()) {
            String student = entry.getKey();
           List <Double> gradesList = entry.getValue();
            double averageGrade = getAverageGrade(gradesList);

            if(averageGrade >= 4.50){
                averageGradeMap.put(student, averageGrade);
            }

        }
        averageGradeMap.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));

    }
    public static double getAverageGrade (List <Double> gradesList){
        double sum = 0;
        for (double grade : gradesList) {
          sum += grade;
        }
        return sum / gradesList.size();
    }
}
