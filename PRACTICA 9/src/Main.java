import javax.swing.JOptionPane;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear cuentas de ejemplo
        Cuenta cuenta1 = new Cuenta("30082005", "Naomi Carrillo", 19, 20000);
        Cuenta cuenta2 = new Cuenta("14072005", "Dulce Garcia", 19, 1000000);


        boolean salir = false;


        while (!salir) {
            String opcion = JOptionPane.showInputDialog(
                    "Menú de opciones:\n" +
                            "1. Consultar saldo\n" +
                            "2. Ingresar efectivo\n" +
                            "3. Retirar efectivo\n" +
                            "4. Depositar a otra cuenta\n" +
                            "5. Mostrar información de la cuenta\n" +
                            "6. Salir\n\n" +
                            "Seleccione una opción:");

            switch (opcion) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Saldo actual: $" + cuenta1.getSaldo());
                    break;
                case "2":
                    double deposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));
                    cuenta1.depositar(deposito);
                    break;
                case "3":
                    double retiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a retirar:"));
                    cuenta1.retirar(retiro);
                    break;
                case "4":
                    double transferencia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a transferir:"));
                    cuenta1.transferir(cuenta2, transferencia);
                    break;
                case "5":
                    cuenta1.mostrarInformacion();
                    break;
                case "6":
                    salir = true;
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        }
    }

}









