package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		//System.setProperty("webdriver.gecko.driver", "geckodriver");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		List<WebElement> tbRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("Total row are : " +tbRows.size());
		
		List<WebElement> tbColumns = driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println("Total Columns are : " +tbColumns.size());
		
		/* List<WebElement> tbData = driver.findElements(By.xpath("//table[@id='customers']//tr[4]/td"));
		
		for(WebElement ele: tbData) {
			System.out.println(ele.getText());
		} */
		


		List<WebElement> tbData = driver.findElements(By.xpath("//table[@id='customers']//td[1]"));
		
		for(WebElement ele: tbData) {
			System.out.println(ele.getText());
		}

	}

}
