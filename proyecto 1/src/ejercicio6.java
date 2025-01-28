import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("sabe que hace una vaca en la calle - va caminando: ");
        String frase = scanner.nextLine();

        String fraseInvertida = new StringBuilder(frase).reverse().toString();

        System.out.println("sabe que hace una vaca en la calle - va caminando: " + fraseInvertida);

        scanner.close();
    }
}

