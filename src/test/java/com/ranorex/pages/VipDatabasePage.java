package com.ranorex.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.WebElementFacade;
import net.thucydides.core.pages.components.Dropdown;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

@DefaultUrl("http://www.ranorex.com/web-testing-examples/vip/")
public class VipDatabasePage extends CommonPage{

    public WebElementFacade getDisconnectConnectButton(){
        return find(By.id("connect"));
    }

    public WebElementFacade getConnectionLabel(){
        return find(By.id("connection"));
    }

	public WebElementFacade getVIPCountLabel(){
		return find(By.id("count"));
	}

	public WebElementFacade getFirstNameField(){
		return find(By.id("FirstName"));
	}

	public WebElementFacade getLastNameField(){
		return find(By.id("LastName"));
	}

	public Select getCategory(){
		return new Select(getDriver().findElement(By.id("Category")));
	}

	//Buttons
	public WebElementFacade getFemaleRadioButton(){
		return find(By.xpath("//input[@id='Gender' and @value='female']"));
	}

	public WebElementFacade getMaleRadioButton(){
		return find(By.xpath("//input[@id='Gender' and @value='male']"));
	}

	public WebElementFacade getGenderRadioButton(String gender){
		return find(By.xpath("//input[@id='Gender' and @value='"+gender+"']"));
	}

	public WebElementFacade getAddButton(){
		return find(By.id("Add"));
	}

	public WebElementFacade getDeleteButton(){
		return find(By.id("Delete"));
	}

	public WebElementFacade getLoadButton(){
		return find(By.id("Load"));
	}

	public WebElementFacade getSaveButton(){
		return find(By.id("Save"));
	}

	public WebElementFacade getClearButton(){
		return find(By.id("Clear"));
	}

	public List<WebElementFacade> getTableWebElements(){
		return findAll(By.xpath("//tr[@id='heading']/following-sibling::tr"));
	}

	public List<WebElementFacade> getFirstRowWebElements(){
		return findAll(By.xpath("//tr[@id='heading']/following-sibling::tr[1]/td/following-sibling::td"));
	}

	//
	public WebElementFacade getModalWindowTextLabel(){
		return find(By.xpath("*//center/div[@id='alertTextOK']"));
	}

	public WebElementFacade getModalWindowOkButton(){
		return find(By.xpath("//button[contains(text(), 'OK')]"));
	}
}
