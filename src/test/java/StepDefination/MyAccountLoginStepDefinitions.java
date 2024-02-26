package StepDefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class MyAccountLoginStepDefinitions {

	public WebDriver driver=null;
	
	@Given("open browser")
	public void open_browser() {
		System.setProperty("webdriver.chrome.driver", "/Users/subhamkumar/RestAssured/chromedriver-mac-arm64/chromedriver");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}

	
	@When("Enter the url {string}") 
	public void enter_the_url(String url)
	{ 
		driver.get(url);
	}
	 

	@When("click on My Account Menu")
	public void click_on_my_account_menu() {
	    driver.findElement(By.linkText("My Account")).click();
	}

	/*
	 * @When("Enter rigistered username and password") public void
	 * enter_rigistered_username_and_password() {
	 * driver.findElement(By.id("username")).sendKeys("subhamkumar2695");
	 * driver.findElement(By.id("password")).sendKeys("Selenium@123"); }
	 */
	
	/*@When("Enter rigistered username {string} and password {string}")
		public void enter_rigistered_username_and_password(String user, String pwd) {
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pwd);
	}*/
	
	/*@When("Enter rigistered username and password")
		public void enter_rigistered_username_and_password(DataTable credentials) throws Throwable {
	    List <List<String>> data = credentials.cells();
	    driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
	}*/
	
	//login with data table method using header - Map Table
	@When("Enter rigistered username and password")
	public void enter_rigistered_username_and_password(DataTable credentials) {
	    List <Map<String,String>> data = credentials.asMaps(String.class,String.class);
	    driver.findElement(By.id("username")).sendKeys(data.get(0).get("user"));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get("password"));
	}

	@When("Click on login button")
	public void click_on_login_button() {
	    driver.findElement(By.name("login")).click();
	}
	
	@SuppressWarnings("deprecation")
	@Then("User must successfully login to the web page")
	public void user_must_successfully_login_to_the_web_page() {
	    String capTest= driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/strong")).getText();
	    
	    Assert.assertEquals(true,capTest.contains("subhamkumar2695"));
	    driver.close();
	}
	
	@Then("Verify login")
	public void verify_login() {
	    
		String capTest= driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul/li/strong[1]")).getText();
	    if(capTest.contains("Error")) {
	    	Assert.assertTrue("Invalid Input - Error Page", true);
	    }
	    else {
	    	Assert.assertTrue(false);
	    }
	    
	}
	
}
