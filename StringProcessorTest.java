package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringProcessorTest {

    @Test
    public void testIsStrongPassword() {
        org.example.StringProcessor sp = new org.example.StringProcessor();

        // Test cases for strong password
        assertTrue(sp.isStrongPassword("Aa1@"));  // Minimum strong password
        assertFalse(sp.isStrongPassword("abcd"));  // No uppercase, digit, special char
        assertFalse(sp.isStrongPassword("ABCD1!")); // No lowercase
        assertTrue(sp.isStrongPassword("Passw0rd!")); // Strong password
        assertFalse(sp.isStrongPassword("123456")); // Only digits
    }

    @Test
    public void testCalculateDigits() {
        org.example.StringProcessor sp = new org.example.StringProcessor();

        // Test cases for counting digits
        assertEquals(3, sp.calculateDigits("abc123")); // Three digits
        assertEquals(0, sp.calculateDigits("abcdef")); // No digits
        assertEquals(1, sp.calculateDigits("a1b2c")); // One digit
        assertEquals(6, sp.calculateDigits("123456")); // All digits
        assertEquals(0, sp.calculateDigits("!@#$%")); // Special characters only
    }

    @org.junit.Test
    @Test
    public void testCalculateWords() {
        org.example.StringProcessor sp = new org.example.StringProcessor();

        // Test cases for counting words
        assertEquals(4, sp.calculateWords("This is a test")); // Regular sentence
        assertEquals(0, sp.calculateWords("    ")); // Empty sentence
        assertEquals(1, sp.calculateWords("Hello")); // Single word
        assertEquals(3, sp.calculateWords("Word1 Word2  Word3 ")); // Multiple words with extra spaces
        assertEquals(2, sp.calculateWords("Two words")); // Two words
    }

    @Test
    public void testCalculateExpression() {
        org.example.StringProcessor sp = new org.example.StringProcessor();

        // Test cases for expression evaluation
        assertEquals(7, sp.calculateExpression("3 + 4"), 0.001);
        assertEquals(15, sp.calculateExpression("3 * 5"), 0.001);
        assertEquals(2.5, sp.calculateExpression("5 / 2"), 0.001);
        assertEquals(1, sp.calculateExpression("(3 - 2)"), 0.001);
        assertThrows(IllegalArgumentException.class, () -> sp.calculateExpression("3 + "));
    }
}

