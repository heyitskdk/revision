package org.heyitskdk.low_level_design.scaler.backend_lld_1.lecture_03_access_modifiers_and_constructors.in_class;

import java.time.Instant;

public class EncapsulationPractice {
    private final String name;
    private final int birthYear;
    private static final Instant classloadTimeStamp;

    static {
        classloadTimeStamp = Instant.now();
    }

    EncapsulationPractice(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    private int getBirthYear() {
        return birthYear;
    }

    private String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "The name's " + name.split(" ")[1] + ", " + name + ". Serving her majesty since " + birthYear;
    }


    public static void main(String[] args) {
        EncapsulationPractice person1 = new EncapsulationPractice("James Bond", 1968);
        System.out.println(person1);
    }
}
