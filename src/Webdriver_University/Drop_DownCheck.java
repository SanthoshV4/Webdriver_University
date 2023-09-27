package Webdriver_University;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_DownCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\santh\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		
		Select drop1 = new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]")));
		drop1.selectByValue("python");
		
		Select drop2 = new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-2\"]")));
		drop2.selectByValue("testng");
		
		Select drop3 = new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-3\"]")));
		drop3.selectByValue("javascript");
		
		//Check Box //
		WebElement option1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[1]/input"));
		option1.click();
		WebElement option2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[2]/input"));
		option2.click();
		WebElement option3 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[3]/input"));
		option3.click();
		WebElement option4 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[4]/input"));
		option4.click();
		
		
		//Radio Button //
		WebElement Radio2= driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[2]"));
		Radio2.click();
		
		//Select and Disable //
		WebElement Radio1 = driver.findElement(By.xpath("//*[@id=\"radio-buttons-selected-disabled\"]/input[1]"));
		Radio1.click();
		
		Select drop4 = new Select(driver.findElement(By.xpath("//*[@id=\"fruit-selects\"]")));
		drop4.selectByValue("apple");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
