package requestsapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AllRequests {
	// ---------- GET : All Users ----------
    @Test(priority = 1)
    public void getAllUsers() {

        Response response =
                RestAssured.get("https://jsonplaceholder.typicode.com/users");

        System.out.println("GET ALL USERS RESPONSE:");
        System.out.println(response.asPrettyString());
        System.out.println("Status Code: " + response.getStatusCode());

        response.then().statusCode(200);
    }

    // ---------- GET : Single User ----------
    @Test(priority = 2)
    public void getSingleUser() {

        Response response =
                RestAssured.get("https://jsonplaceholder.typicode.com/users/1");

        System.out.println("GET SINGLE USER RESPONSE:");
        System.out.println(response.asPrettyString());
        System.out.println("Status Code: " + response.getStatusCode());

        response.then().statusCode(200);
    }

    // ---------- POST : Create User ----------
    @Test(priority = 3)
    public void createUser() {

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

        System.out.println("POST CREATE USER RESPONSE:");
        System.out.println(response.asPrettyString());
        System.out.println("Status Code: " + response.getStatusCode());

        response.then().statusCode(201);
    }

    // ---------- PUT : Update User ----------
    @Test(priority = 4)
    public void updateUser() {

        String requestBody = """
        {
          "id": 1,
          "name": "Updated Krishna",
          "username": "updatedtrainer",
          "email": "updated@test.com"
        }
        """;

        Response response =
                RestAssured
                    .given()
                    .header("Content-Type", "application/json")
                    .body(requestBody)
                    .when()
                    .put("https://jsonplaceholder.typicode.com/users/1");

        System.out.println("PUT UPDATE USER RESPONSE:");
        System.out.println(response.asPrettyString());
        System.out.println("Status Code: " + response.getStatusCode());

        response.then().statusCode(200);
    }

    // ---------- DELETE : Delete User ----------
    @Test(priority = 5)
    public void deleteUser() {

        Response response =
                RestAssured.delete("https://jsonplaceholder.typicode.com/users/1");

        System.out.println("DELETE USER STATUS CODE:");
        System.out.println(response.getStatusCode());

        response.then().statusCode(200);
    }
}
