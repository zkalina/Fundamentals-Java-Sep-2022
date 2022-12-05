package textProcessing.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P4TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> banWords = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String text = scanner.nextLine();


        for (int i = 0; i < banWords.size(); i++) {
            if(text.contains(banWords.get(i))){

                String wordSize = banWords.get(i);
                String result = "";

                for (int j = 0; j < wordSize.length(); j++) {
                    result += "*";
                }

                text = text.replace(banWords.get(i), result);
            }

        }
        System.out.println(text);

    }
}
//    String[] banWordsArr = scanner.nextLine().split(", ");
//    String text = scanner.nextLine();
//
//        for (String banWord : banWordsArr) {
//                text = text.replace(banWord, repeatString("*", banWord.length()));
//                }
//
//                System.out.println(text);
//                }
//
//public static String repeatString(String s, int count) {
//        String result = "";
//        for (int i = 0; i < count; i++) {
//        result += s;
//        }
//
//        return result;
//        }
//    }
