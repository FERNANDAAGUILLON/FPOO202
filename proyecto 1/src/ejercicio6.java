import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese una frase: ");
        String frase = scanner.nextLine();

        String fraseInvertida = new StringBuilder(frase).reverse().toString();

        System.out.println("ingrese una frase: " + fraseInvertida);

        scanner.close();
    }
}

