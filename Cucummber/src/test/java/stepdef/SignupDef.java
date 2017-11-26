package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignupDef {

	
	@Given("^I want to write a step with \"([^\"]*)\"$")
	public void i_want_to_write_a_step_with_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println(arg1);
	}

	@When("^I check for the \"([^\"]*)\" in step$")
	public void i_check_for_the_in_step(int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(arg2);
	}

	@Then("^I verify the \"([^\"]*)\" in step$")
	public void i_verify_the_success_in_step(String arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(arg3);
	    
	}
}

	

