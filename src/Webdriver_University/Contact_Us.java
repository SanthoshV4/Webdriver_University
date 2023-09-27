package Webdriver_University;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contact_Us {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santh\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();
		//1st Name
		WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]"));
		FirstName.sendKeys("Santhosh");
		//Last name
		WebElement Lastname = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[2]"));
		Lastname.sendKeys("M");
		//Email address
		WebElement EmailAddress = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]"));
		EmailAddress.sendKeys("Santhosh.m9074@gmail.com");
		//Comments
		WebElement Comments = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/textarea"));
		Comments.sendKeys("Hi i'm santhosh M");
		//Submit
/*		WebElement Submit = driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
		Submit.click();     */
		WebElement Reset = driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[1]"));
		Reset.click();
		
		
		
		
		
		
		
		
		

	}

}
