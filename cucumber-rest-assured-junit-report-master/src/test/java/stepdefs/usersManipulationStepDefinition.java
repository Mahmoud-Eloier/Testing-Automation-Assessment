package stepdefs;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class usersManipulationStepDefinition {

	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;
	private String baseUrl = "https://6355251c483f5d2df3adf4b9.mockapi.io/Users";
	private String jsonString; 
	
	
	@Given("a list of users are available")
	public void a_list_of_users_are_available() {
		
		request = RestAssured.given();
		response = request.get(baseUrl);
		jsonString = response.asString();
		Assert.assertTrue(jsonString.length() > 0);

	}
	@When("I add a user to my list {string} , {string}, {int}")
	public void i_add_a_user_to_my_list(String name,String age,int id) {
		
		request = RestAssured.given();
		
		response = request.body("{ \"name\": \""+ name + ", \"age\": \""+ age +", \"id\": \""+id+'}')
				.post("/Users");
	}
	@Then("Get the list of users")
	public void get_the_list_of_users() {
		response = request.get(baseUrl);
		Assert.assertEquals(201, response.getStatusCode());
	}
	
	@When("delete th user with id {int}")
	public void delete_th_user_with_id(Integer id) {
		request = RestAssured.given();
		
		request.header("Content-Type", "application/json");
		System.out.println("*****"+request);
		response = request.delete("/Users/:"+id);
		
		Assert.assertEquals(200, response.getStatusCode());

	    

	}
	@Then("get the list of users after deleting without id {int}")
	public void get_the_list_of_users_after_deleting(int id) {
		response = request.get(baseUrl+":"+id);
		Assert.assertEquals(200, response.getStatusCode());
		jsonString = response.asString();
		List<Map<String, String>> booksOfUser = JsonPath.from(jsonString).get("/Users");
		Assert.assertEquals(0, booksOfUser.size());
	}

	
	
	


	



}
