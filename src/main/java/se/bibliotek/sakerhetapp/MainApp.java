package se.bibliotek.sakerhetapp;

// Test av loggning
public class MainApp {

    public static void main(String[] args) {

        AppLogger.logger.info("Applikationen startade");

        String password = "Test123!password";

        if (LosenordPolicy.isValid(password)) {
            AppLogger.logger.info("Lösenord är giltigt");
        } else {
            AppLogger.logger.warn("Ogiltigt lösenord");
        }

        String hash = LosenordUtil.hashPassword(password);

        if (LosenordUtil.checkPassword(password, hash)) {
            AppLogger.logger.info("Inloggning lyckades");
        } else {
            AppLogger.logger.error("Inloggning misslyckades");
        }
    }
}