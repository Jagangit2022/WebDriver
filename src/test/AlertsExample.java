package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		//System.setProperty("webdriver.gecko.driver", "geckodriver");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		// =============== Alert Accept
		
		WebElement elem = driver.findElement(By.xpath("//*[@id='alertButton']"));
		elem.click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);
		
		// ===================== Alert Cancel
		WebElement elem1 = driver.findElement(By.xpath("//*[@id='confirmButton']"));
		JavascriptExecutor obj = (JavascriptExecutor) driver;
		obj.executeScript("arguments[0].scrollIntoView();", elem1);
		elem1.click();
		
		Alert alert1 = driver.switchTo().alert();
		
		System.out.println(alert1.getText());
		alert1.dismiss();
		Thread.sleep(3000);
		
		//============= Alert Message
		
		WebElement elem2 = driver.findElement(By.xpath("//*[@id='promtButton']"));
		//JavascriptExecutor obj = (JavascriptExecutor) driver;
		obj.executeScript("arguments[0].scrollIntoView();", elem2);
		elem2.click();
		
		Alert alert2 = driver.switchTo().alert();
		
		System.out.println(alert2.getText());
		alert2.sendKeys("Some text");
		alert2.accept();
	}

}
