package com.ranorex.steps;


import com.ranorex.pages.VipDatabasePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.WebElementFacade;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.sql.DriverManager;
import java.util.Iterator;
import java.util.Set;

import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

public class VipDatabaseSteps extends ScenarioSteps{
    VipDatabasePage page;

    @Step
    public void clickOnDisconnectButton(){
        page.getDisconnectConnectButton().click();
    }

    @Step
    public void connectionStatusShouldBe(String status){
        WebElementFacade label = page.getConnectionLabel();
        assertTrue(page.waitForCondition().until(ExpectedConditions.textToBePresentInElement(label, status)));
    }

    @Step
    public void clickOnConnectButton(){
        page.getDisconnectConnectButton().click();
    }

    @Step
    public void clickOnOkInModalWindow(){
        page.switchToWindowsPopup();
        page.getOkButtonInModalWindow().click();
        page.switchToMainWindow();
    }

    @Step
    public void openPage(){
        page.open();
    }
}
