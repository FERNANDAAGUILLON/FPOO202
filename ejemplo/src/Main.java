//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean seguir = true;

        while (seguir) {
            String inputLongitud = JOptionPane.showInputDialog("Ingrese la cantidad de caracteres para la contraseña (mínimo 8):");
            int longitud = (inputLongitud != null && !inputLongitud.isEmpty()) ? Integer.parseInt(inputLongitud) : 8;

            int opcionMayus = JOptionPane.showConfirmDialog(null, "¿Desea incluir letras mayúsculas?", "Opciones", JOptionPane.YES_NO_OPTION);
            int opcionEspeciales = JOptionPane.showConfirmDialog(null, "¿Desea incluir caracteres especiales?", "Opciones", JOptionPane.YES_NO_OPTION);

            boolean usarMayusculas = (opcionMayus == JOptionPane.YES_OPTION);
            boolean usarEspeciales = (opcionEspeciales == JOptionPane.YES_OPTION);

            PasswordGenerator  generador = new PasswordGenerator (longitud, usarMayusculas, usarEspeciales);
            String nuevaContrasena = generador.crearContrasena();
            String nivelSeguridad = PasswordGenerator .evaluarSeguridad(nuevaContrasena);

            JOptionPane.showMessageDialog(null, "Tu contraseña es: " + nuevaContrasena + "\nNivel de seguridad: " + nivelSeguridad, "Resultado", JOptionPane.INFORMATION_MESSAGE);

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Generar otra contraseña?", "Continuar", JOptionPane.YES_NO_OPTION);
            seguir = (respuesta == JOptionPane.YES_OPTION);
        }

        JOptionPane.showMessageDialog(null, "Gracias por usar el generador de contraseñas.");
    }
}