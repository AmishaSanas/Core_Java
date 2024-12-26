package com.oop.ExceptionHandling;
//Custom exception definition
public class CustomException extends Exception {
	
            public CustomException(String message) {
		        super(message);
		    }
		}
		// Another custom exception for wrapping the original exception
		class WrappedException extends Exception {
		    public WrappedException(String message, Throwable cause) {
		        super(message, cause);
		    }
		}
		 class TestPropagation {
		    // Method first() that calls second() and handles exceptions
		    public void first() {
		        try {
		            second(); // calling second(), which throws a CustomException
		        } catch (CustomException e) {
		            System.out.println("Caught CustomException in first(): " + e.getMessage());
		            try {
		                // Wrap the CustomException into WrappedException and rethrow
		                throw new WrappedException("Wrapped the exception in first()", e);
		            } catch (WrappedException ex) {
		                System.out.println("Caught WrappedException in first(): " + ex.getMessage());
		                ex.printStackTrace();
		            }
		        }
		    }
		    // Method second() that throws a CustomException
		    public void second() throws CustomException {
		        throw new CustomException("This is a custom exception from second()!");
		    }

		    public static void main(String[] args) {
		        TestPropagation testPropagation = new TestPropagation();
		        testPropagation.first(); // Calling the first method which propagates the exception
		    }
	}
