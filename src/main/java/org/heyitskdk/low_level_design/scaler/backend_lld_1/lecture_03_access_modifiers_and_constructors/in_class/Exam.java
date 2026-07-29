package org.heyitskdk.low_level_design.scaler.backend_lld_1.lecture_03_access_modifiers_and_constructors.in_class;

public class Exam {
    String subject;
    int marks;

    Exam() {};

    Exam(String subject, int marks) {
        this.subject = subject;
        this.marks = marks;
    }

    // copy constructor
    Exam(Exam other) {
        this.subject = other.subject;
        this.marks = other.marks;
    }
}
