# TDD Calculator

## Overview
This project is a simple calculator implemented using `Test-Driven Development (TDD)` in Java. It provides basic arithmetic operations such as `addition` and `multiplication` for multiple numbers.

## Technologies Used
* `Java 21`
* `JUnit 5` for unit testing
* `IntelliJ IDEA`

## Project Structure

* `Calculator.java`: Contains the core logic for addition and multiplication.
* `CalculatorTest.java`: Contains JUnit test cases to verify the correctness of the calculator methods.

# Installation and Setup

## Prerequisites
* Java 21 installed
* JUnit 5

## Steps to Run the Tests
Clone the repository:

git clone https://github.com/your-repo/TDD-Calculator.git
cd TDD-Calculator

Open the project in `IntelliJ IDEA`.
Run the tests from the IDE or use the terminal:

## Features
* `Addition (add method)`: Accepts multiple numbers and returns their sum.
* `Multiplication (multiply method)`: Accepts multiple numbers and returns their product.
* `JUnit Test Cases`: Ensures the correctness of the methods using TDD.

## Code Implementation

## Calculator.java

package org.example;

public class Calculator {

    public static int add(int... numbers) {
    
        int sum = 0;
        
        for (int number : numbers) {
        
            sum += number;
            
        }
        
        return sum;
        
    }

    public static int multiply(int... numbers) {
    
        int result = 1;
        
        for (int number : numbers) {
        
            result *= number;
            
        }
        
        return result;
        
    }
    
}

# CalculatorTest.java (JUnit 5 Tests)

package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    
    public void testAddTwoNumbers() {
    
        assertEquals(3, Calculator.add(1, 2));
        
        assertEquals(-2, Calculator.add(-1, -1));
        
    }

    @Test
    
    public void testAddMultipleNumbers() {
    
        assertEquals(15, Calculator.add(1, 2, 3, 4, 5));
    }

    @Test
    
    public void testMultiplyTwoNumbers() {
    
        assertEquals(3, Calculator.multiply(1, 3));
        
        assertEquals(-3, Calculator.multiply(-1, 3));
        
    }

    @Test
    
    public void testMultiplyMultipleNumbers() {
    
        assertEquals(120, Calculator.multiply(1, 2, 3, 4, 5));
        
    }
    
}

# Test Results
* The project successfully passed all test cases, as shown in the IntelliJ test report:
* ✔ 4/4 Tests Passed ✅
![Screenshot 2025-02-17 100009](https://github.com/user-attachments/assets/17e86ef4-8787-47bc-a1da-3621df5ee5ac)


# Future Improvements
* Add support for division and subtraction.
* Implement exception handling for invalid inputs (e.g., division by zero).
* Enhance user interaction with a command-line or GUI interface.
