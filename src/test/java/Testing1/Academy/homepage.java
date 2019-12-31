package Testing1.Academy;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.Landingpage;
import resource.base;

public class homepage extends base {
	
	private static Logger log= LogManager.getLogger(base.class.getName());
	//private static Logger log = LogManager.getLogger(demo.class.getName());
	
	
	@BeforeTest
	public void homepage() throws IOException {
		driver=initializeDriver();
		log.info("driver is initialized");
		driver.get(prop.getProperty("url"));
		
		log.info("navigate to homepage");
	
	}

	@Test(dataProvider="getData")// by telling thsi dataProvider =get data go find for get data 
	public void landing(String name, String username, String password, String text)//we need to declare the variable int or string
	{
		Landingpage n=new Landingpage(driver);
		
		Assert.assertEquals(n.gettittle().getText(), "ProtoCommerce");
		log.info("validate text message");
		n.getName().sendKeys(name);;
		n.getEmail().sendKeys(username);
		n.getPassword().sendKeys(password);
		n.getCheckbox().isSelected();
		n.getGender().sendKeys(Keys.ARROW_DOWN , Keys.ENTER);
		System.out.println(text);
		n.getSubmit().click();
		
		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object [][] data=new Object[2][4];
		data[0][0]="khabbar";
		data[0][1]="kamalm";
		data[0][2]="p343434";
		data[0][3]="good user";
		
		data[1][0]="rahim";
		data[1][1]="mushf";
		data[1][2]="p343434";
		data[1][3]="bad ser";

		return data;
		
	}
	@AfterTest
	public void teardown() {
		driver.manage().deleteAllCookies();
		driver.close(); 
	}
}
