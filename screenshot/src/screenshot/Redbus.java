package screenshot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\java all\\chromedriver_win32\\chromedriver.exe");    
WebDriver driver = new ChromeDriver();
driver.get("https://www.redbus.in/?gclid=EAIaIQobChMIvuXFvMD-4AIVhB-tBh32agOjEAAYASAAEgK__vD_BwE");
driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Pune (All Locations)");
driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore (All Locations)");
//driver.findElement(By.xpath("//label[@class='db text-trans-uc']")).click();
driver.findElement(By.xpath("//label[@class='db text-trans-uc']")).click();
driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/table//tr[5]//td[@class='current day']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//label[@class='db text-trans-uc tal']")).click(); ///inspect the return date
driver.findElement(By.xpath("//div[@id='rb-calendar_return_cal']/table//tr[5]//td[5]")).click(); ///calenderselect then table then tr row and td column
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@id='search_btn']")).click();


List<WebElement> bus = driver.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color']"));
int count=bus.size();
System.out.println(count);

//driver.findElement(By.xpath(".//div[@id='rb-calendar_onward_cal']//table//tr[5]//td[3]")).click();
//List<WebElement> bus = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']"));
//for(int i=0;i<list.size();i++) {
//driver.findElement(By.xpath("//td[@class='current day']")).click();
//String date = list.get(i).getText();
//if(date.equalsIgnoreCase("14"))
//	list.get(i).click();
//break;
//	}
//Thread.sleep(3000);

 //driver.findElement(By.xpath("//button[@id='search_btn']")).click();
//Actions a=new Actions(driver);
//a.moveToElement(target).perform();

	}
}
