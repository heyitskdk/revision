package org.heyitskdk.low_level_design.scaler.backend_lld_1.lecture_03_access_modifiers_and_constructors.in_class;

public class StaticPractice {
    static int objectCount;

    static {
        System.out.println("Inside static block");
        objectCount = 0;
    }

    static void getObjectCount() {
        System.out.println("Inside Static Method");
        System.out.println("Object's created: " + objectCount);
    }

    StaticPractice() {
        System.out.println("Object constructed");
        objectCount++;
    }
}
