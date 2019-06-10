package zadanie5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader("output_1.txt"));

            while (scanner.hasNextLine()) {
                String linia = scanner.nextLine();
                System.out.println(linia);


            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("bledna zawartosc lub nazwa pliku");
        }


    }


}
