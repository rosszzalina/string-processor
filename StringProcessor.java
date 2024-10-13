package org.example;

public class StringProcessor {

    // Method to check if a password is strong
    public boolean isStrongPassword(String password) {
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUppercase = true;
            else if (Character.isLowerCase(c)) hasLowercase = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else hasSpecialChar = true;
        }

        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }

    // Method to count digits in a sentence
    public int calculateDigits(String sentence) {
        int digitCount = 0;
        for (char c : sentence.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        return digitCount;
    }

    // Method to calculate the number of words in a sentence
    public int calculateWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        return sentence.trim().split("\\s+").length;
    }

    // Method to evaluate a mathematical expression
    public double calculateExpression(String expression) {
        try {
            return new javax.script.ScriptEngineManager()
                    .getEngineByName("JavaScript")
                    .eval(expression) instanceof Number
                    ? ((Number) new javax.script.ScriptEngineManager()
                    .getEngineByName("JavaScript")
                    .eval(expression)).doubleValue()
                    : Double.NaN;
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid expression");
        }
    }
}

