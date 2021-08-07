package Stepdefff;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepdeppp {

WebDriver driver;	
	
	@Given("^OPEN FB URL$")
	public void open_FB_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
	   
	}

	@Then("^ENTER INVlid USER AND PASSWORD$")
	public void enter_INVlid_USER_AND_PASSWORD() throws Throwable { 
	  driver.findElement(By.id("email")).sendKeys("rkabir994@gmail.com"); 
	  driver.findElement(By.id("pass")).sendKeys("Dhaka@1207");
	}

	@Then("^CLICK ON LOGIN$")
	public void click_ON_LOGIN() throws Throwable {
	  driver.findElement(By.name("login")).click();
	   
	}

	@Then("^VERIFY USER SHOULD NOT LOGIN$")
	public void verify_USER_SHOULD_NOT_LOGIN() throws Throwable {
	boolean errormessage= driver.findElement(By.xpath("//h2[@class=\"uiHeaderTitle\"]")).isDisplayed();
	Assert.assertTrue(errormessage);
	
	driver.close();
	}


}
