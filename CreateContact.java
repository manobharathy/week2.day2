package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Manobharathy");
		driver.findElement(By.id("lastNameField")).sendKeys("Eganathan");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Technical");
		driver.findElement(By.id("createContactForm_description")).sendKeys("For learning selenium");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("bharathy1011@gmail.com");
		WebElement ele = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
		Select drop = new Select(ele);
		drop.selectByVisibleText("Botswana ");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("for testing selenium");
		driver.findElement(By.xpath("//input[@name ='submitButton']")).click();
		String title = driver.getTitle();
		System.out.println("page title = "+ title);
		
	
		
	 
		
	}
	

}
