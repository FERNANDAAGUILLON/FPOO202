//programa que solicite una palabra y que la descomponga en letras

import java.util.Scanner;

public class PATE2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce una palabra: ");
            String palabra = scanner.nextLine();

            char[] letras = palabra.toCharArray();
            System.out.println("Letras de la palabra:");

            for (char letra : letras) {
                System.out.println(letra);
            }

            scanner.close();
        }
    }











