package org.author.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailValidatorTest {

    // ... previous test ...

    @Test
    public void testGetDomain_ValidEmail_ReturnsDomain() {
        EmailValidator emailValidator = new EmailValidator();
        String result = emailValidator.getDomain("test@example.com");
        Assertions.assertEquals("example.com", result);
    }
}