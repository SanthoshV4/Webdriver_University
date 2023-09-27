package Webdriver_University;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_portal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\santh\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
		driver.manage().window().maximize();
		
//Username
		WebElement Username = driver.findElement(By.xpath("//*[@id=\"text\"]"));
		Username.sendKeys("Santhosh M");
//Password 
		WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Password.sendKeys("123456789");
//Submit
		WebElement Submit = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		Submit.click();
		
		
		
		
		
		
		
		
		
		
	}

}
