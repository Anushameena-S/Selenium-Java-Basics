package com.SeDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBaccountcreation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https:www.facebook.com");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement acc = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		acc.click();
		
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("name");
		WebElement d = driver.findElement(By.id("day"));
		Select s1 = new Select(d);
		s1.selectByValue("4");
		
		WebElement m = driver.findElement(By.id("month"));
		Select s2 = new Select(m);
		s2.selectByValue("5");
		
		WebElement y = driver.findElement(By.id("year"));
		Select s3 = new Select(y);
		s3.selectByValue("1999");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.name("reg_email__")).sendKeys("test@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("test@123	");
		
		driver.findElement(By.name("websubmit")).click();
		
	}

}
