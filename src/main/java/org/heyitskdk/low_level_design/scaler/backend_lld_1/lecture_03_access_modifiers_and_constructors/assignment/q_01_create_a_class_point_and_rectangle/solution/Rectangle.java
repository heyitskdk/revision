package org.heyitskdk.low_level_design.scaler.backend_lld_1.lecture_03_access_modifiers_and_constructors.assignment.q_01_create_a_class_point_and_rectangle.solution;

public class Rectangle {
    // write the code of Rectangle class here
    public Point topLeft;
    public Point bottomRight;

    public Rectangle(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY) {
        topLeft = new Point(topLeftX, topLeftY);
        bottomRight = new Point(bottomRightX, bottomRightY);
    }

    public Rectangle(Point topLeft, Point botomRight) {
        this.topLeft = new Point(topLeft);
        this.bottomRight = new Point(botomRight);
    }

    public Rectangle(Rectangle rectangle) {
        this(rectangle.topLeft, rectangle.bottomRight);
    }
}
