package com.cg.hotel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelBookingAlert {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","D:\\BDD\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Users/NEHASIN/Desktop/hotelbooking.html");
		
		driver.findElement(By.id("txtFirstName")).sendKeys("Neha");
		//driver.findElement(By.id("btnPayment")).click();
		//callAlert();
		
		driver.findElement(By.id("txtLastName")).sendKeys("Singh");
		//driver.findElement(By.id("btnPayment")).click();
		//callAlert();
		
		driver.findElement(By.id("txtEmail")).sendKeys("neha@gmail.com");
		//driver.findElement(By.id("btnPayment")).click();
		//callAlert();
		
		driver.findElement(By.id("txtPhone")).sendKeys("9897026057");
		//driver.findElement(By.id("btnPayment")).click();
		//callAlert();
		//for applying patter matcher we ahve to use cssSelector and code like this
		
		driver.findElement(By.cssSelector("input[pattern='[789][0-9]{9}']")).sendKeys("7894");
		
		driver.findElement(By.xpath("html/body/div/div/form/table/tbody/tr[6]/td[2]/textarea")).sendKeys("Pune");
		
		Select drpCity=new Select(driver.findElement(By.name("city")));
		drpCity.selectByVisibleText("Select City");
		driver.findElement(By.id("btnPayment")).click();
		callAlert();
		
		//for taking city drpCity.selectByVisibleText("Pune")
		
		Select drpCity1=new Select(driver.findElement(By.name("state")));
		drpCity1.selectByVisibleText("Maharashtra");
		//driver.findElement(By.id("btnPayment")).click();
		//callAlert();
		
		Select drpCity2=new Select(driver.findElement(By.name("persons")));
		drpCity2.selectByVisibleText("3");
		//driver.findElement(By.id("btnPayment")).click();
		

		driver.findElement(By.id("txtCardholderName")).sendKeys("Neha");
		//driver.findElement(By.id("btnPayment")).click();
		//callAlert();
		
		driver.findElement(By.id("txtDebit")).sendKeys("xxxx-xxxxx-xxxx");
		//driver.findElement(By.id("btnPayment")).click();
		//callAlert();
		
		driver.findElement(By.id("txtCvv")).sendKeys("204");
		//driver.findElement(By.id("btnPayment")).click();
		//callAlert();
		
		driver.findElement(By.id("txtMonth")).sendKeys("08");
		//driver.findElement(By.id("btnPayment")).click();
		//callAlert();
		
		driver.findElement(By.id("txtYear")).sendKeys("2020");
		//driver.findElement(By.id("btnPayment")).click();
		//callAlert();

	}
	
	public static void callAlert() throws InterruptedException
	{
		Alert alert=driver.switchTo().alert();
		System.out.println("The message is: "+alert.getText());
		Thread.sleep(500);
		alert.accept();
		Thread.sleep(500);
	}
}
