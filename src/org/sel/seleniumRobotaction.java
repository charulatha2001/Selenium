package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class seleniumRobotaction {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Selenium Inmakes\\Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://affiliate.flipkart.com/login");

		driver.manage().window().maximize();

		Actions a = new Actions(driver);

		Robot r = new Robot();

		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("Brindha078");

		a.doubleClick(email).perform();

		Thread.sleep(3000);


		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}

}
