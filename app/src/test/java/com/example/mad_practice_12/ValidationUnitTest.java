package com.example.mad_practice_12;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidationUnitTest {
    @Test
    public void validateUser_isCorrect() {
        User user = new User("isip_m.d.timkin@mail.ru",
                "j!1l@k2Vs5p", "j!1l@k2Vs5p");
        Validator validator = new Validator();
        boolean result = validator.validateUser(user);
        boolean r1 = validator.validateEmail(user.Email);
        boolean r2 = validator.validatePassword(user.Password);
        boolean r3 = validator.validatePasswordsMatch(user.Password, user.ConfirmPassword);
        assertTrue(result);
    }

    @Test
    public void validateEmail_isCorrect() {
        String email = "example@gmail.com";
        Validator validator = new Validator();
        boolean result  = validator.validateEmail(email);
        assertTrue(result);
    }

    @Test
    public void validatePassword_isCorrect() {
        String password = "P@ssw0rd";
        Validator validator = new Validator();
        boolean result  = validator.validatePassword(password);
        assertTrue(result);
    }

    @Test
    public void validatePassword_matches() {
        String password = "P@ssw0rd";
        String passwordConfirmation = "P@ssw0rd";
        Validator validator = new Validator();
        boolean result = validator.validatePasswordsMatch(password, passwordConfirmation);
        assertTrue(result);
    }
}