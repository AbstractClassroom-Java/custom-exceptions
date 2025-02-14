package org.example;

public enum ShapeErrorStrings {
    INVALID_SIDE_LENGTH("Both width and height must be greater than 0"),
    INVALID_RADIUS("Radius must be greater than 0"),
    INVALID_TRIANGLE_SIDES("The sum of the lengths of any two sides of a triangle must be greater than the length of the third side");

    private final String message;

    ShapeErrorStrings(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
