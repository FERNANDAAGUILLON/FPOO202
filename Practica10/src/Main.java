import javax.swing.JOptionPane;
import javax.swing .*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            boolean continuar = true;

            while (continuar) {
                String inputLength = JOptionPane.showInputDialog("Ingrese la longitud de la contraseña (mínimo 8, por defecto 8):");
                int length = (inputLength != null && !inputLength.isEmpty()) ? Integer.parseInt(inputLength) : 8;
                if (length < 8) length = 8;

                int includeUppercase = JOptionPane.showConfirmDialog(null, "¿Incluir mayúsculas?", "Opciones", JOptionPane.YES_NO_OPTION);
                int includeSpecials = JOptionPane.showConfirmDialog(null, "¿Incluir caracteres especiales?", "Opciones", JOptionPane.YES_NO_OPTION);

                boolean useUppercase = (includeUppercase == JOptionPane.YES_OPTION);
                boolean useSpecials = (includeSpecials == JOptionPane.YES_OPTION);

                String password = PasswordGenerator.generatePassword(length, useUppercase, useSpecials);
                String strength = PasswordGenerator.checkStrength(password);

                JOptionPane.showMessageDialog(null, "Contraseña generada: " + password + "\nFortaleza: " + strength, "Resultado", JOptionPane.INFORMATION_MESSAGE);

                int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea generar otra contraseña?", "Continuar", JOptionPane.YES_NO_OPTION);
                continuar = (respuesta == JOptionPane.YES_OPTION);
            }

            JOptionPane.showMessageDialog(null, "Programa finalizado.");
        }
    }







