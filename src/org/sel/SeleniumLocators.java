package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumLocators {
	public static <Chrome> void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Selenium Inmakes\\Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		Actions a = new Actions(driver);

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("charulatha988");

		a.doubleClick(email).perform();
		a.contextClick(email).perform();

		Robot r = new Robot();

		for (int i = 0; i < 3; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		

		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));

		a.contextClick(pass).perform();

		for (int j = 0; j < 4; j++) {

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}
