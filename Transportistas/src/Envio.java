import javax.swing.JOptionPane;

public class Envio {

        private String codigoEnvio;
        private String destino;
        private double peso;

        public Envio(String codigoEnvio, String destino) {
            this.codigoEnvio = codigoEnvio;
            this.destino = destino;
        }

        public Envio(String codigoEnvio, String destino, double peso) {
            this.codigoEnvio = codigoEnvio;
            this.destino = destino;
            this.peso = peso;
        }

        public String getCodigoEnvio() {
            return codigoEnvio;
        }

        public String getDestino() {
            return destino;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public static Envio crearEnvio() {
            String codigo = JOptionPane.showInputDialog("Ingrese el código de envío:");
            String destino = JOptionPane.showInputDialog("Ingrese el destino:");
            String pesoStr = JOptionPane.showInputDialog("Ingrese el peso (opcional):");

            if (pesoStr == null || pesoStr.isEmpty()) {
                return new Envio(codigo, destino);
            } else {
                double peso = Double.parseDouble(pesoStr);
                return new Envio(codigo, destino, peso);
            }
        }
    }
