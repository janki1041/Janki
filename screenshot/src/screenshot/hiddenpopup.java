package screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\java all\\chromedriver_win32\\chromedriver.exe");    
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");;
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		driver.findElement(By.xpath("//input[@value='Delete Selected Tasks']")).click();
		driver.findElement(By.xpath("(//input[@value='Cancel'])[4]")).click();
	}

}
