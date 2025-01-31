package com.SeDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo {

public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://letcode.in/alert");
	driver.manage().window().maximize();
	
	Thread.sleep(7000);
	WebElement acc = driver.findElement(By.id("accept"));
	acc.click();
	Thread.sleep(5000);
	driver.switchTo().alert().accept();
	System.out.println("Simple alert is closed....");
	
	Thread.sleep(7000);
	WebElement cnf = driver.findElement(By.id("confirm"));
	cnf.click();
	Thread.sleep(5000);
	driver.switchTo().alert().dismiss();
	
	Thread.sleep(7000);
	WebElement prm = driver.findElement(By.id("prompt"));
	prm.click();
	Thread.sleep(5000);
	driver.switchTo().alert().sendKeys("Sample");
	Thread.sleep(5000);
	driver.switchTo().alert().accept();
	
	Thread.sleep(3000);
	WebElement mod = driver.findElement(By.id("modern"));
	mod.click();
	String text = driver.switchTo().alert().getText();

	System.out.println(text);

}
}