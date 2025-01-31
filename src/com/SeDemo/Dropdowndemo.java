package com.SeDemo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowndemo {

	static WebDriver driver;
	public static void sdrop() throws InterruptedException {
		WebElement options = driver.findElement(By.id("oldSelectMenu"));
		Select s = new Select(options);

		// Select s1=new Select(driver.findElement(By.id("oldSelectMenu")));
		s.selectByIndex(5);

		Thread.sleep(2000);
		s.selectByValue("7");

		Thread.sleep(3000);
		s.selectByVisibleText("Green");

		WebElement fso = s.getFirstSelectedOption();
		String text = fso.getText();
		System.out.println(text);

		List<WebElement> options2 = s.getOptions();
		System.out.println(options2);

		for (WebElement w : options2) {
			System.out.println(w.getText());
		}
	}
	public static void mdrop() {
		WebElement car = driver.findElement(By.id("cars"));
		Select s1=new Select(car);
		List<WebElement> opt = s1.getOptions();
		for(WebElement w:opt) {
		System.out.println(w.getText());	
		}
		
		s1.selectByIndex(1);
		s1.selectByIndex(3);
		s1.selectByIndex(2);
		
		List<WebElement> aso = s1.getAllSelectedOptions();
		for(WebElement w1:aso) {
			System.out.println("Selected options\n"+w1.getText());
		}
		
		s1.deselectByIndex(3);
		}
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		System.out.println("-----Single dropdown-------");
		sdrop();
		
		System.out.println("-----Multiple dropdown-------");
		mdrop();
	}

}


