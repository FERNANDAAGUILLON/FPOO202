importjava.security.SecureRandom;

public class PasswordGenerator {
        publicstaticfinalStringLOWERCASE="abcdefghijklmnopqrstuvwxyz";
        publicstaticfinalStringUPPERCASE="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        publicstaticfinalStringSPECIALS="!@#$%^&*()-_=+<>?";
        publicstaticfinalStringNUMBERS="0123456789";

        publicstaticStringgeneratePassword(intlength,booleanuseUppercase,booleanuseSpecials){
            Stringcharacters=LOWERCASE+NUMBERS;
            if(useUppercase)characters+=UPPERCASE;
            if(useSpecials)characters+=SPECIALS;

            SecureRandomrandom=newSecureRandom();
            StringBuilderpassword=newStringBuilder();
            for(inti=0;i<length;i++){
                password.append(characters.charAt(random.nextInt(characters.length())));
            }
            returnpassword.toString();
        }

        publicstaticStringcheckStrength(Stringpassword){
            if(password.length()>=12&&password.matches(".*[A-Z].*")&&password.matches(".*[!@#$%^&*()-_=+<>?].*"))
                return"Fuerte";
            if(password.length()>=10)return"Media";
            return"Débil";
        }
    }

}
