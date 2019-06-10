package zadanie7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = null;

        int licznikLinni = 0;
        int licznikSlow = 0;
        try {
            scanner = new Scanner(new FileReader("output_3.txt"));

            while (scanner.hasNextLine()) {
                //String slowa = scanner.nextLine();
               // System.out.println(slowa);
                String[] slowa = scanner.nextLine().split(" ");
                licznikLinni++;
                licznikSlow += slowa.length;

                System.out.println(licznikLinni);
                System.out.println(licznikSlow);



            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("bledna zawartosc lub nazwa pliku");
        }


    }


}
