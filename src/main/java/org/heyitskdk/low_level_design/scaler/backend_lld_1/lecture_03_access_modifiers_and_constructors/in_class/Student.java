package org.heyitskdk.low_level_design.scaler.backend_lld_1.lecture_03_access_modifiers_and_constructors.in_class;

public class Student {
    String name;
    int id;
    Exam exam;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    Student(String name, int id, Exam exam) {
        this(name, id);
        this.exam = new Exam(exam);
    }

    Student(Student other) {
        this(other.name, other.id);
        this.exam = new Exam(other.exam);
    }
}
