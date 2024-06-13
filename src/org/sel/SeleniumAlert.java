package org.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAlert {

	public static <TakesScreenShot> void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Selenium Inmakes\\Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");

		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File scrn = ts.getScreenshotAs(OutputType.FILE);
		
		File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium Inmakes\\screenshot\\adactin.png");
		
		FileUtils.copyFile(scrn, f);
		


	}

}
