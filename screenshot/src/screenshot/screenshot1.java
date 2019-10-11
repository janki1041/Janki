package screenshot;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\java all\\chromedriver_win32\\chromedriver.exe");
		                                    
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
	TakesScreenshot ts = ((TakesScreenshot)driver);
	File source = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\owner\\Desktop\\Screenshot\\actitime1.jpg");
    FileUtils.copyFile(source,dest);
	
	}
	}