package com.ranorex.jbehaveSteps;

import com.ranorex.steps.VipDatabaseSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;

public class ConnectionToDB {
    @Steps
    VipDatabaseSteps step;

    @Given("the user is on the VIP DB page")
    public void UserIsOnVIPDBPage(){
        step.openPage();
    }

    @When("the user click on Disconnect button")
    @Given("the user click on Disconnect button")
    public void UserClickOnDisconnectButton(){
        step.clickOnDisconnectButton();
    }

    @When("the user click on Connect button")
    public void UserClickOnConnectButton(){
        step.clickOnConnectButton();
    }

    @When("the user click on OK in modal window")
    public void UserClickOnOKInModalWindow(){
        step.clickOnOkInModalWindow();
    }

    @Then("connection status changed to $status")
    public void StatusIsChanged(String status){
        step.connectionStatusShouldBe(status);
    }

	@Then("Load button is disabled")
	public void loadButtonIsDisabled(){
		step.loadButtonShouldBeDisabled();
	}

	@Then("Save button is disabled")
	public void saveButtonIsDisabled(){
		step.saveButtonShouldBeDisabled();
	}
}
