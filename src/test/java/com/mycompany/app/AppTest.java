package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Comprehensive unit tests for the {@link App} class.
 * 
 * <p>This test class validates the functionality of the App class, ensuring
 * that the greeting message is correctly handled both through constructor
 * initialization and direct method calls. The tests verify consistency
 * and correctness of the application's core functionality.</p>
 * 
 * <p>Uses JUnit 5 testing framework for test execution and assertions.</p>
 * 
 * @author MyCompany Development Team
 * @version 1.0-SNAPSHOT
 * @since 1.0
 * @see App
 */
public class AppTest
{
    /**
     * Tests that multiple App instances return consistent greeting messages.
     * 
     * <p>This test verifies that different instances of the App class
     * return the same greeting message, ensuring consistency across
     * object instantiation. This validates that the message is properly
     * defined as a shared constant.</p>
     * 
     * @see App#getMessage()
     */
    @Test
    public void testAppConstructor() {
        App app1 = new App();
        App app2 = new App();
        assertEquals(app1.getMessage(), app2.getMessage());
    }

    /**
     * Tests that the App instance returns the correct greeting message.
     * 
     * <p>This test validates that the {@link App#getMessage()} method
     * returns the expected "Hello World!" message. This ensures the
     * core functionality of the application works as designed.</p>
     * 
     * @see App#getMessage()
     */
    @Test
    public void testAppMessage()
    {
        App app = new App();
        assertEquals("Hello World!", app.getMessage());
    }
}
