package com.SeDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;  // Import the correct Dimension class from Selenium
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.leafground.com/frame.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
		
		d.switchTo().frame(0);
		
		WebElement cli = d.findElement(By.id("Click"));
		cli.click();
		Thread.sleep(3000);
		d.switchTo().defaultContent();
		Thread.sleep(3000);
		
		WebElement parent = d.findElement(By.xpath("//iframe[@src='page.xhtml']"));
		Dimension size = parent.getSize();
		
		System.out.println(size);	
		d.switchTo().frame(parent);
	
		WebElement child = d.findElement(By.xpath("//iframe[@src='framebutton.xhtml']"));
	    Dimension size2 = child.getSize();
	    System.out.println(size2);
		d.switchTo().frame(child);	
		
		Thread.sleep(3000);
		WebElement f3 = d.findElement(By.id("Click"));
		f3.click();
		Thread.sleep(3000);
		
		
		d.switchTo().defaultContent();	
		
	    List<WebElement> fr = d.findElements(By.tagName("iframe"));
		int size3 = fr.size();
		System.out.println(size3);

	}

}
