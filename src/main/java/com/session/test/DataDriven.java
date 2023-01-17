package com.session.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DataDriven {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

	 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		
		ExcelHelper excel = new ExcelHelper("D:\\Automation scripts\\data.xlsx");
		
	
		int rowCount = excel.getTotalRows("login");
		System.out.println("Row count: " + rowCount);
		int columns = excel.getTotalColumns("login", 1);
		System.out.println("column count: " + columns);
		
		for(int i = 1; i <=rowCount; i++) {
			try {
				driver.get("https://automationteststore.com/");
				
					driver.findElement(Locators.loginLink).click();
					driver.navigate().back();
					
						driver.findElement(Locators.continueBtn).click();
		
		
		////////////////////////////////////sign up form////////////////////////////////////
		
				driver.findElement(Locators.firstName).sendKeys(excel.getStringData("login", i, 0));
				driver.findElement(Locators.lastName).sendKeys(excel.getStringData("login", i, 1));
				driver.findElement(Locators.email).sendKeys(excel.getStringData("login", i, 2));
				driver.findElement(Locators.telephone).sendKeys(excel.getStringData("login", i, 3));
				driver.findElement(Locators.fax).sendKeys(excel.getStringData("login", i, 4));
				driver.findElement(Locators.company).sendKeys(excel.getStringData("login", i, 5));
				driver.findElement(Locators.address1).sendKeys(excel.getStringData("login", i, 6));
				driver.findElement(Locators.city).sendKeys(excel.getStringData("login", i, 7));
				Select stateFill = new Select(driver.findElement(Locators.state));
				stateFill.selectByVisibleText(excel.getStringData("login", i, 8));
				Select countryFill = new Select(driver.findElement(Locators.country));
				countryFill.selectByVisibleText(excel.getStringData("login", i, 9));
			
				driver.findElement(Locators.loginName).sendKeys(excel.getStringData("login", i, 10));
				driver.findElement(Locators.password).sendKeys(excel.getStringData("login", i, 11));
				driver.findElement(Locators.confimPass).sendKeys(excel.getStringData("login", i, 12));
				
				
				
				
			} catch (Exception e) {
				excel.writeData("login", i, 13, "Fail");
				e.printStackTrace();
			}
		}

	}

}
