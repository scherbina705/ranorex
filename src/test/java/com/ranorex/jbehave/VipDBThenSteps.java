package com.ranorex.jbehave;

import com.ranorex.steps.VipDatabaseSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;

public class VipDBThenSteps {
    @Steps
    VipDatabaseSteps step;

    @Then("new row added to the end of the table with values <firstName>, <lastName>, <gender>, <category>")
    public void firstRowAddedWithValues(@Named("firstName") String firstName, @Named("lastName") String lastName, @Named("gender") String gender, @Named("category") String category){
        step.newRowShouldContainValues(firstName,lastName,category,gender);
    }

    @Then("appear modal window with text: $text")
    public void checkTextInModalWindow(String text){
        step.textInModalWindowShouldContain(text);
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

    @Then("$rowsNumber rows appear in the table")
    public void rowsAppearInTable(int rowsNumber){
        step.rowsInTheTableShouldEquals(rowsNumber);
    }
}
