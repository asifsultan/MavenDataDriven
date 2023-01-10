package com.session.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DataDriven {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	 
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationteststore.com/");
		driver.manage().window().maximize();
		ExcelHelper excel = new ExcelHelper("D:\\Automation scripts\\data.xlsx");
		
	
		int rowCount = excel.getTotalRows("login");
		System.out.println("Row count: " + rowCount);
		
		driver.findElement(Locators.loginLink).click();
		driver.findElement(Locators.continueBtn).click();
		
		
		////////////////////////////////////sign up form////////////////////////////////////
		driver.findElement(Locators.firstName).sendKeys(excel.getStringData("login", 1, 0));
		
		
//		for(int i = 1; i <=rowCount; i++) {
//			try {
//				System.out.println(excel.getStringData("login", i, 0));
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

	}

}
