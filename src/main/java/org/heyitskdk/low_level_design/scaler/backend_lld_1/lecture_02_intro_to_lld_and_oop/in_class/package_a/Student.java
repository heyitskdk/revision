package org.heyitskdk.low_level_design.scaler.backend_lld_1.lecture_02_intro_to_lld_and_oop.in_class.package_a;

public class Student {
    private String name;
    int rollNo;
    protected int psp;

    public Student(String name, int rollNo, int psp) {
        this.name = name;
        this.rollNo = rollNo;
        this.psp = psp;
    }

    public void printName() {
        System.out.println("My name is " + this.name);
    }
}
