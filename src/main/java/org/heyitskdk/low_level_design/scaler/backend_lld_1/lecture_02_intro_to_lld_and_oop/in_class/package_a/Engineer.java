package org.heyitskdk.low_level_design.scaler.backend_lld_1.lecture_02_intro_to_lld_and_oop.in_class.package_a;

public class Engineer {

    private int employeeID;
    String name;
    private static int count;

    Engineer(int employeeID, String name) {
        this.employeeID = employeeID;
        this.name = name;
    }

    int getEmployeeID() {
        return this.employeeID;
    }

    public static void main(String[] args) {
        Engineer.count++;
        System.out.println(count);
    }

}
