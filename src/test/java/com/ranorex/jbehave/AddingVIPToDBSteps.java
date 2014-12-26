package com.ranorex.jbehave;

import com.ranorex.steps.VipDatabaseSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class AddingVIPToDBSteps {

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

	@Then("first row added to the table with values <firstName>, <lastName>, <gender>, <category>")
	public void rowAddedWithValues(@Named("firstName") String firstName, @Named("lastName") String lastName, @Named("gender") String gender, @Named("category") String category){
		step.firstRowShouldContainValues(firstName,lastName,category,gender);
	}

	@Then("vip count value equals $number")
	public void vipCountValue(String number){
		step.vipCountValueShouldEquals(number);
	}

	@Then("appear modal window with text $text")
	public void checkTextInModalWindow(String text){
		step.textInModalWindowShouldBe(text);
	}
}