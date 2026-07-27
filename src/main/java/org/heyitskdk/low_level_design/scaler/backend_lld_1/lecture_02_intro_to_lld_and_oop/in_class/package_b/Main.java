package org.heyitskdk.low_level_design.scaler.backend_lld_1.lecture_02_intro_to_lld_and_oop.in_class.package_b;

import org.heyitskdk.low_level_design.scaler.backend_lld_1.lecture_02_intro_to_lld_and_oop.in_class.package_a.Student;

public class Main {

    static Student student = new Student("John Doe", 21, 100);

    public static void main(String[] args) {
        student.printName();
    }
}
