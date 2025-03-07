public class Articulo {

   import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

    public class AdministracionDeArticulosGUI {
        private JFrame frame;
        private JTextField nombreField;
        private JTextField cantidadField;
        private JTextArea descripcionField;
        private JTextArea displayArea;
        private AdministracionDeArticulos adminArticulos;

        public AdministracionDeArticulosGUI() {
            adminArticulos = new AdministracionDeArticulos();
            initialize();
        }

        private void initialize() {
            frame = new JFrame("Administración de Artículos");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.setLayout(new BorderLayout());

            JPanel panel = new JPanel(new GridLayout(4, 2));
            frame.add(panel, BorderLayout.NORTH);

            JLabel nombreLabel = new JLabel("Nombre:");
            nombreField = new JTextField();
            JLabel cantidadLabel = new JLabel("Cantidad:");
            cantidadField = new JTextField();
            JLabel descripcionLabel = new JLabel("Descripción:");
            descripcionField = new JTextArea(3, 20);

            panel.add(nombreLabel);
            panel.add(nombreField);
            panel.add(cantidadLabel);
            panel.add(cantidadField);
            panel.add(descripcionLabel);
            panel.add(new JScrollPane(descripcionField));

            JPanel buttonPanel = new JPanel();
            frame.add(buttonPanel, BorderLayout.CENTER);

            JButton altaButton = new JButton("Alta de Artículo");
            JButton bajaButton = new JButton("Baja de Artículo");
            JButton modificarButton = new JButton("Modificar Artículo");

            buttonPanel.add(altaButton);
            buttonPanel.add(bajaButton);
            buttonPanel.add(modificarButton);

            displayArea = new JTextArea(10, 30);
            frame.add(new JScrollPane(displayArea), BorderLayout.SOUTH);

            altaButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    altaArticulo();
                }
            });

            bajaButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    bajaArticulo();
                }
            });

            modificarButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    modificarArticulo();
                }
            });

            frame.setVisible(true);
        }

        private void altaArticulo() {
            String nombre = nombreField.getText();
            int cantidad = Integer.parseInt(cantidadField.getText());
            String descripcion = descripcionField.getText();
            adminArticulos.altaDeArticulo(nombre, cantidad, descripcion);
            displayArea.append("Artículo agregado: " + nombre + "\n");
        }

        private void bajaArticulo() {
            String nombre = nombreField.getText();
            adminArticulos.bajaDeArticulo(nombre);
            displayArea.append("Artículo eliminado: " + nombre + "\n");
        }

        private void modificarArticulo() {
            String nombre = nombreField.getText();
            int nuevaCantidad = Integer.parseInt(cantidadField.getText());
            String nuevaDescripcion = descripcionField.getText();
            adminArticulos.modificarArticulo(nombre, nuevaCantidad, nuevaDescripcion);
            displayArea.append("Artículo modificado: " + nombre + "\n");
        }

        public static void main(String[] args) {
            new AdministracionDeArticulosGUI();
        }
    }


}

