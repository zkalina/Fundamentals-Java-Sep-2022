package finalExam0412;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int charAsciiNumber = 0;
        Map<String, List<Integer>> commandsMap = new LinkedHashMap<>();
        List<Integer> asciiNumberList = new ArrayList<>();

        String regex = "!(?<command>[A-Za-z]+)!:\\[(?<string>[A-Za-z]+)\\]";
        Pattern pattern = Pattern.compile(regex);


        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                    String command = matcher.group("command");
                    String string = matcher.group("string");

                    if (command.length() >= 3) {

                        if (string.length() >= 8) {

                            for (char symbol : string.toCharArray()) {
                                charAsciiNumber = symbol;
                                asciiNumberList.add(charAsciiNumber);
                            }

                        }
                        commandsMap.put(command, (asciiNumberList));
                        System.out.println(commandsMap);
                    }

            }else {
                System.out.println("The message is invalid");
            }

        }
//        commandsMap.entrySet().forEach(entry ->
//                System.out.print(entry.getKey() + ": "));
//        asciiNumberList.forEach(number -> System.out.printf("%d ", number));

    }
}
