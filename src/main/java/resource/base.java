









package resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		prop =new Properties();
		FileInputStream fis =new FileInputStream("C:\\Users\\kamal\\eclipse-workspace\\Academy\\src\\main\\java\\resource\\data.properties");
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		
		if(browsername.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kamal\\Downloads\\seleneum\\downloads\\chromedriver79\\chromedriver_win32\\chromedriver.exe");
			 driver =new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
}

	public void screenshot(String result) throws IOException {
		File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C:\\islam\\"+result+"screenshot.png"));
	}
	
	
}
