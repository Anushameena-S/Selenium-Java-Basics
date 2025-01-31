package com.SeDemo;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Screenshotdemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();//upcasting
		//Class obj=new ClassName();
		
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("u@gmail.com");;
		driver.findElement(By.name("pass")).sendKeys("1@33234");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		TakesScreenshot ref=(TakesScreenshot) driver;
		File src=ref.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\Anusha\\eclipse-workspace\\SeleniumDemoProject\\Screenshot//img.png");
		FileUtils.copyFile(src,des);
		System.out.println("Screenshot saved successfully!");

}
}
