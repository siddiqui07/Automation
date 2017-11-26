package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginDef {
	
	WebDriver driver;
	
	@Given("^Open chromebrowser and I should be redirected to Login page$")
	public void open_chromebrowser_and_I_should_be_redirected_to_Login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("http://www.google.com");	
	   
	}

	@When("^Enter user name and password$")
	public void enter_user_name_and_password() throws Throwable {
	    
		// Write code here that turns the phrase above into concrete actions
		String title=driver.getTitle();
		System.out.println(title);
		
	}

	@And("^Click on login button$")
	public void click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Again When");
	}

	@Then("^I should be loged into application$")
	public void i_should_be_loged_into_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
	}


}
