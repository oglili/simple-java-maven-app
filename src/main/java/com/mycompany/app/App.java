package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }

    public String greet(String name) {
        if (name == null || name.isBlank()) {
            return "Hello Stranger!";
        }
        return "Hello " + name + "!";
    }

    public int add(int a, int b) {
        return a + b;
    }

}
