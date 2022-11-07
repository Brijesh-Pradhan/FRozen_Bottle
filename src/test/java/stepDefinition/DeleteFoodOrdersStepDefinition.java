package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteFoodOrdersStepDefinition {

	Response res;
	ValidatableResponse validate;
	
	

@When("User is able to deleted the id by using an apiii is {string}")
public void user_is_able_to_deleted_the_id_by_using_an_apiii_is(String url) {
	 res=RestAssured.get(url);
	
    }

@Then("User is validate status codeee is id {int}")
public void user_is_validate_status_codeee_is_id(Integer int1) {
	validate=res.then();
	validate.assertThat().statusCode(int1).log().all();
	
    }
}
