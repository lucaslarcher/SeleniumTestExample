package webteste;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebTest {

	public static WebDriver driver;
	
	public static void invokeBrowser() {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver-v0.26.0-linux64/geckodriver");

		try {
			WebDriver driver = new FirefoxDriver();
			driver.get("http://www.wikipedia.org");

			WebElement searchBox;
			searchBox = driver.findElement(By.id("searchInput"));
			searchBox.sendKeys("Software");
			searchBox.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			
			WebElement link;
			link = driver.findElement(By.linkText("physical hardware"));
			link.click();
			Thread.sleep(5000);
			
			driver.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invokeBrowser();
	}

}
