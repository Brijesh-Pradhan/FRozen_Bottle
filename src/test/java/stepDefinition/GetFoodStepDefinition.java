package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetFoodStepDefinition {
	
	Response res;
	ValidatableResponse validate;

	@When("User is Surely gifiting Data from by giffting {string}")
	public void user_is_surely_gifiting_data_from_by_giffting(String string) {
	res=RestAssured.get(string);
}
    

	
	@Then("User is Definitely get Coding as of {int}")
	public void user_is_definitely_get_coding_as_of(Integer int1) {
	
	validate=res.then();
	validate.assertThat().statusCode(int1).log().all();
    
}


}
