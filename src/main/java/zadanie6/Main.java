package zadanie6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader("output_2.txt"));

            if (scanner.hasNextLine()) {
                String linia = scanner.nextLine();
                System.out.println(linia);
                System.out.println(linia.toUpperCase());
                System.out.println(linia.toLowerCase());
                System.out.println(linia.trim());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
