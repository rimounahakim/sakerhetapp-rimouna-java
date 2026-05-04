package se.bibliotek.sakerhetapp;

// Kontrollerar lösenordets styrka
public class LosenordPolicy {

    public static boolean isValid(String password) {

        if (password.length() < 12) return false;

        if (!password.matches(".*[A-Z].*")) return false;

        if (!password.matches(".*[a-z].*")) return false;

        if (!password.matches(".*[0-9].*")) return false;

        if (!password.matches(".*[!@#$%^&*].*")) return false;

        return true;
    }
}