package requestsapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Delete_Request {
	@Test
    public void deleteUser() {

        Response response =
                RestAssured.delete("https://jsonplaceholder.typicode.com/users/2");
        System.out.println(response.asPrettyString());
        System.out.println(response.getStatusCode());

        response.then().statusCode(200);
    }
}
