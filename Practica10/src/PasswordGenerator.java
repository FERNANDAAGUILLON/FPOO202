import java.security.SecureRandom;

public class PasswordGenerator {

    private static final String minusculas = "abcdefghijklmnopqrstuvwxyz";
    private static final String mayusculas  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String caracter_espciales = "!@#$%^&*()-_=+<>?";
    private static final String NUMEROS = "0123456789";

    private int longitud;
    private boolean incluirMayusculas;
    private boolean incluirEspeciales;

    public PasswordGenerator ( int longitud, boolean incluirMayusculas, boolean incluirEspeciales) {
        this.longitud = (longitud < 8) ? 8 : longitud;
        this.incluirMayusculas = incluirMayusculas;
        this.incluirEspeciales = incluirEspeciales;
    }

    public String crearContrasena() {
        String caracteres = minusculas + NUMEROS;
        if (incluirMayusculas) caracteres += mayusculas ;
        if (incluirEspeciales) caracteres += caracteres _ especiales ;

        SecureRandom random = new SecureRandom();
        StringBuilder contrasena = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            contrasena.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }
        return contrasena.toString();
    }

    public static String evaluarSeguridad(String contrasena) {
        if (contrasena.length() >= 12 && contrasena.matches(".*[A-Z].*") && contrasena.matches(".*[!@#$%^&*()-_=+<>?].*")) {
            return "Fuerte";
        }
        if (contrasena.length() >= 10) return "Media";
        return "Débil";
    }
}