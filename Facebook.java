package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://en-gb.facebook.com/");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("mano");
		driver.findElement(By.name("lastname")).sendKeys("Eganathan");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9629214234");
		driver.findElement(By.id("password_step_input")).sendKeys("mano@123");
		WebElement ele1 = driver.findElement(By.id("day"));
		Select drop = new Select(ele1);
		drop.selectByValue("11");
		WebElement ele2 = driver.findElement(By.id("month"));
		Select drop2 = new Select(ele2);
		drop2.selectByVisibleText("Oct");
		WebElement ele3 = driver.findElement(By.id("year"));
		Select drop3 = new Select(ele3);
		drop3.selectByVisibleText("1993");
		driver.findElement(By.xpath("//label[@class='_58mt']")).click();
		driver.findElement(By.name("websubmit")).click();
	

}
}