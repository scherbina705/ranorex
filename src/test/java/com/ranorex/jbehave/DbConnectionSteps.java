package com.ranorex.jbehave;

import com.ranorex.steps.VipDatabaseSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class DbConnectionSteps {
    @Steps
    VipDatabaseSteps step;

    @Given("the user is on db page")
    public void given(){
        step.openPage();
    }

    @When("the clicks on Disconnect button")
    public void when(){
        step.disconnectFromDb();
    }

    @Then("the status change to Disconnected")
    public void then(){
        step.connectionStatusShouldBeDisconnected();
    }
}
