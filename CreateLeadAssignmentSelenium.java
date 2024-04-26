package com.week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadAssignmentSelenium {

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

		// Click the "Login" button
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on the "CRM/SFA" link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// java wait
		Thread.sleep(5000); // wait for 5 seconds
		
		// Click on the "Leads" tab.
		driver.findElement(By.linkText("Leads")).click();
		
		// Click on the "Create Lead" button.
		driver.findElement(By.linkText("Create Lead")).click();
		
		// Enter a CompanyName.
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		
		// Enter a FirstName.
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kalpana");
		
		// Enter a LastName.
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prabhu");
		
		// Enter a Title.
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test Lead");
		
		// java wait
		Thread.sleep(5000); // wait for 5 seconds
				
		// Click the "Create Lead" button.
		driver.findElement(By.className("smallSubmit")).click();
		
		// Verify that the Title is displayed correctly.
		String title = driver.getTitle();
		System.out.println("title value = " + title);

		if (title.contains("View Lead | opentaps CRM")) {
			System.out.println("Lead creation is successful ");
		} else {
			System.out.println("Lead creation is not successful");
		}
		 
		// java wait
		Thread.sleep(5000); // wait for 5 seconds

		// Close the browser window.
		driver.close();

	}

}
