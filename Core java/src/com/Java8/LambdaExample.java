package com.Java8;

@FunctionalInterface
interface NoParameter {
    void sayHello();
}

@FunctionalInterface
interface SingleParameter {
    void displayMessage(String message);
}

@FunctionalInterface
interface MultipleParameters {
    int calculate(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        // No Parameters - The Lambda does not take any parameters and directly prints a message.

        NoParameter greet = () -> System.out.println("NoParameter greet : Hello, World!");
        greet.sayHello();

        // Single Parameter - The Lambda takes a single parameter (message) and uses it in a print statement.
        SingleParameter showMessage = message -> System.out.println("Message: " + message);
        showMessage.displayMessage("This is a single parameter example."); 
        
        //Multiple Parameters - One Lambda simply adds two numbers.
        MultipleParameters add = (a, b) -> a + b;
        System.out.println("Multiple Parameters Sum: " + add.calculate(10, 20));

        //Body -  Lambda (with a block body) multiplies two numbers and includes a print statement before returning the result.
        MultipleParameters multiply = (a, b) -> {
            System.out.println("Multiplying " + a + " and " + b);
            return a * b;
        };
        System.out.println("Product: " + multiply.calculate(5, 4));   
    }
}    