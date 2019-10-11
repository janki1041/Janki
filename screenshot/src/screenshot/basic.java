package screenshot;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\java all\\chromedriver_win32\\chromedriver.exe");    
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle();
		System.out.println("title of page:"+title);
		
		//driver.close();
		
		
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		
		Dimension d = new Dimension(100,100);
		driver.manage().window().setSize(d);
		
		String url = driver.getCurrentUrl();
		System.out.println("url of webpage:"+url);
		
		Point p = new Point(200,300);
		driver.manage().window().setPosition(p);
		
		driver.quit();
		
		
	}
	

}
