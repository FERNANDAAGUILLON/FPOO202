
import java.util.Scanner;

public class ejercico6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldo = 0;

        System.out.println("Escriba la bitácora de operaciones:");

        while (scanner.hasNextLine()) {
            String entrada = scanner.nextLine().trim();
            if (entrada.isEmpty()) {
                break;
            }

            if (entrada.length() < 3 || (entrada.charAt(0) != 'D' && entrada.charAt(0) != 'R') || !Character.isDigit(entrada.charAt(2))) {
                System.out.println("Entrada no válida, intente de nuevo.");
                continue;
            }

            char operacion = entrada.charAt(0);
            int cantidad;

            try {
                cantidad = Integer.parseInt(entrada.substring(2).trim());
            } catch (NumberFormatException e) {
                System.out.println("Cantidad no válida, intente de nuevo.");
                continue;
            }

            if (operacion == 'D') {
                saldo += cantidad;
            } else if (operacion == 'R') {
                if (cantidad > saldo) {
                    System.out.println("Fondos insuficientes.");
                } else {
                    saldo -= cantidad;
                }
            }
        }

        System.out.println("Saldo Final: " + saldo + " pesos");
        scanner.close();
    }
}
