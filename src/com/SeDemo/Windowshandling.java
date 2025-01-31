package com.SeDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Windowshandling {
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=2930601737797899400&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9148351&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");

		Thread.sleep(15000);

		WebElement buy = driver.findElement(By.xpath("//a[text()='Sell']"));

		Actions a = new Actions(driver);
		a.contextClick(buy).build().perform();
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);

		WebElement bs = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		a.contextClick(bs).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);

		WebElement td = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		a.contextClick(td).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);

		String par = driver.getWindowHandle();
		System.out.println("Parent id of window:" + par);

		Set<String> child = driver.getWindowHandles();
		System.out.println("Child id:" + child);

		Iterator<String> i = child.iterator();

		while (i.hasNext()) {
			String w = i.next();
			if (!par.equals(w)) {
				String title = driver.switchTo().window(w).getTitle();
				System.out.println(title);
				Thread.sleep(2000);
				driver.close();
			}
		}

	}



}
