import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        String nombreEnMayusculas = nombre.toUpperCase();
        int numeroLetras = nombre.replace(" ", "").length();

        System.out.println(nombreEnMayusculas + " tiene " + numeroLetras + " letras");

        scanner.close();
    }
}


