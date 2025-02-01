public class ejercico6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saldo = 0;
        while (true) {
            System.out.print("Introduce una operación (D cantidad/R cantidad) o una línea vacía para finalizar: ");
            String linea = sc.nextLine();
            if (linea.isEmpty()) break;
            char operacion = linea.charAt(0);
            int cantidad = Integer.parseInt(linea.substring(2).trim());
            if (operacion == 'D') {
                saldo += cantidad;
            } else if (operacion == 'R') {
                saldo -= cantidad;
            }
        }
        System.out.println("El saldo final es: " + saldo);
    }
}
}
