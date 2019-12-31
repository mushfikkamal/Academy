package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {

	
	
	
	public WebDriver driver;
	
	
	By tittle=By.cssSelector("a[class=\"navbar-brand\"]");
	By name=By.xpath("/html/body/app-root/form-comp/div/form/div[1]/input");
	By email=By.xpath("/html/body/app-root/form-comp/div/form/div[2]/input");
	By password=By.xpath("//*[@id=\"exampleInputPassword1\"]");
	By checkbox=By.id("exampleInputPassword1");
	By gender=By.id("exampleFormControlSelect1");
	By submit=By.cssSelector("input[type=\"submit\"]");
	public Landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		}
	
	
	
	
	
	public WebElement getSubmit() {
		return driver.findElement(submit);
	}
	public WebElement getGender() {
		return driver.findElement(gender);
	}
	
	
	
	public WebElement getCheckbox() {
		return driver.findElement(checkbox);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getName() {
		return driver.findElement(name);
	}
	
	public WebElement gettittle() {
		return driver.findElement(tittle);
	}
	
	
	
	
	
	
	
	
	
	
}
