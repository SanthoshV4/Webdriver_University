package Webdriver_University;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santh\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Hidden-Elements/index.html");
		driver.manage().window().maximize();
		
		WebElement ZeroOpacity = driver.findElement(By.xpath("//*[@id=\"button3\"]"));
		ZeroOpacity.click();
		
		
		
		
		
		
		

	}

}
