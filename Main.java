package org.example;


public class Main {
    public static void main(String[] args) {
        // Create an instance of StringProcessor
        org.example.StringProcessor processor = new org.example.StringProcessor();

        // Test isStrongPassword method
        String password = "Password123!";
        boolean isStrong = processor.isStrongPassword(password);
        System.out.println("Is the password '" + password + "' strong? " + isStrong);

        // Test calculateDigits method
        String sentenceWithDigits = "I have 2 cats and 3 dogs.";
        int digitCount = processor.calculateDigits(sentenceWithDigits);
        System.out.println("Number of digits in sentence: " + digitCount);

        // Test calculateWords method
        String sentence = "This is a sample sentence.";
        int wordCount = processor.calculateWords(sentence);
        System.out.println("Number of words in sentence: " + wordCount);

        // Test calculateExpression method
        String expression = "3 + 5 * (2 - 1)";
        double result = processor.calculateExpression(expression);
        System.out.println("Result of expression '" + expression + "': " + result);
    }
}

