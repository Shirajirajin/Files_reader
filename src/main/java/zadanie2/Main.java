package zadanie2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        try (PrintWriter printWriter = new PrintWriter(new FileWriter("output_2.txt", true))) {
            for (int i = 0; i < 1; i++) {
                String zmienna =  scanner.next();
                printWriter.println(zmienna);
               // printWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
