package screenshot;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\java all\\chromedriver_win32\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("nokia");
		driver.findElement(By.xpath("//input[@class='nav-input'][1]")).click();
		//String text = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).getText();
	//System.out.println(text);
 List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		for(int i=0;i<list.size();i++) {
			String str = list.get(i).getText();
			System.out.println(str);
		}
	
	
	
	//String text1 = driver.findElement(By.xpath("(//div[@class='a-row'])[2]//span[@class='a-price-whole'][1]")).getText();
	//System.out.println(text1);
	
	//(//div[@class='a-row'])[2]//span[@class='a-price-whole'][1]
	}
	

}
