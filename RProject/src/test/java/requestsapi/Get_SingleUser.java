package requestsapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_SingleUser {
	@Test
	public void getSingleUser() {

	   // Response response =
	          //  RestAssured.get("https://jsonplaceholder.typicode.com/users/2");

		Response response =
	            RestAssured.get("https://jsonplaceholder.typicode.com/users/5");

	    System.out.println(response.asPrettyString());
	    System.out.println(response.getStatusCode());

	    response.then().statusCode(200);
	}

}
