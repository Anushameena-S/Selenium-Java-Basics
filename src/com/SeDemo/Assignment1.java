package com.SeDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {
	
    public static void main(String[] args) throws Throwable {
	        // Initialize ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Step 1: Open Amazon
	        driver.get("https://www.amazon.in");

	        // Wait for page to load
	        Thread.sleep(5000);

	        // Step 2: Open a new tab using Robot (Ctrl + T)
	        Robot robot = new Robot();
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_T);
	        robot.keyRelease(KeyEvent.VK_T);
	        robot.keyRelease(KeyEvent.VK_CONTROL);

	        // Step 3: Switch to new tab (wait for it to open)
	        Thread.sleep(2000);
	        
	        // Step 4: Get window handles (Amazon tab and Facebook tab)
	        Set<String> windowHandles = driver.getWindowHandles();
	        Iterator<String> iterator = windowHandles.iterator();

	        // Get parent window handle (Amazon tab)
	        String parentWindow = iterator.next();
	        System.out.println("Parent Window (Amazon) Handle: " + parentWindow);

	        // Get the new window handle (Facebook tab)
	        String childWindow = iterator.next();
	        System.out.println("Child Window (Facebook) Handle: " + childWindow);

	        // Switch to Facebook tab (child window)
	        driver.switchTo().window(childWindow);
	        System.out.println("Facebook Title: " + driver.getTitle());

	        // Step 5: In the new tab, open Facebook
	        driver.get("https://www.facebook.com");

	        // Wait a bit to see the Facebook page
	        Thread.sleep(5000);

	        // Close the Facebook tab
	        driver.close();

	        // Switch back to the Amazon tab (parent window)
	        driver.switchTo().window(parentWindow);
	        System.out.println("Amazon Title: " + driver.getTitle());

	        // Wait before closing the Amazon tab
	        Thread.sleep(2000);

	        // Close the Amazon tab
	        driver.quit();
	    }
	}


