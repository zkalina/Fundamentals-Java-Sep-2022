package textProcessing.exercise;

import java.util.Scanner;

public class P3ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputData = scanner.nextLine().split("\\\\");

        String extractedFiles = inputData[inputData.length - 1];

        String[] files  = extractedFiles.split("\\.");
        String fileName = files[0];
        String fileExtraction = files[1];

        System.out.printf("File name: %s%nFile extension: %s", fileName, fileExtraction);
    }
}
