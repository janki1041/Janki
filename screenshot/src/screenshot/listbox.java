package screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\java all\\chromedriver_win32\\chromedriver.exe");    
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/r.php?locale=en_GB&display=page");
		
		WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select d=new Select(date);
		d.selectByValue("24");
		

		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select m=new Select(month);
		//m.selectByVisibleText("April");
		m.selectByIndex(1);
		
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select y=new Select(year);
		y.selectByValue("1994");
		
		
	}

}
