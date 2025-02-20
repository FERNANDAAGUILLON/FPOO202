import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(12345, "Juan Perez", 30, 5000.0);
        Cuenta cuenta2 = new Cuenta(67890, "Maria Lopez", 25, 3000.0);

        while (true) {
            String[] options = {"Consultar saldo", "Ingresar efectivo", "Retirar efectivo", "Depositar a otra cuenta", "Salir"};
            int choice = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Administración de Cuenta",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, options, options[0]);

            switch (choice) {
                case 0: // Consultar saldo
                    JOptionPane.showMessageDialog(null, "Saldo de " + cuenta1.getTitular() + ": $" + cuenta1.getSaldo());
                    break;

                case 1: // Ingresar efectivo
                    String cantidadIngresar = JOptionPane.showInputDialog("Ingrese la cantidad a ingresar:");
                    cuenta1.ingresarEfectivo(Double.parseDouble(cantidadIngresar));
                    JOptionPane.showMessageDialog(null, "Saldo actualizado: $" + cuenta1.getSaldo());
                    break;

                case 2: // Retirar efectivo
                    String cantidadRetirar = JOptionPane.showInputDialog("Ingrese la cantidad a retirar:");
                    if (cuenta1.retirarEfectivo(Double.parseDouble(cantidadRetirar))) {
                        JOptionPane.showMessageDialog(null, "Saldo actualizado: $" + cuenta1.getSaldo());
                    } else {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
                    }
                    break;

                case 3: // Depositar a otra cuenta
                    String cantidadDepositar = JOptionPane.showInputDialog("Ingrese la cantidad a depositar:");
                    if (cuenta1.depositarEnOtraCuenta(cuenta2, Double.parseDouble(cantidadDepositar))) {
                        JOptionPane.showMessageDialog(null, "Saldo actualizado de " + cuenta1.getTitular() + ": $" + cuenta1.getSaldo());
                    } else {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente para depósito.");
                    }
                    break;

                case 4: // Salir
                    System.exit(0);
                    break;
            }
        }
    }
}
