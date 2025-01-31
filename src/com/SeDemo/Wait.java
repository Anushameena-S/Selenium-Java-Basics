package com.SeDemo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://letcode.in/");
		WebElement log = driver.findElement(By.xpath("//a[text()='Log in']"));
		
		log.click();
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("udhayamurugan30@gmail.com");
		
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("U21@dhaya");
		
		WebElement lg = driver.findElement(By.xpath("//button[text()='LOGIN']"));
		lg.click();
		
		WebElement text = driver.findElement(By.xpath("//div[@role='alertdialog']"));
		System.out.println(text.getText());
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.invisibilityOf(text));
		
		
		WebElement signOut = driver.findElement(By.xpath("//a[text()='Sign out']"));
		signOut.click();
	}

}
