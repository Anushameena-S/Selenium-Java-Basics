package com.SeDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {
 public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		
		Actions a=new Actions(driver);
		
		WebElement dc = driver.findElement(By.id("doubleClickBtn"));
		Thread.sleep(3000);
		
		a.doubleClick(dc).build().perform();	
		
		String text = driver.findElement(By.id("doubleClickMessage")).getText();
	    System.out.println(text);

}
}

