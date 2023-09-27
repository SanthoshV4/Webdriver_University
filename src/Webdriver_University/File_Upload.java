package Webdriver_University;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\santh\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Navigate to the image upload page
		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		driver.manage().window().maximize();
		
		WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"myFile\"]"));
		fileInput.sendKeys("E:\\Editing\\GoPro\\04\\GOPR1823.JPG");
		//submit 
		WebElement Submit = driver.findElement(By.xpath("//*[@id=\"submit-button\"]"));
		Submit.click();
		driver.switchTo().alert().accept();
		
		try {
			Thread.sleep(500000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
