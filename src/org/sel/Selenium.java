package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	
	public static <WebDriver> void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium Inmakes\\Driver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		element.sendKeys("avengersmarvel20@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		pass.sendKeys("Venkat@3850");
		
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		
		
		
		
	
	}

}
