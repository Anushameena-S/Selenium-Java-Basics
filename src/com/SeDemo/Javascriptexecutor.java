package com.SeDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Javascriptexecutor {
	
	public static void signUp() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
		driver.findElement(By.name("username")).sendKeys("Udhaya9999");
		driver.findElement(By.name("password")).sendKeys("U21@murugan");
		driver.findElement(By.name("re_password")).sendKeys("U21@murugan");
		driver.findElement(By.name("full_name")).sendKeys("Udhaya Murugan");
		driver.findElement(By.name("email_add")).sendKeys("udhaya.gan30@gmail.com");
		Thread.sleep(15000);

		driver.findElement(By.name("tnc_box")).click();
		driver.findElement(By.name("Submit")).click();

	}

	public static void logIn() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.name("username")).sendKeys("Udhaya9999");
		driver.findElement(By.name("password")).sendKeys("U21@murugan");
		driver.findElement(By.name("login")).click();

		// driver.findElement(By.name("datepick_in")).sendKeys("26/12/2024");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.getElementById('datepick_in').value='26/12/2024';");

		js.executeScript("alert('Check in date is changed');");

		// Alert a=(Alert)driver;
		driver.switchTo().alert().accept();

		driver.get("https://www.snapdeal.com/");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,2000)");

		js.executeScript("window.scrollBy(0,-500)");

		js.executeScript("history.go(0)");

	}

	public static void main(String[] args) throws InterruptedException {
		// signUp();

		logIn();

	}


}
