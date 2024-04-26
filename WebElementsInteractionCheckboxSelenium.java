package com.week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsInteractionCheckboxSelenium {

	public static void main(String[] args) throws InterruptedException {

		// launch the web driver
		ChromeDriver driver = new ChromeDriver();

		// load the url using get() method
		driver.get("https://leafground.com/checkbox.xhtml");

		// maximize the browser window
		driver.manage().window().maximize();

		// Click on the "Basic Checkbox.”
		driver.findElement(By.id("j_idt87:j_idt89")).click();

		// Click on the "Notification Checkbox."
		driver.findElement(By.id("j_idt87:j_idt91")).click();

		// Verify if the checkbox is disabled

		boolean checkboxDisabled = driver.findElement(By.id("j_idt87:j_idt102_input")).isEnabled();

		if (checkboxDisabled == false) {
			System.out.println("Confirm if the checkbox is disabled = " + checkboxDisabled);
		} else {
			System.out.println("Confirm if the checkbox is enabled = " + checkboxDisabled);

		}

		// click on the "Toggle switch"

		WebElement element = driver.findElement(By.id("j_idt87:j_idt100"));
		System.out.println("text = " + element.getText());
		element.click();

		// java wait
		Thread.sleep(5000); // wait for 5 seconds

		// Close the browser window.
		driver.close();

	}

}
