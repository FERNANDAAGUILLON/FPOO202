import javax.swing.JOptionPane;

public class Main {

        public static void main(String[] args) {
            vehiculo vehiculo = null;
            Conductor conductor = null;
            Envio envio = null;
            Entrega entrega = null;

            while (true) {
                String menu = "1. Registrar Vehículo\n"
                        + "2. Registrar Conductor\n"
                        + "3. Asignar Conductor a Vehículo\n"
                        + "4. Registrar Envío\n"
                        + "5. Registrar Entrega\n"
                        + "6. Actualizar Estado de Entrega\n"
                        + "7. Mostrar Información\n"
                        + "8. Salir";

                String choiceStr = JOptionPane.showInputDialog(menu);
                int choice = Integer.parseInt(choiceStr);

                switch (choice) {
                    case 1:
                        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
                        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
                        double capacidadCarga = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga del vehículo:"));
                        vehiculo = new vehiculo(placa, modelo, capacidadCarga);
                        break;

                    case 2:
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
                        String identificacion = JOptionPane.showInputDialog("Ingrese la identificación del conductor:");
                        String licencia = JOptionPane.showInputDialog("Ingrese la licencia del conductor:");
                        conductor = new Conductor(nombre, identificacion, licencia);
                        break;

                    case 3:
                        if (vehiculo != null && conductor != null) {
                            vehiculo.asignarConductor(conductor);
                        } else {
                            JOptionPane.showMessageDialog(null, "Debe registrar un vehículo y un conductor primero.");
                        }
                        break;

                    case 4:
                        envio = Envio.crearEnvio();
                        break;

                    case 5:
                        String numeroGuia = JOptionPane.showInputDialog("Ingrese el número de guía de la entrega:");
                        entrega = new Entrega(numeroGuia);
                        break;

                    case 6:
                        if (entrega != null) {
                            String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado de la entrega (En tránsito, Entregado):");
                            entrega.actualizarEstado(nuevoEstado);
                        } else {
                            JOptionPane.showMessageDialog(null, "Debe registrar una entrega primero.");
                        }
                        break;

                    case 7:
                        StringBuilder info = new StringBuilder();
                        if (vehiculo != null) {
                            info.append("Vehículo:\n")
                                    .append("Placa: ").append(vehiculo.getPlaca()).append("\n")
                                    .append("Modelo: ").append(vehiculo.getModelo()).append("\n")
                                    .append("Capacidad de Carga: ").append(vehiculo.getCapacidadCarga()).append("\n");
                            if (vehiculo.getConductor() != null) {
                                info.append("Conductor: ").append(vehiculo.getConductor().getNombre()).append("\n");
                            }
                        }
                        if (conductor != null) {
                            info.append("Conductor:\n")
                                    .append("Nombre: ").append(conductor.getNombre()).append("\n")
                                    .append("Identificación: ").append(conductor.getIdentificacion()).append("\n")
                                    .append("Licencia: ").append(conductor.getLicencia()).append("\n");
                        }
                        if (envio != null) {
                            info.append("Envío:\n")
                                    .append("Código de Envío: ").append(envio.getCodigoEnvio()).append("\n")
                                    .append("Destino: ").append(envio.getDestino()).append("\n")
                                    .append("Peso: ").append(envio.getPeso()).append("\n");
                        }
                        if (entrega != null) {
                            info.append("Entrega:\n")
                                    .append("Número de Guía: ").append(entrega.getNumeroGuia()).append("\n")
                                    .append("Estado: ").append(entrega.getEstado()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, info.toString());
                        break;

                    case 8:
                        System.exit(0);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.");
                        break;
                }
            }
        }
    }
