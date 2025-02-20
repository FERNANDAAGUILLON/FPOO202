public class Cuenta {

    private int numeroCuenta;
    private String titular;
    private int edad;
    private double saldo;

    public Cuenta(int numeroCuenta, String titular, int edad, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.edad = edad;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
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

    public void ingresarEfectivo(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public boolean retirarEfectivo(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    public boolean depositarEnOtraCuenta(Cuenta otraCuenta, double cantidad) {
        if (retirarEfectivo(cantidad)) {
            otraCuenta.ingresarEfectivo(cantidad);
            return true;
        }
        return false;
    }
}
