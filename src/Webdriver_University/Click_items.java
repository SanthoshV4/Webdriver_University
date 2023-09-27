package Webdriver_University;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_items {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\santh\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Accordion/index.html");
		
//		WebElement ClickItem = driver.findElement(By.xpath("//*[@id=\"automation-accordion\"]"));
//		ClickItem.click();
//		WebElement ClickItem2 = driver.findElement(By.xpath("//*[@id=\"manual-testing-accordion\"]"));
//		ClickItem2.click();
		WebElement ClickItem3 = driver.findElement(By.xpath("//*[@id=\"cucumber-accordion\"]"));
		ClickItem3.click();
//    	WebElement ClickItem4 = driver.findElement(By.xpath("//*[@id=\"click-accordion\"]"));
//		ClickItem4.click();
        
		
		
		
		
		
		
		
		
		
		
	}

}
