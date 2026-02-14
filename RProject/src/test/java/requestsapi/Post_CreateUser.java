package requestsapi;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Post_CreateUser {
	 @Test
	    public void createUser() 
	 {

	        String requestBody = """
	        {
	          "name": "Krishna",
	          "username": "trainer",
	          "email": "krishna@test.com"
	        }
	        """;

	        Response response =
	                RestAssured
	                    .given()
	                    .header("Content-Type", "application/json")
	                    .body(requestBody)
	                    .when()
	                    .post("https://jsonplaceholder.typicode.com/users");

	        System.out.println(response.asPrettyString());
	       // System.out.println(response.toString());
	        System.out.println(response.getStatusCode());

	        response.then().statusCode(201);
	    }
}
