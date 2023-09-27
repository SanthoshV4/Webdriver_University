package Webdriver_University;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajax_loader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\santh\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Ajax-Loader/index.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement Clickme = driver.findElement(By.xpath("//*[@id=\"button1\"]"));
		Clickme.click();
		driver.switchTo().alert().dismiss();
		
/*		WebElement Cancel = driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button"));
		Cancel.click();    */
		
		
		
		
		
		
		
		
		
		
		
	}

}
