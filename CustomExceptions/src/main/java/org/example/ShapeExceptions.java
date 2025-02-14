package org.example;

public class ShapeExceptions extends Exception {
    public ShapeExceptions(String message) {
        super(message);
    }

    public ShapeExceptions(ShapeErrorStrings error) {
        super(error.getMessage());
    }
}
