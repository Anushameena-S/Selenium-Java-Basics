package com.SeDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookdemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https:www.facebook.com");
		
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("u@gmail.com");;
		driver.findElement(By.name("pass")).sendKeys("1@33234");
		
		Thread.sleep(3000);
		WebElement log = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
		log.click();
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		String t = driver.getTitle();
		System.out.println("Title of the webPage:"+t);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Url:"+currentUrl);	
		
		driver.navigate().to("https:www.amazon.com");
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().forward();
		
		Thread.sleep(3000);
		driver.manage().window().minimize();
		
		Thread.sleep(3000);
		driver.close();
		
		
		
		
	}

}
