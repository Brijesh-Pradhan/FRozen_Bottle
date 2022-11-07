package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAdminStepDefinition {
	
	Response res;
	ValidatableResponse validate;

	@When("User is Able to Retrive the id by casing is {string}")
	public void user_is_able_to_retrive_the_id_by_casing_is(String URL) {
    
	res=RestAssured.get(URL);
	
}

	@Then("User is validate Code Is coming is {int}")
	public void user_is_validate_code_is_coming_is(Integer code) {
	
	validate=res.then();
	validate.assertThat().statusCode(code).log().all();
   
}

}
