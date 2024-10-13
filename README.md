# String Processor

## Overview
**String Processor** is a Java utility class designed to perform various string manipulation operations, including password validation, digit counting, word counting, and mathematical expression evaluation. It serves as a helpful tool for developers working with string data in their applications.

## Features
- Password Strength Checker: Validates whether a password meets criteria for strength (length, character variety).
- Digit Counter: Counts the number of digits in a given string.
- Word Counter: Counts the number of words in a sentence.
- Expression Evaluator: Evaluates simple mathematical expressions.

## Requirements

- Java Development Kit (JDK) 8 or higher
- Maven for dependency management (optional)


## Installation

### Clone the Repository:
git clone https://github.com/yourusername/StringProcessor.git
cd StringProcessor


### Build the Project
To build the project, run:
```
mvn clean install
```


## Test Cases


### The test cases cover the following methods:

- isStrongPassword: Validates different password scenarios.
- calculateDigits: Counts digits in various string inputs.
- calculateWords: Counts words, including handling edge cases with extra spaces.
- calculateExpression: Evaluates expressions and tests for invalid inputs.
