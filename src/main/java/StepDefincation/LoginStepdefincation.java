package StepDefincation;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import AllPages.LoginPage1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utliles.Genericmethods;

public class LoginStepdefincation  extends LoginPage1{

	
	Genericmethods GM= new Genericmethods();
	
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() throws IOException
	{
		applicationlaunch();
		ExtentCucumberAdapter.addTestStepLog("Lanuched successfully");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GM.captureScreenshot());
	}

	
	@When("^user enters valid singlename\"([^\"]*)\"$")
	public void user_enters_valid_username(String username) throws IOException
{
		Enter_Emaild(username);
		ExtentCucumberAdapter.addTestStepLog("Entered username successfully "+username);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GM.captureScreenshot());
	}
	
	@When("^user enters valid password\"([^\"]*)\"$")
	public void user_enters_valid_password(String password) throws IOException
{
		Enter_password(password);
		ExtentCucumberAdapter.addTestStepLog("Entered username successfully "+password);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GM.captureScreenshot());
	}
	
//	@When("user enters valid username {string}")
//	public void user_enters_valid_username(String username)
//	{
//		Enter_Emaild(username);
//	}
//
//	@When("user enters valid password {string}")
//	public void user_enters_valid_password(String password) {
//	    
//	Enter_password(password);
//	}

	@Then("clicks on submit")
	public void clicks_on_submit() {
		Login();
		ExtentCucumberAdapter.addTestStepLog("clicked successuly");
		closeBrowser();
	}

	
	
	
	
	
	
}
