package com.mycompany.app;

/**
 * Simple Hello World application that demonstrates basic Java functionality.
 * 
 * <p>This class serves as the main entry point for a basic console application
 * that outputs a greeting message. It provides both static and instance methods
 * for accessing the greeting message.</p>
 * 
 * @author MyCompany Development Team
 * @version 1.0-SNAPSHOT
 * @since 1.0
 */
public class App {

    /** The default greeting message displayed by the application. */
    private static final String MESSAGE = "Hello World!";

    /**
     * Default constructor for the App class.
     * 
     * <p>Creates a new instance of the App class. This constructor performs
     * no special initialization and is provided for standard object creation.</p>
     */
    public App() {}

    /**
     * Main entry point for the application.
     * 
     * <p>This method serves as the entry point when the application is executed
     * from the command line. It outputs the default greeting message to the
     * standard output stream.</p>
     * 
     * @param args command line arguments passed to the application (currently unused)
     */
    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    /**
     * Retrieves the greeting message.
     * 
     * <p>This method provides access to the application's greeting message
     * through an instance method. The message returned is the same constant
     * message used throughout the application.</p>
     * 
     * @return the greeting message as a String
     */
    public String getMessage() {
        return MESSAGE;
    }
}
