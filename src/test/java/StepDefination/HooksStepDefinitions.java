package StepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksStepDefinitions {

	@Before
	public void setup() {
		System.out.println("launch chrome browser");
		System.out.println("Entered URL of application");
	}
	@After
	public void tearDown() {
		System.out.println("close browser");
	}
	@Given("user is on add customer page")
	public void user_is_on_add_customer_page() {
	    System.out.println("user_is_on_add_customer_page");
	}

	@When("user fills the customer details")
	public void user_fills_the_customer_details() {
	    System.out.println("user_fills_the_customer_details");
	}

	@Then("customer is added")
	public void customer_is_added() {
	    System.out.println("customer_is_added");
	}

	@Given("user is on edit custoner page")
	public void user_is_on_edit_custoner_page() {
	    System.out.println("user_is_on_edit_custoner_page");
	}

	@When("user edits contact details")
	public void user_edits_contact_details() {
		System.out.println("user_edits_contact_details");
	}

	@Then("contact details updated")
	public void contact_details_updated() {
	    System.out.println("contact_details_updated");
	}

	@Given("user is on delete custoner page")
	public void user_is_on_delete_custoner_page() {
	    System.out.println("contact_details_updated");
	}

	@When("user delete customer")
	public void user_delete_customer() {
	    System.out.println("contact_details_updated");
	}

	@Then("customer deleted")
	public void customer_deleted() {
	    System.out.println("customer_deleted");
	}
}
