package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	@When("user attempts to login")
	public void user_attempts_to_login() {
		System.out.println("Running - user attempts to login");
	}

	@Then("verify user had loggedIn")
	public void verify_user_had_logged_in() {
		System.out.println("Running - verify user had loggedIn");
	}

	@Given("user launches the application")
	public void user_launches_the_application() {
		System.out.println("user launches the application");
	}

	@When("user provides username {string} and password {string}")
	public void user_provides_username_and_password(String string, String string2) {
		System.out.println("username = " + string);
		System.out.println("password = " + string2);

	}

	@Then("verify that the user is able to login to the application")
	public void verify_that_the_user_is_able_to_login_to_the_application() {
		System.out.println("verify that the user is able to login to the application");
	}

	@When("^user enters username as (.+) and password as (.+)$")
	public void outline(String string, String string2) {

		System.out.println("username = " + string);
		System.out.println("password = " + string2);
	}
	
}
