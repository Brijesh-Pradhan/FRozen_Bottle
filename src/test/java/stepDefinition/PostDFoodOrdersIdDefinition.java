package stepDefinition;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostDFoodOrdersIdDefinition {
	
	

	RequestSpecification req;
	Response res;
	ValidatableResponse validate;
	
	@Given(": user wanted pass data in the data in api {string}")
	public void user_wanted_pass_data_in_the_data_in_api(String string) {
	   
		JSONObject main=new JSONObject();
		main.put("dateTime","2022-11-04T11:41:24.815Z");
		main.put("id",8);
		

		JSONArray aItems=new JSONArray();
		
		JSONObject items=new JSONObject();
		items.put("category", "Dinner");
		items.put("Dinner", 2500);
		items.put("id", 9);
		items.put("name","seafood");
		items.put("quantity", 5);
		
		
		aItems.add(items);
		
		main.put("items", aItems);
		main.put("status", "notdelivered");
		main.put( "totalCost",10000);
		
		
	}

	@Then(": user wants to validate the status code in {int}")
	public void user_wants_to_validate_the_status_code_in(Integer int1) {
	    
		
		
	}

}
