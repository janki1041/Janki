package screenshot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\owner\\Desktop\\br\\chromedriver_win32\\chromedriver.exe");    
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click(); //pop close
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("redmi");
		
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();  //search
		Thread.sleep(2000);
		
		//String rating = driver.findElement(By.xpath("(//div[@class=\"col col-7-12\"])[1]//div[2]//span[2]/span/span[3]")).getText();
		//System.out.println(rating);
//		String rating = driver.findElement(By.xpath("(//div[@class='col col-7-12'])[10]//div[2]//span[2]/span/span[3]")).getText();
//		System.out.println(rating);
		
		String review = driver.findElement(By.xpath("(//div[@class='col col-7-12'])[10]//div[2]//span[2]/span/span[1]")).getText();
		System.out.println(review);
		//String redmi = driver.findElement(By.xpath("(//div[@class='col col-7-12'])[1]//span[2]")).getText();// rating and reviews
		//System.out.println(redmi);
//		List<WebElement> title = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
//		int count=title.size();
//		System.out.println(count);
//		Thread.sleep(2000);
//		
//		for(int i=0;i<count;i++)
//		{
//			String link = title.get(i).getText();
//			System.out.println(link);
//		}
		
	}
	

}
