package com.SeDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/table");
		
		WebElement tab = driver.findElement(By.xpath("//table[@id='shopping']"));
		System.out.println(tab.getText());
		
		
		WebElement tab2 = driver.findElement(By.xpath("//table[@id='shopping']//tr[2]//td[1]"));
		System.out.println("2nd row element:"+tab2.getText());
		
		WebElement check1 = driver.findElement(By.id("first"));
		System.out.println(check1.isEnabled());
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500);");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		boolean sel1 = check1.isSelected();
		System.out.println(sel1);
		
		check1.click();
		
		boolean sel = check1.isSelected();
		System.out.println(sel);
		
		
		List<WebElement> email = driver.findElements(By.xpath("//table[@id='simpletable']//tr//td[3]"));
		for(WebElement w:email) {
			
			System.out.println(w.getText());
			
		}
	
		
	}



}
