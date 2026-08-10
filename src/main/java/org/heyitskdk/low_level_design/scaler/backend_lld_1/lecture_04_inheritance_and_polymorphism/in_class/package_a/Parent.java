package org.heyitskdk.low_level_design.scaler.backend_lld_1.lecture_04_inheritance_and_polymorphism.in_class.package_a;

public class Parent {
    private int bankBalance;
    protected boolean isMarried;
    String name = "Baap hu main";
    public int age;

    public void setBankBalance(int bankBalance) {
        this.bankBalance = bankBalance;
    }

    public int getBankBalance() {
        return bankBalance;
    }

    protected void parentMethod(String str) {
        System.out.println("Inside the parent's method " + str);
    }
}
