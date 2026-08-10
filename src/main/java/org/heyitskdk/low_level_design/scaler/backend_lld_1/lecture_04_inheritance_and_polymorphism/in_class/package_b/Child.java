package org.heyitskdk.low_level_design.scaler.backend_lld_1.lecture_04_inheritance_and_polymorphism.in_class.package_b;

import org.heyitskdk.low_level_design.scaler.backend_lld_1.lecture_04_inheritance_and_polymorphism.in_class.package_a.Parent;

public class Child extends Parent {
    String cityOfBirth;

    public void accessParent() {
        // no access to default fields
        // this.name = "Raghal Jurel";
        // super.name = "Woah";

        // access to protected members is allowed
        this.isMarried = false;
    }
}
