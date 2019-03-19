package com.cg.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUps {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\BDD\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Users/NEHASIN/Desktop/AlertBoxDemos.html");
		Thread.sleep(5000);
		
		driver.findElement(By.id("alert")).click();
		Thread.sleep(5000);
		
		Alert alert=driver.switchTo().alert();
		System.out.println("The alert message is: "+alert.getText());
		alert.accept();
		Thread.sleep(5000);
		
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(5000);
		
		Alert confirm=driver.switchTo().alert();
		confirm.accept();
		Thread.sleep(5000);
		
		
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(5000);
	    confirm=driver.switchTo().alert();
		
		confirm.dismiss();
		Thread.sleep(5000);
		
		driver.findElement(By.id("propmt")).click();
		Thread.sleep(5000);
		
		Alert propmt=driver.switchTo().alert();
		System.out.println("The prompt message is: "+alert.getText());
		String text = propmt.getText();
		
		System.out.println(text);
		propmt.sendKeys("Neha");
		
		Thread.sleep(5000);
		propmt.accept();
		Thread.sleep(5000);
		driver.findElement(By.id("propmt")).click();
		Thread.sleep(5000);
		
		propmt=driver.switchTo().alert();
		propmt.dismiss();
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
