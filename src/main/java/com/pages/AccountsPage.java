package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {

	
	
	private WebDriver driver;
	private By accountSelections=By.cssSelector("div#center_column span");
	private By getMyAccount=By.xpath("//span[contains(text(),'My account')]");
	
	public AccountsPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public String getAccountsPageTitle() {
		
		return driver.getTitle();
	}
	
	public boolean getMyAccount() {
		
		return driver.findElement(getMyAccount).isDisplayed();
	}
	public int getAccountsSelectionCount() {
		return driver.findElements(accountSelections).size();

	}
	
	public List<String> getAccountsSectionsList() {
		List<String> accountsList=new ArrayList<String>();
		
		List<WebElement> accountsSectionList=driver.findElements(accountSelections);
		for(WebElement e: accountsSectionList) {
			String text=e.getText();
			System.out.println(text);
			accountsList.add(text);
		}
		return accountsList;
	}
	
}
