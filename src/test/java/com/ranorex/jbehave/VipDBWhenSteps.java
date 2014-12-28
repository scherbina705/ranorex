package com.ranorex.jbehave;


import com.ranorex.steps.VipDatabaseSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;

public class VipDBWhenSteps {
    @Steps
    VipDatabaseSteps step;

    @When("the user fill First Name with <firstName>")
    public void userFillFirstName(@Named("firstName") String firstName){
        step.fillFirstName(firstName);
    }

    @When("the user fill Last Name with <lastName>")
    public void userFillLasttName(@Named("lastName") String lastName){
        step.fillLastName(lastName);
    }

    @When("the user select category <category>")
    public void userSelectCategory(@Named("category") String category){
        step.selectCategory(category);
    }

    @When("the user select gender <gender>")
    public void userSelectGender(@Named("gender") String gender){
        step.selectGenderByValue(gender.toLowerCase());
    }

    @When("the user click on Add button")
    public void userClickOnAddButton(){
        step.clickOnAddButton();
    }

    @When("the user click on Connect button")
    public void UserClickOnConnectButton(){
        step.clickOnConnectButton();
    }

    @When("the user click on OK in modal window")
    public void UserClickOnOKInModalWindow(){
        step.clickOnOkInModalWindow();
    }

    @When("the user click on Save button")
    public void clickOnSaveButton(){
        step.clickOnSaveButton();
    }
}
