package Webdriver_University;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Do_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santh\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
// Add new todo 
/*		WebElement NewTodo = driver.findElement(By.xpath("//*[@id=\"container\"]/input"));
		NewTodo.sendKeys("Software Testing");
		//Enter Key Code 
		NewTodo.sendKeys(Keys.RETURN);  */
//Delete 
		WebElement Delete1 = driver.findElement(By.xpath("//*[@id=\"container\"]/ul/li[1]/span/i"));
		Delete1.click();
		
	
		
	
		
		
		

	}

}
