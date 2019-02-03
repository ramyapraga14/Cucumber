package Glue;

import org.openqa.selenium.By;

import Utils.WDHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	{
        System.setProperty("atu.reporter.config", "src/test/resources/atu.properties");
    }

	@Given("^I am able to access magento Homepage$")
	public void i_am_able_to_access_magento_Homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WDHelper.initialize("gc");
		WDHelper.navigate("www.magento.com");
		
	    
	}

	@Given("^I click on user_icon$")
	public void i_click_on_user_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WDHelper.click(By.className("fa-user"));
	   
	}

	@When("^i update the user_name as \"([^\"]*)\"$")
	public void i_update_the_user_name_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WDHelper.type(By.id("email"), arg1);
	    
	}

	@When("^I update password as \"([^\"]*)\"$")
	public void i_update_password_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WDHelper.type(By.id("pass"), arg1);
	    
	}

	@When("^I click on Sign_in$")
	public void i_click_on_Sign_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WDHelper.click(By.id("send2"));
	    
	}

	@Then("^I should get the error message as \"([^\"]*)\"$")
	public void i_should_get_the_error_message_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WDHelper.assertText(By.className("error-msg"), arg1);
	   
	}
	@Then("^I should get the user ID as \"([^\"]*)\"$")
	public void i_should_get_the_user_ID_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    WDHelper.assertText(By.xpath("//div[@class='account-help']/span"), arg1);
	}

}
