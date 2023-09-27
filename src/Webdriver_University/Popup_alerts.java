package Webdriver_University;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santh\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		
/*		WebElement Click1 = driver.findElement(By.xpath("//*[@id=\"button1\"]"));
		Click1.click();
		
		driver.switchTo().alert().accept();driver.switchTo().alert().accept();    */
		
		WebElement Click2 = driver.findElement(By.xpath("//*[@id=\"button1\"]"));
		Click2.click();
		
		
		
		
		
		
		
		
		

	}

}
