package org.example;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height)  {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Both width and height must be greater than 0");
        }
//        if (width <= 0 || height <= 0) {
//            throw new ShapeExceptions(ShapeErrorStrings.INVALID_SIDE_LENGTH);
//        }


        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }
}
