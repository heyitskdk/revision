package org.heyitskdk.low_level_design.scaler.backend_lld_1.lecture_04_inheritance_and_polymorphism.in_class.package_a;

public class Child extends Parent {
    int birthYear = 2000;
    String name = "Baccha hu main";

    Child() {
        this.name = "Mai hu Balak";
    }

    public void accessParent() {
        this.name = "Vaibhav Suryavanshi";
    }

    protected void parentMethod(String str) {
        System.out.println("Inside child's method luv: " + str);
    }

}
