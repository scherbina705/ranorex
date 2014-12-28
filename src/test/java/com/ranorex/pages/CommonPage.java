package com.ranorex.pages;

import net.thucydides.core.pages.PageObject;

import java.util.Iterator;
import java.util.Set;

public abstract class CommonPage extends PageObject{
    private String firstHandle;
    private Object lastHandle;

    public void switchToModalWindow() {
        firstHandle=getDriver().getWindowHandle();
        Set<String> handles = getDriver().getWindowHandles();
        Iterator<String> itr = handles.iterator();
        lastHandle = itr.next();
        while (itr.hasNext()) {
            lastHandle = itr.next();
        }
		getDriver().switchTo().window(lastHandle.toString());
    }

    public void closeCurrentSelectedWindow() {
        getDriver().close();
    }

    public void switchBackToMainWindow() {
		getDriver().switchTo().window(firstHandle);
    }
}