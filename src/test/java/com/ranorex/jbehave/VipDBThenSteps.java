package com.ranorex.jbehave;

import com.ranorex.steps.VipDatabaseThucydidesSteps;
import javafx.util.Pair;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;

public class VipDBThenSteps {
    @Steps
    VipDatabaseThucydidesSteps step;

    @Then("new row added to the end of the table with values <firstName>, <lastName>, <gender>, <category>")
    public void firstRowAddedWithValues(@Named("firstName") String firstName, @Named("lastName") String lastName, @Named("gender") String gender, @Named("category") String category){
        step.newRowShouldContainValues(firstName, lastName, category, gender);
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

    @Then("rows appear in the table")
    public void rowsAppearInTable(){
        step.tableShouldNotBeEmpty();
    }

    @Then("table is cleared")
    public void tableCleared(){
        step.rowsInTheTableShouldEquals(0);
    }

    @Then("VIP with <firstName>, <lastName>, <gender>, <category> is removed from the table")
    public void checkIfRowRemoved (@Named("firstName") String firstName, @Named("lastName") String lastName, @Named("gender") String gender, @Named("category") String category){
        step.lastRowShouldBeDeleted(firstName, lastName, gender, category);
    }

    @Then("vip count number should equal table rows number")
    public void checkVipCounter(){
        step.vipCounterShouldEqualRowsCounter();
    }

    @Then("the user is redirected to Home page")
    public void redirectionToHomePage(){
        step.shouldBeRedirectedToHomePage();
    }

    @Then("last name $text is in the $rowNumber row and in the $columnNumber column")
    public void checkPosition(String text, int rowNumber, int columnNumber){
        step.checkPositionByText(text, rowNumber, columnNumber);
    }

}
