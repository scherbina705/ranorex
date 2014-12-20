package com.ranorex.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://www.ranorex.com/web-testing-examples/vip/")
public class VipDatabasePage extends PageObject{
    public WebElement getDisconnectButton(){
        return getDriver().findElement(By.id("connect"));
    }
    public WebElement getConnectionLabel(){
        return getDriver().findElement(By.id("connection"));
    }
}
