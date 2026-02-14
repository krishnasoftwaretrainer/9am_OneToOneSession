package requestsapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Put_UpdateUser {
	@Test
    public void updateUser() {

        String requestBody = """
        {
          "id": 1,
          "name": "Suresh",
          "username": "Suresh123",
          "email": "@suresh123@test.com"
        }
        """;

        Response response =
                RestAssured
                    .given()
                    .header("Content-Type", "application/json")
                    .body(requestBody)
                    .when()
                    .put("https://jsonplaceholder.typicode.com/users/1");

        System.out.println(response.asPrettyString());
        System.out.println(response.getStatusCode());

        response.then().statusCode(200);
    }
}
