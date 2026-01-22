package org.author.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailValidatorTest {

    @Test
    public void testIsValidEmail_ValidEmail_ReturnsTrue() {
        EmailValidator emailValidator = new EmailValidator();
        boolean result = emailValidator.isValidEmail("test@example.com");
        Assertions.assertTrue(result);
    }
}