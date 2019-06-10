package zadanie3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String quit ;

        try (PrintWriter printWriter = new PrintWriter(new FileWriter("output_3.txt", true))) {
            String zmienna = scanner.next();


            while( !zmienna.equalsIgnoreCase("quit")) {

                printWriter.println(zmienna);
                zmienna = scanner.next();

            }


                // printWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
