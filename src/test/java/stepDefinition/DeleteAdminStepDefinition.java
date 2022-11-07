package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteAdminStepDefinition {
	
	Response res;
	ValidatableResponse validate;
	
	
	@When("user is able to delete the id by using an api is {string}")
	public void user_is_able_to_delete_the_id_by_using_an_api_is(String URL) {
	   res=RestAssured.get(URL);
	}

	@Then("user is able to get the stautus code is {int}")
	public void user_is_able_to_get_the_stautus_code_is(Integer int1) {
	    validate=res.then();
	    validate.assertThat().statusCode(int1).log().all();
	}

}
