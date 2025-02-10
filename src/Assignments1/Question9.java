// Q9 Create a custom exception that do not have any stack trace.
package Assignments1;

import java.io.PrintStream;
public class Question9 {
    public static void main(String[] args) {
        try {
            throw new NoStackTraceException("This is a custom exception without stack trace.");
        } catch (NoStackTraceException e) {
            System.out.println("Caught exception: " + e.getMessage());
            e.printStackTrace(); 
        }
    }

    public static class NoStackTraceException extends Exception {
        public NoStackTraceException(String message) {
            super(message);
        }
        @Override
        public Throwable fillInStackTrace() {
            return this;
        }
        @Override
        public void printStackTrace(PrintStream s) {
            s.println(getMessage());
        }
    }
}

