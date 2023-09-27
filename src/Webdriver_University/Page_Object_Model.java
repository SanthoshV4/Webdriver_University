package Webdriver_University;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Object_Model {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santh\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Page-Object-Model/index.html");
		driver.manage().window().maximize();
		
		WebElement findoutmore = driver.findElement(By.xpath("//*[@id=\"button-find-out-more\"]"));
		findoutmore.click();
		
		Alert alert = driver.switchTo().alert(); 
//		String alertmessage = driver.switchTo().alert().getText();
//		System.out.println(alertmessage);
//		alert.accept();
		Alert alert1 = driver.switchTo().alert();
        alert1.dismiss();
		
		
	}

}
