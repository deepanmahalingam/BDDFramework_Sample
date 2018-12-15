package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Verify_SearchBar 
{
	WebDriver driver;
	@Given("user is provided with URL")
	public void user_is_provided_with_URL()
	{
		System.setProperty("webdriver.gecko.driver", "Z:\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	}
	
	@When("user is navigated to home page")
	public void user_is_navigated_to_home_page()
	{
		driver.get("https://google.com");
	}
	
	@And("check for input tab")
	public void check_for_input_tab()
	{
		if(driver.findElement(By.xpath("//input[@title='Search']")).isDisplayed())
		{
			System.out.println("Search bar is dispaled");
			System.out.println("Current URL --->"+driver.getCurrentUrl());
			System.out.println("Thank you");
		}
		else
		{
			System.out.println("Search bar is not displayed");
		}
	}
	
	@Then("close the browser successfully")
	public void close_the_browser_successfully()
	{
		driver.close();
	}

}
