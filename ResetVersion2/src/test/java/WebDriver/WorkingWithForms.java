package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithForms {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\BDD\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Users/NEHASIN/Desktop/WorkingWithForms.html");
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
//		drpcity.selectByIndex(1);
		drpcity.selectByIndex(2);
//		drpcity.selectByIndex(3);
//		drpcity.selectByIndex(4);
		
		driver.findElement(By.xpath(".//*[@id='txtPhone']")).sendKeys("9897026057");
		driver.findElement(By.cssSelector("input[value='Reading']")).click();
		//user this if u wnt to select multiple option like two hobbies
//		List<WebElement> element=driver.findElements(By.name("chkHobbies"));
		driver.findElement(By.name("reset")).click();
	}

}
