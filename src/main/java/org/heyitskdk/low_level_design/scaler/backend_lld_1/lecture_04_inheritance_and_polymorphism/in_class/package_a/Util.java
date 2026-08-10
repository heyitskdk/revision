package org.heyitskdk.low_level_design.scaler.backend_lld_1.lecture_04_inheritance_and_polymorphism.in_class.package_a;

public class Util {

    private static void changePassword(Parent object) {
        object.setBankBalance(10000);
        System.out.println("Your updated bank balance: " + object.getBankBalance());
    }

    public static void main(String[] args) {
        Child child = new Child();
        // abstraction achieved successfully
        changePassword(child);

        // run-time poly
        child.parentMethod("John Doe");

        Parent p = new Child();
        System.out.println(p.name);
        p.parentMethod("WTF");
    }
}
