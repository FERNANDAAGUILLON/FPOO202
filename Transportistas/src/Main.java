import javax.swing.JOptionPane;

public class Main {

        public static void main(String[] args) {
            while (true) {
                String menu = "Seleccione una opción:\n"
                        + "1. Registrar Vehiculo\n"
                        + "2. Registrar Conductor\n"
                        + "3. Registrar Envio\n"
                        + "4. Registrar Entrega\n"
                        + "5. Salir";
                String opcion = JOptionPane.showInputDialog(menu);

                switch (opcion) {
                    case "1":
                        String placa = JOptionPane.showInputDialog("Ingrese la placa:");
                        String modelo = JOptionPane.showInputDialog("Ingrese el modelo:");
                        double capacidadCarga = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga:"));
                        vehiculo vehiculo = new vehiculo(placa, modelo, capacidadCarga);
                        JOptionPane.showMessageDialog(null, "Vehiculo registrado exitosamente.");
                        break;
                    case "2":
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
                        String identificacion = JOptionPane.showInputDialog("Ingrese la identificación del conductor:");
                        String licencia = JOptionPane.showInputDialog("Ingrese la licencia del conductor:");
                        Conductor conductor = new Conductor(nombre, identificacion, licencia);
                        JOptionPane.showMessageDialog(null, "Conductor registrado exitosamente.");
                        break;
                    case "3":
                        Envio envio = Envio.crearEnvio();
                        JOptionPane.showMessageDialog(null, "Envio registrado exitosamente.");
                        break;
                    case "4":
                        String numeroGuia = JOptionPane.showInputDialog("Ingrese el número de guía:");
                        Entrega entrega = new Entrega(numeroGuia);
                        String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado (En tránsito / Entregado):");
                        entrega.actualizarEstado(nuevoEstado);
                        JOptionPane.showMessageDialog(null, "Entrega registrada exitosamente.");
                        break;
                    case "5":
                        JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                        System.exit(0);
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
                        break;
                }
            }
        }
    }
