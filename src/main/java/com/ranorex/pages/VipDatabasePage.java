package com.ranorex.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.WebElementFacade;

@DefaultUrl("http://www.ranorex.com/web-testing-examples/vip/")
public class VipDatabasePage extends CommonPage{

    public WebElementFacade getDisconnectConnectButton(){
        return find(By.id("connect"));
    }

    public WebElementFacade getConnectionLabel(){
        return find(By.id("connection"));
    }

    public WebElementFacade getOkButtonInModalWindow(){
        return find(By.xpath("//button[contains(text(), 'OK')]"));
    }
}
