package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testAppConstructor() {
        App app1 = new App();
        App app2 = new App();
        assertEquals(app1.getMessage(), app2.getMessage());
    }

    @Test
    public void testAppMessage()
    {
        App app = new App();
        assertEquals("Hello World!", app.getMessage());
    }

    @Test
    public void testGreetWithName() {
        App app = new App();
        assertEquals("Hello John!", app.greet("John"));
    }

    @Test
    public void testGreetWithEmptyName() {
        App app = new App();
        assertEquals("Hello Stranger!", app.greet(""));
    }

    @Test
    public void testGreetWithNullName() {
        App app = new App();
        assertEquals("Hello Stranger!", app.greet(null));
    }

    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(5, app.add(2, 3));
    }
}
