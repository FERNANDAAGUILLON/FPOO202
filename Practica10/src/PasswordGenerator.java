import java.security.SecureRandom;
import javax.swing.*;

public class PasswordGenerator {
        public static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
        public static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        public static final String SPECIALS = "!@#$%^&*()-_=+<>?";
        public static final String NUMBERS = "0123456789";

        public static String generatePassword(int length, boolean useUppercase, boolean useSpecials) {
            String characters = LOWERCASE + NUMBERS;
            if (useUppercase) characters += UPPERCASE;
            if (useSpecials) characters += SPECIALS;

            SecureRandom random = new SecureRandom();
            StringBuilder password = new StringBuilder();
            for (int i = 0; i < length; i++) {
                password.append(characters.charAt(random.nextInt(characters.length())));
            }
            return password.toString();
        }

        public static String checkStrength(String password) {
            if (password.length() >= 12 && password.matches(".*[A-Z].*") && password.matches(".*[!@#$%^&*()-_=+<>?].*"))
                return "Fuerte";
            if (password.length() >= 10) return "Media";
            return "Débil";
        }
    }

