package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		//System.setProperty("webdriver.gecko.driver", "geckodriver");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		WebElement CreateNewButton = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		CreateNewButton.click();

		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement LastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement MobileNumber = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']"));
		WebElement NewPassword = driver.findElement(By.xpath("//input[@id='password_step_input']"));

		
		FirstName.sendKeys("abcxya");
		LastName.sendKeys("ooewif");
		MobileNumber.sendKeys("9741924787");
		NewPassword.sendKeys("Welcome1");
		
		String Gender = "Male";
		
		WebElement Gen = driver.findElement(By.xpath("//label[text()='" +Gender+"']/following-sibling::input"));
		
		Gen.click();
		
		List<WebElement> Months = driver.findElements(By.xpath("//select[@title='Month']/option"));
		
		for(WebElement ele: Months) {
			System.out.println(ele.getText());
		}
		
		//to print current month
		
		WebElement CurrentMonth = driver.findElement(By.xpath("//select[@title='Month']/option[@selected='1']"));
		System.out.println(CurrentMonth.getText());
		
		WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
		Select ddDay=new Select(Day);
		ddDay.selectByVisibleText("25");
		//System.out.println(Day.getText());
		
		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		Select ddMonth=new Select(Month);
		ddDay.selectByVisibleText("Jul");
		
		WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
		Select ddYear=new Select(Year);
		ddDay.selectByVisibleText("2023");
		
	}
	

}
