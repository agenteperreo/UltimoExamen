package ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class NumerosReales {

    public static void main(String[] args) {

        Scanner sc = null;

        try {
            sc = new Scanner(new FileReader("src/ficheros/NumerosReales.txt"));

            sc.useLocale(Locale.US);

            double suma = 0, media = 0;

            int contador = 0;

            while (sc.hasNext()) {
                suma += sc.nextDouble();
                contador++;
            }

            media = suma / contador;

            System.out.println("Suma total: " + suma);
            System.out.println("Media aritmetica: " + media);
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: Fichero no encontrado");
            System.err.println(e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }

    }
}
