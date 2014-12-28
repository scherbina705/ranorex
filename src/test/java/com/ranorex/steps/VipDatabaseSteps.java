package com.ranorex.steps;


import com.ranorex.pages.VipDatabasePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.WebElementFacade;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static com.thoughtworks.selenium.SeleneseTestBase.assertFalse;
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
        page.switchToModalWindow();
        page.getModalWindowOkButton().click();
        page.switchBackToMainWindow();
    }

    @Step
    public void openPage(){
        page.open();
    }

	@Step
	public void loadButtonShouldBeDisabled(){
		assertFalse(page.getLoadButton().isEnabled());
	}

	@Step
	public void saveButtonShouldBeDisabled(){
		assertFalse(page.getSaveButton().isEnabled());
	}
///////

	@Step
	public void fillFirstName(String firstName){
		page.getFirstNameField().type(firstName);
	}

	@Step
	public void fillLastName(String lastName){
		page.getLastNameField().type(lastName);
	}

	@Step
	public void selectCategory(String category){
		page.getCategory().selectByValue(category);
	}

	@Step
	public void selectGenderByValue(String gender){
		page.getGenderRadioButton(gender).click();
	}

    @Step
    public void fillAnyValuesForVIP(){
        fillFirstName("ANY_VALUE");
        fillLastName("ANY_VALUE");
    }

	@Step
	public void clickOnAddButton(){
		page.getAddButton().click();
	}

    @Step
    public void clickOnLoadButton(){
        page.getLoadButton().click();
    }

    @Step
    public void clickOnSaveButton(){
        page.getSaveButton().click();
    }

	@Step
	public void tableShouldBeEmpty(){
		assertTrue(page.getTableWebElements().size()==0);
	}

    @Step
    public void newRowShouldContainValues(String firstName, String lastName, String gender, String category){
        List<String> rowValues = page.getRowValues(page.getLastRowWebelements());
        assertTrue(rowValues.contains(firstName));
        assertTrue(rowValues.contains(lastName));
        assertTrue(rowValues.contains(gender));
        assertTrue(rowValues.contains(category));
    }

    @Step
    public void rowsInTheTableShouldEquals(int rowsNumber){
        assertTrue(rowsNumber == page.getTableWebElements().size());
    }

    @Step
	public void vipCountValueShouldEquals(String number){
		String labelText = page.getVIPCountLabel().getText();
		//needed number is located in the end of the of the label text: "VIP count: 2"
		String lastLabelCharacter = labelText.substring(labelText.lastIndexOf(" ")+1);
		assertTrue(number.equals(lastLabelCharacter));
	}

	@Step
	public void textInModalWindowShouldContain(String text){
		page.switchToModalWindow();
		String modalWindowText = page.getModalWindowTextLabel().getText();
        page.closeCurrentSelectedWindow();
		page.switchBackToMainWindow();
        assertTrue(modalWindowText.contains(text));
	}
}
