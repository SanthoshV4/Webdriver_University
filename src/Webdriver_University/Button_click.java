package Webdriver_University;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santh\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
		driver.manage().window().maximize();
// 1st Click
/*		WebElement ClickButton1 = driver.findElement(By.xpath("//*[@id=\"button1\"]"));
		ClickButton1.click();  */
// 2nd Click
/*		WebElement ClickButton2 = driver.findElement(By.xpath("//*[@id=\"button2\"]"));
		ClickButton2.click(); */
// 3rd Click
		WebElement ClickButton3 = driver.findElement(By.xpath("//*[@id=\"button3\"]"));
		ClickButton3.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
