package com.SeDemo;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicxpath {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// following sibling
		WebElement rudra = driver.findElement(By.xpath("(//span[text()='Rs 499'])[2]//following-sibling::span"));
		System.out.println("Offer prize of rudra is:" + rudra.getText());

		// preceding sibling
		WebElement org = driver.findElement(By.xpath("(//span[text()='Rs 144'])//preceding-sibling::span"));
		System.out.println("Actual prize of rudra:" + org.getText());

		List<WebElement> rud = driver.findElements(By.xpath(
				"(//div[text()=\"Shiv Trishul Damru Gold-plated Locket with Rudraksha Mala\"])[1]//following-sibling::div"));

		for (WebElement w : rud) {
			System.out.println("Rudra details:" + w.getText());
		}


}
}