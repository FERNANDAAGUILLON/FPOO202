import java.security.SecureRandom;

public class PasswordUtils {
        public static final String CHARS = "abcdefghijklmnopqrstuvwxyz0123456789";
        public static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        public static final String SPECIALS = "!@#$%^&*()-_=+[]{};:,.<>?";

        public static String generatePassword(int length, boolean useUpper, boolean useSpecial) {
            String chars = CHARS + (useUpper ? UPPERCASE : "") + (useSpecial ? SPECIALS : "");
            SecureRandom random = new SecureRandom();
            StringBuilder password = new StringBuilder();
            for (int i = 0; i < length; i++) {
                password.append(chars.charAt(random.nextInt(chars.length())));
            }
            return password.toString();
        }

        public static String checkStrength(String password) {
            int length = password.length();
            int score = (password.matches(".*[A-Z].*") ? 1 : 0)
                    + (password.matches(".*[a-z].*") ? 1 : 0)
                    + (password.matches(".*[0-9].*") ? 1 : 0)
                    + (password.matches((".*[!@#$%^&*()\\-_=+\\\\\\ {};:,.<>?].*") ? 1 : 0);

            if (length >= 12 && score == 4) return "Muy Fuerte";
            if (length >= 10 && score >= 3) return "Fuerte";
            if (length >= 8 && score >= 2) return "Moderada";
            return "Débil";
        }
    }

}
