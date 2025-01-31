package com.SeDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdemo {
	


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new  ChromeDriver();
		driver.get("https://letcode.in/dropable");		
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		
		Thread.sleep(3000);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		//a.dragAndDrop(drag, drop).build().perform();
		a.clickAndHold(drag).moveToElement(drop).build().perform();

		
		

	}



}
