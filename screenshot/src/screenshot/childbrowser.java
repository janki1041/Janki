package screenshot;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\java all\\chromedriver_win32\\chromedriver.exe");    
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
 
		String parent = driver.getWindowHandle();   // naukri page
		System.out.println(parent);
		
		Set<String> allwindow = driver.getWindowHandles();   // child browser popup
		System.out.println(allwindow);
		
		int count = allwindow.size();
		System.out.println(count);
		
		for(String child:allwindow)
		{
			
//			if(!parent.equalsIgnoreCase(child))
//			{
//				driver.switchTo().window(child);
//				String str = driver.getTitle();
//				System.out.println(str);
//				driver.close();
//		}
//		
			if(parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(parent);
				String str1 = driver.getTitle();
				System.out.println(str1);
				driver.close();
			}
		}
	}

}
