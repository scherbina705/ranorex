package com.ranorex.jbehave;

import com.ranorex.steps.VipDatabaseSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class VipDBGivenSteps {
    @Steps
    VipDatabaseSteps step;

    @Given("connection status should be $status")
    public void userIsConnectedToDB(String status){
        step.connectionStatusShouldBe(status);
    }

    @Given("table is empty")
    public void tableShouldBeEmpty(){
        step.tableShouldBeEmpty();
    }

    @Given("the user click on Load button")
    @When("the user click on Load button")
    public void clickOnLoadButton(){
        step.clickOnLoadButton();
    }

    @Then("vip count value equals $number")
    @Given("vip count value equals $number")
    public void vipCountValue(String number){
        step.vipCountValueShouldEquals(number);
    }

    @Given("the user is on the VIP DB page")
    public void UserIsOnVIPDBPage(){
        step.openPage();
    }

    @When("the user click on Disconnect button")
    @Given("the user click on Disconnect button")
    public void UserClickOnDisconnectButton(){
        step.clickOnDisconnectButton();
    }

    @Given("the user added VIP to the table")
    public void addVIPToTable(){
        step.fillAnyValuesForVIP();
        step.clickOnAddButton();
    }
}
