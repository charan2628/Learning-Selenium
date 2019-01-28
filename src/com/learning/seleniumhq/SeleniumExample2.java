package com.learning.seleniumhq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumExample2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\PROGRAMMING\\Selenium\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("iphone");
		element.submit();
		element = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div#main div.mnr-c.pla-unit:first-child div.pla-unit-container")));
		element.findElement(By.partialLinkText("Apple iPhone 6")).click();;
		Thread.sleep(10000);
		driver.quit();
	}
}
