package com.ranorex.pages;

import javafx.util.Pair;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

@DefaultUrl("http://www.ranorex.com/web-testing-examples/vip/")
public class VipDatabasePage extends CommonPage{

    public WebElementFacade getLinkToHome(){
        return find(By.xpath("//a[@title='Home']"));
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

    public WebElementFacade getModalWindowTextLabel(){
        return find(By.xpath("*//center/div[@id='alertTextOK']"));
    }

	//Buttons

	public WebElementFacade getGenderRadioButton(String gender){
		return find(By.xpath("//input[@id='Gender' and @value='"+gender.toLowerCase()+"']"));
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

    public WebElementFacade getModalWindowOkButton(){
        return find(By.xpath("//button[contains(text(), 'OK')]"));
    }

    public WebElementFacade getDisconnectConnectButton(){
        return find(By.id("connect"));
    }

    //Table

	public List<WebElementFacade> getTableWebElements(){
		return findAll(By.xpath("//tr[@id='heading']/following-sibling::tr"));
	}

    public List<WebElementFacade> getLastRowWebelements(){
        return findAll(By.xpath("//tr[@id='heading']/following-sibling::tr[last()]/td/following-sibling::td"));
    }

    public WebElementFacade getLastRowRadioButton(){
        return find(By.xpath("//tr[@id='heading']/following-sibling::tr[last()]/td/input"));
    }

    public List<String> getRowValues(List<WebElementFacade> RowWebElements){
        List<String> rowValues = new ArrayList<String>();
        for (WebElementFacade element: RowWebElements){
            rowValues.add(element.getText());
        }
        return rowValues;
    }

	public Pair<Integer, Integer> getTableIndexByCellText(String textToFind){
		//Gets row count
		String xpathToTr = "//*[@id='VIPs']/tbody/tr";
		int rowCount = findAll(By.xpath(xpathToTr)).size(); //

		for(Integer row=1;row<=rowCount;row++){
			//Gets all columns inside every row
			Pair<Integer,Integer> elementIndex = searchForValueInColumns(row,textToFind);
			if(elementIndex!=null){
				return elementIndex;
			}
		}
		return null;
	}

	private Pair<Integer, Integer> searchForValueInColumns(Integer row, String textToFind){
		String xpathToTd = "//*[@id='VIPs']/tbody/tr[@id='heading']/td";
		Pair<Integer, Integer> elementIndex;
		//Gets columns count
		int columnCount=findAll(By.xpath(xpathToTd)).size();
		for(Integer column=1; column <=columnCount; column++){

			//fetches the cell value based on row & column
			String xpathToElementByTrAndTd = "//*[@id='VIPs']/tbody/tr[" +row+ "]/td["+column+"]";
			String cellValue = find(By.xpath(xpathToElementByTrAndTd)).getText();

			if(textToFind.equals(cellValue)){
				elementIndex = new Pair<Integer, Integer>(row,column);
				return elementIndex;
			}
		}
		return null;
	}

}
