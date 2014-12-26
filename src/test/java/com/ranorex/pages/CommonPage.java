package com.ranorex.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public abstract class CommonPage extends PageObject{
    private Object firstHandle;
    private Object lastHandle;

    public void switchToWindowsPopup() {
        Set<String> handles = getDriver().getWindowHandles();
        Iterator<String> itr = handles.iterator();
        firstHandle = itr.next();
        lastHandle = firstHandle;
        while (itr.hasNext()) {
            lastHandle = itr.next();
        }
		getDriver().switchTo().window(lastHandle.toString());
    }

    public void switchToMainWindow() {
		getDriver().switchTo().window(firstHandle.toString());
    }
}