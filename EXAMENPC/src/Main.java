// escriba un programa que pida al usuario dos palabras,y que indique cual es mas largas y cuantas palabras es mas larga

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduce la primera palabra: ");
        String palabra1 = scanner.nextLine();

        System.out.print("Introduce la segunda palabra: ");
        String palabra2 = scanner.nextLine();


        int longitud1 = palabra1.length();
        int longitud2 = palabra2.length();


        if (longitud1 > longitud2) {
            int diferencia = longitud1 - longitud2;
            System.out.println("La palabra '" + palabra1 + "' es más larga por " + diferencia + " letras.");
        } else if (longitud2 > longitud1) {
            int diferencia = longitud2 - longitud1;
            System.out.println("La palabra '" + palabra2 + "' es más larga por " + diferencia + " letras.");
        } else {




        }
    }
}