package com.week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccountAssignmentSelenium {

	public static void main(String[] args) throws InterruptedException {
		// launch the web driver
		ChromeDriver driver = new ChromeDriver();
		// load the url using get() method
		driver.get("http://leaftaps.com/opentaps/");
		// maximize the browser window
		driver.manage().window().maximize();
		
		// Enter an user name and password
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//Click the "Login" button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the "CRM/SFA" link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// java wait
		Thread.sleep(5000); // wait for 5 seconds

		//Click on the "Accounts" tab
		driver.findElement(By.linkText("Accounts")).click();
		
		//Click on the "Create Account" button
		driver.findElement(By.linkText("Create Account")).click();
		
		//Enter an account name.
		driver.findElement(By.id("accountName")).sendKeys("TestAccount");
		
		//Enter a description as "Selenium Automation Tester."
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		//Enter a Site Name as “LeafTaps”
		driver.findElement(By.id("officeSiteName")).sendKeys("TestLeaf automation");
		
		//Enter a Numberof employees
		driver.findElement(By.id("numberEmployees")).sendKeys("80");
		
		// java wait
		Thread.sleep(5000); // wait for 5 seconds
		
		//Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();
			
		//Verify that the Title is displayed correctly.		
		String title = driver.getTitle();
		System.out.println("title value = "+title);

		if (title.contains("Account Details | opentaps CRM")) {
			System.out.println("Account creation is successful ");
		} else {
			System.out.println("Account creation is not successful");
		}
		
		// java wait
		Thread.sleep(5000); // wait for 5 seconds
				
		//Close the browser window.
		driver.close();
	}

}
