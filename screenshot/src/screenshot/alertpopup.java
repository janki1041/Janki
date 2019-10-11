package screenshot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\java all\\chromedriver_win32\\chromedriver.exe");    
		WebDriver driver = new ChromeDriver();
		// redifmail.com example
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept(); ///ok button
		
		//alt.dismiss();  //cancel
		
	}

}
