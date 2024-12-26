package com.Java8;

public class TestGreet {
	
	public static void main(String[] args) {
         //Lambda Expression for the functional interface
      Greeting greet = name -> System.out.println("Hello, " + name + "!");
       
       greet.sayHello("Alice"); // Prints: Hello, Alice!
		

   }
}