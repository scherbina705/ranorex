package com.ranorex;

import net.serenitybdd.jbehave.SerenityStories;

public class SecondThreadTestRunner extends SerenityStories {
    public SecondThreadTestRunner(){
        findStoriesCalled("/secondThread/*.story");
    }
}
