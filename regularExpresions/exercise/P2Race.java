package regularExpresions.exercise;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P2Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> participantsList = (Arrays.stream((scanner.nextLine().split(", "))).
                                        collect(Collectors.toList()));
        String input = scanner.nextLine();
        int totalKm = 0;

        List<String> validNames = new ArrayList<>();

        String regex = "(?<name>[A-Za-z]+)";
        Pattern pattern = Pattern.compile(regex);


        while(!input.equals("end of race")){
            StringBuilder fullName = new StringBuilder();
            Matcher matcher = pattern.matcher(input);
            while(matcher.find()){
                String name = matcher.group("name");
//                String distance = matcher.group("distance");
//                for (int i = 0; i < distance.length(); i++) {
//                    int km = Integer.parseInt(distance.charAt(i) + "");
//                    totalKm += km;

                    fullName.append(matcher.group());
                }


            validNames.add(fullName.toString());

            input = scanner.nextLine();
        }
        validNames.forEach(System.out::println);

    }
}
