package FeatureReset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {
	WebDriver driver;
	
	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	
		System.setProperty("webdriver.chrome.driver","D:\\BDD\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Users/NEHASIN/Desktop/WorkingWithForms.html");
	    //throw new PendingException();
	}

	@When("^Enter the Username And Password$")
	public void enter_the_Username_And_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUserName")).sendKeys("Neha");
		driver.findElement(By.name("txtPwd")).sendKeys("igate");
		/*driver.findElement(By.className("Format")).sendKeys("igate");
		driver.findElement(By.id("txtFirstName")).sendKeys("Neha");
		driver.findElement(By.id("txtLastName")).sendKeys("Singh");
		driver.findElement(By.id("rbMale")).click();
		driver.findElement(By.id("rbFemale")).click();
		driver.findElement(By.id("DOB")).sendKeys("08/26/1999");
		driver.findElement(By.id("txtEmail")).sendKeys("neha@gmail.com");
		driver.findElement(By.id("txtAddress")).sendKeys("Basti");
		Select drpcity=new Select(driver.findElement(By.name("City")));
		drpcity.selectByIndex(2);		
		driver.findElement(By.xpath(".//*[@id='txtPhone']")).sendKeys("9897026057");
		driver.findElement(By.cssSelector("input[value='Reading']")).click();
		*/
		Thread.sleep(1000);
	   // throw new PendingException();
	}

	@Then("^Reset the credential$")
	public void reset_the_credential() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("reset")).click();
	    //throw new PendingException();
	}

}
