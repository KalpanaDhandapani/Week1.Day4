package com.week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsInteractionButtonSelenium {

	public static void main(String[] args) throws InterruptedException {

		// launch the web driver
		ChromeDriver driver = new ChromeDriver();

		// load the url using get() method
		driver.get("https://leafground.com/button.xhtml");

		// maximize the browser window
		driver.manage().window().maximize();

		// Click on the button with the text ‘Click and Confirm title.’
		driver.findElement(By.id("j_idt88:j_idt90")).click();

		// Verify that the title of the page is ‘dashboard.’
		String title = driver.getTitle();
		System.out.println("title value = " + title);

		if (title.contains("Dashboard")) {
			System.out.println("Click and Confirm title is successful ");
		} else {
			System.out.println("Click and Confirm title is not successful");
		}

		// Check if the button with the text ‘Confirm if the button is disabled’ is
		// disabled.

		boolean buttonDisabled = driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
		if (buttonDisabled == true) {
			System.out.println("Confirm if the button is disabled = " + buttonDisabled);
		} else {
			System.out.println("Confirm if the button is not enabled = " + buttonDisabled);

		}

		// Find and print the position of the button with the text ‘Submit.’
		WebElement submitButton = driver.findElement(By.id("j_idt88:j_idt94"));
		Point submitButtonXY = submitButton.getLocation();

		int xValue = submitButtonXY.x;
		int yValue = submitButtonXY.y;

		System.out.println("Submit button x position = " + xValue);
		System.out.println("Submit button y position = " + yValue);

		// Find and print the background color of the button with the text ‘Find the
		// Save button color.’
		String buttonColor = driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("color");
		System.out.println("Save button color = " + buttonColor);

		// Find and print the height and width of the button with the text ‘Find the
		// height and width of this button.’
		WebElement submitButton1 = driver.findElement(By.id("j_idt88:j_idt98"));
		Dimension buttonSize = submitButton1.getSize();
		int buttonHeight = buttonSize.getHeight();
		int buttonWidth = buttonSize.getWidth();
		System.out.println("height of the Submit button = " + buttonHeight);
		System.out.println("width of the Submit button = " + buttonWidth);

		// java wait
		Thread.sleep(5000); // wait for 5 seconds

		// Close the browser window.
		driver.close();
	}
}