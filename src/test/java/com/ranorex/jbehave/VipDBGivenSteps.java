package com.ranorex.jbehave;

import com.ranorex.steps.VipDatabaseThucydidesSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;

public class VipDBGivenSteps {
    @Steps
    VipDatabaseThucydidesSteps step;

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

    @Given("the user is on the VIP DB page")
    public void UserIsOnVIPDBPage(){
        step.openPage();
    }

    @When("the user click on Disconnect button")
    @Given("the user click on Disconnect button")
    public void UserClickOnDisconnectButton(){
        step.clickOnDisconnectButton();
    }

    @Given("the user added VIP to the table with values <firstName>, <lastName>, <gender>, <category>")
    public void addVIPToTable(@Named("firstName") String firstName, @Named("lastName") String lastName, @Named("gender") String gender, @Named("category") String category){
        step.fillFirstName(firstName);
        step.fillLastName(lastName);
        step.selectGenderByValue(gender);
        step.selectCategory(category);
        step.clickOnAddButton();
    }
}
