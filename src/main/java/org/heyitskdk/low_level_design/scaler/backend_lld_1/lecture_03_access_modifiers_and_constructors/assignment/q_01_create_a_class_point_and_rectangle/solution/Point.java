package org.heyitskdk.low_level_design.scaler.backend_lld_1.lecture_03_access_modifiers_and_constructors.assignment.q_01_create_a_class_point_and_rectangle.solution;

public class Point {
    // write the code of point class here
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point (Point point) {
        this(point.x, point.y);
    }
}
