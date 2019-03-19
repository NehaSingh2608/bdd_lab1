package FeatureResetDataTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefTwo {
	WebDriver driver;
	@Given("^Open the firefox and lunch the application$")
	public void open_the_firefox_and_lunch_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\BDD\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Users/NEHASIN/Desktop/WorkingWithForms.html"); 
	}

	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password(DataTable arg1) throws Throwable {
	    int i;
		List<List<String>> data=arg1.raw();
	    for(i=0;i<data.size();i++) {
	    	driver.findElement(By.name("txtUName")).clear();
	    	driver.findElement(By.name("txtPwd")).clear();
	    	driver.findElement(By.name("txtUName")).sendKeys(data.get(i).get(0));
	    	Thread.sleep(1000);
	    	driver.findElement(By.name("txtPwd")).sendKeys(data.get(i).get(1));
	}
	}

	@Then("^Reset the credential$")
	public void reset_the_credential() throws Throwable {
		driver.findElement(By.name("reset")).click();
	}


}
