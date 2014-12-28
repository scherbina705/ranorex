package com.ranorex;

import net.thucydides.jbehave.ThucydidesJUnitStories;

public class SecondThreadTestRunner extends ThucydidesJUnitStories {
    public SecondThreadTestRunner(){
        findStoriesCalled("/secondThread/*.story");
    }
}
