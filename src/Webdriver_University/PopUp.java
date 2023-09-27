package Webdriver_University;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub// Doubt//

		System.setProperty("webdriver.chrome.driver","C:\\Users\\santh\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		driver.manage().window().maximize();
		
		//popup
/*	    WebElement Clickme = driver.findElement(By.xpath("//*[@id=\"button1\"]"));
	    Clickme.click();
	    driver.switchTo().alert().accept(); */
		
//		WebElement Clickme = driver.findElement(By.xpath("//*[@id=\"button2\"]"));
//		Clickme.click();
//		driver.switchTo().alert().dismiss();
		
		//Ajax Loader
/*		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement Clickme3 = driver.findElement(By.xpath("//*[@id=\"button3\"]"));
		Clickme3.click();
		driver.get("https://webdriveruniversity.com/Ajax-Loader/index.html");
		WebElement Clickme4 = driver.findElement(By.xpath("//*[@id=\"button1\"]"));
		Clickme4.click();
		driver.switchTo().alert().dismiss();   */
//Java script Conform box
		
		WebElement Clickme4 = driver.findElement(By.xpath("//*[@id=\"button4\"]"));
		Clickme4.click();
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
	}

}
