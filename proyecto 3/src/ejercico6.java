
import java.util.Scanner;

public class ejercico6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int saldo = 0;

        System.out.println("Escriba la bitácora de operaciones (línea vacía para finalizar):");

        while (true) {
            String entrada = scanner.nextLine().trim();
            if (entrada.isEmpty()) { // Línea vacía para terminar
                break;
            }

            String[] operacion = entrada.split(" ");
            if (operacion.length == 2) {
                String tipo = operacion[0];
                int monto = Integer.parseInt(operacion[1]);

                if (tipo.equals("D")) {
                    saldo += monto;
                } else if (tipo.equals("R")) {
                    saldo -= monto;
                }
            }
        }

        System.out.println(saldo);
        scanner.close();
    }
}


