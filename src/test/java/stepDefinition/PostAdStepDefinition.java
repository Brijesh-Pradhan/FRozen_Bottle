package stepDefinition;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostAdStepDefinition {

	RequestSpecification req;
	Response res;
	ValidatableResponse validate;
	
	
	@Given(": User want to pass the data into database")
	public void user_want_to_pass_the_data_into_database() {
		JSONObject obj=new JSONObject();
		obj.put("email","brijeshpradhan3498@gmail.com");
		obj.put("name","BrijeshPradhan7865");
		obj.put("password","coldjunior0707");
		obj.put("id",62);
		req=RestAssured.given()
				.body(obj)
			.contentType(ContentType.JSON);
		
		
	}

	@When(": user gives the data by using an api is {string}")
	public void user_gives_the_data_by_using_an_api_is(String URI) {
	
		res=req.post(URI);
		
	}

	@Then(": user validates the status code is {int}")
	public void user_validates_the_status_code_is(Integer code) {

		
		validate=res.then();
		validate.assertThat().statusCode(code).log().all();
	}

}
