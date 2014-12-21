package com.ranorex.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class CommonPage extends PageObject{
    private Object firstHandle;
    private Object lastHandle;
    private WebDriver driver=getDriver();

    public void switchToWindowsPopup() {
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> itr = handles.iterator();
        firstHandle = itr.next();
        lastHandle = firstHandle;
        while (itr.hasNext()) {
            lastHandle = itr.next();
        }
        driver.switchTo().window(lastHandle.toString());
    }

    public void switchToMainWindow() {
        driver.switchTo().window(firstHandle.toString());
    }
}