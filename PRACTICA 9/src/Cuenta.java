import javax.swing.JOptionPane;

public class Cuenta {
    private String numeroCuenta;
    private String titular;
    private int edad;
    private double saldo;



        public Cuenta(String numeroCuenta, String titular, int edad, double saldo) {
            this.numeroCuenta = numeroCuenta;
            this.titular = titular;
            this.edad = edad;
            this.saldo = saldo;
        }


        public String getNumeroCuenta() {
            return numeroCuenta;
        }

        public String getTitular() {
            return titular;
        }

        public int getEdad() {
            return edad;
        }

        public double getSaldo() {
            return saldo;
        }

        public void depositar(double cantidad) {
            if (cantidad > 0) {
                saldo += cantidad;
                JOptionPane.showMessageDialog(null, "Depósito exitoso. Nuevo saldo: $" + saldo);
            } else {
                JOptionPane.showMessageDialog(null, "Cantidad inválida.");
            }
        }

        public void retirar(double cantidad) {
            if (cantidad > 0 && cantidad <= saldo) {
                saldo -= cantidad;
                JOptionPane.showMessageDialog(null, "Retiro exitoso. Nuevo saldo: $" + saldo);
            } else {
                JOptionPane.showMessageDialog(null, "Fondos insuficientes o cantidad inválida.");
            }
        }

        public void transferir(Cuenta destino, double cantidad) {
            if (cantidad > 0 && cantidad <= saldo) {
                saldo -= cantidad;
                destino.depositar(cantidad);
                JOptionPane.showMessageDialog(null, "Transferencia exitosa a " + destino.getTitular() + ". Nuevo saldo: $" + saldo);
            } else {
                JOptionPane.showMessageDialog(null, "Fondos insuficientes o cantidad inválida.");
            }
        }

        public void mostrarInformacion() {
            JOptionPane.showMessageDialog(null, "Cuenta: " + numeroCuenta +
                    "\nTitular: " + titular +
                    "\nEdad: " + edad +
                    "\nSaldo: $" + saldo);
        }
    }



