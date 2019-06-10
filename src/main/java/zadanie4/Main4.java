package zadanie4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        System.out.println("podaj Adres");
        Scanner scanner = new Scanner(System.in);
        String zmienna = scanner.next();

        // File plik = new File("plik.txt");

        File plikPom = new File(zmienna);
        System.out.println();
        System.out.println(plikPom.getAbsolutePath());
        System.out.println("Wpisales adres pliku: " + plikPom.exists());
        System.out.println("Wpisales adres katalog: " + plikPom.isDirectory());
        System.out.println("Rozmiar pliku to " + plikPom.length());
        System.out.println("Ostatnia modyfikacja to " + plikPom.lastModified());  //dopytac
        System.out.println("czy moge odczytac " + plikPom.canRead());
        System.out.println("czy moge zapisac " + plikPom.canWrite());


    }
}
