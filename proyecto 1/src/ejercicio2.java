import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        System.out.println("En minúsculas: " + nombreCompleto.toLowerCase());
        System.out.println("En mayúsculas: " + nombreCompleto.toUpperCase());
        System.out.println("Primera letra de cada palabra en mayúscula: " + capitalizarPalabras(nombreCompleto));

        scanner.close();
    }

    public static String capitalizarPalabras(String str) {
        String[] palabras = str.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String palabra : palabras) {
            if (palabra.length() > 0) {
            }
            {
                resultado.append(palabra.substring(0, 1).toUpperCase()).append(palabra.substring(1).toLowerCase()).append(" ");
            }
        }
        return resultado.toString().trim();
    }
}


