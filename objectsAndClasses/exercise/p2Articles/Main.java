package objectsAndClasses.exercise.p2Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int n = Integer.parseInt(scanner.nextLine());
        Articles articles = new Articles(input[0], input[1], input[2]);



            for (int j = 1; j <= n; j++) {
                String command = scanner.nextLine().split(": ")[0];
                if(command.equals("Edit")){
                    String newContent = scanner.nextLine().split(": ")[1];
                    articles.edit(newContent);
                }else if(command.equals("ChangeAuthor")){
                    String newAuthor = scanner.nextLine().split(": ")[1];
                    articles.changeAuthor(newAuthor);
                }else if(command.equals("Rename")){
                    String newTitle = scanner.nextLine().split(": ")[1];
                    articles.rename(newTitle);
            }

        }
        System.out.println(articles.toString());
    }
}
