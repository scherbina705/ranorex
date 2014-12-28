package com.ranorex;

import net.thucydides.jbehave.ThucydidesJUnitStories;

public class FirstThreadTestRunner extends ThucydidesJUnitStories{
    public FirstThreadTestRunner(){
        findStoriesCalled("/firstThread/*.story");
    }
}
