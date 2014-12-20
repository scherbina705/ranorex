package com.ranorex.steps;


import com.ranorex.pages.VipDatabasePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

public class VipDatabaseSteps extends ScenarioSteps{
    VipDatabasePage page;

    @Step
    public void disconnectFromDb(){
        page.getDisconnectButton().click();
    }

    @Step
    public void connectionStatusShouldBeDisconnected(){
        assertTrue(("Offline").equals(page.getConnectionLabel().getText()));
    }

    @Step
    public void openPage(){
        page.open();
    }
}
