package se.bibliotek.sakerhetapp;

import org.mindrot.jbcrypt.BCrypt;

// Hanterar lösenord (hashing)
public class LosenordUtil {

    // Hashar lösenord
    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    // Kontrollerar lösenord
    public static boolean checkPassword(String password, String hash) {
        return BCrypt.checkpw(password, hash);
    }
}