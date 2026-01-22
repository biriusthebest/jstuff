package org.author.demo;

public class EmailValidator {

    public boolean isValidEmail(String email) {
        // Simple validation for demonstration purposes
        if (email.contains("@")) {
            return true;
        } else {
            return false;
        }
    }
}