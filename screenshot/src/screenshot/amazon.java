package screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "E:\\java all\\chromedriver_win32\\chromedriver.exe");    
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/"); // visit website
	
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung");  //search for samsung
	driver.findElement(By.xpath("//input[@class='nav-input'][1]")).click();  //search click
	Thread.sleep(2000);
	
	String title = driver.findElement(By.xpath("(//h2[@class='a-size-medium s-inline  s-access-title  a-text-normal'])[5]")).getText();
	System.out.println(title);
	
	String price = driver.findElement(By.xpath("(//span[@class='a-size-base a-color-price s-price a-text-bold'])[5]")).getText();
	System.out.println(price);
	
	String price1 = driver.findElement(By.xpath("(//div[@class='a-row a-spacing-none'])[3]")).getText();
System.out.println(price1);	
}
}
