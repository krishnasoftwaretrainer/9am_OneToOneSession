package requestsapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_AllUsers {

	@Test
	public void GetRequest()
	{
		//Response resp=RestAssured.get("https://reqres.in/api/users?page=2");
		//System.out.println(resp.asString());
		//System.out.println(resp.getStatusCode());
		
	//	Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		Response response =
		        RestAssured.get("https://jsonplaceholder.typicode.com/users");

        // Print response body
        System.out.println(response.asString());

        // Print status code
        System.out.println(response.getStatusCode());
        System.out.println(response.asPrettyString());
        response.then().statusCode(200);

	}
}
