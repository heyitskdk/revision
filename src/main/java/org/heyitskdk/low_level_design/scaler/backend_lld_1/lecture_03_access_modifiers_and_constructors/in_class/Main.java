package org.heyitskdk.low_level_design.scaler.backend_lld_1.lecture_03_access_modifiers_and_constructors.in_class;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 1);
        Exam exam1 = new Exam("Maths", 98);
        student1.exam = exam1;

        Exam exam2 = new Exam("English", 88);
        Student student2 = new Student("Mary Jane", 2, exam2);

        Student student3 = new Student(student2);

        System.out.println("debug");
    }
}
