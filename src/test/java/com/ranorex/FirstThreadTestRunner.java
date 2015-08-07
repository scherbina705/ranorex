package com.ranorex;

import net.serenitybdd.jbehave.SerenityStories;

public class FirstThreadTestRunner extends SerenityStories{
    public FirstThreadTestRunner(){
        findStoriesCalled("/firstThread/FindIndexOfElementByText.story");
    }
}
