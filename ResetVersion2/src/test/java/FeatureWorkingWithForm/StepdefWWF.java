package FeatureWorkingWithForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefWWF {
	WebDriver driver;
	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\BDD\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Users/NEHASIN/Desktop/WorkingWithForms.html"); 
	}

	@When("^Enter the Username,Password,Confirm Password,First Name,Last Name,Gender,Date of Birth,Email,Address,City,Phone And Hobbies$")
	public void enter_the_Username_Password_Confirm_Password_First_Name_Last_Name_Gender_Date_of_Birth_Email_Address_City_Phone_And_Hobbies() throws Throwable {
		driver.findElement(By.id("txtUserName")).sendKeys("Neha");
		driver.findElement(By.name("txtPwd")).sendKeys("igate");
		driver.findElement(By.className("Format")).sendKeys("igate");
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
		Thread.sleep(1000);
	}

	@Then("^Reset the credential$")
	public void reset_the_credential() throws Throwable {
		driver.findElement(By.name("reset")).click();
	}

}
