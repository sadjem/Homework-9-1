package HomeWork91;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final String FILENAME = "src/HomeWork91/urls.txt";

    public static void main(String[] args) throws FileNotFoundException {
        scanFile(FILENAME);
        Map<String, Integer> hashMap = new HashMap<>();
    }

    private static void scanFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
