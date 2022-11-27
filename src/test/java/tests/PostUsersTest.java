package tests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import persistence.InicializeData;
import pojo.User;

import java.util.List;

public class PostUsersTest {
    User user = InicializeData.loadUsers();
    @Test
    public void jsonPathUsage() {
        RestAssured.baseURI = "https://637e812f5b1cc8d6f92f6bbb.mockapi.io/api/v1/";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("user/");

        // First get the JsonPath object instance from the Response interface
        JsonPath jsonPathEvaluator = response.jsonPath();

        // Read all the books as a List of String. Each item in the list
        // represent a book node in the REST service Response
        List<String> usersList = jsonPathEvaluator.getList("Name");

        // Iterate over the list and print individual book item
        for (String user : usersList) {
            System.out.println("User: " + user);
        }
        for (int i = 0; i < usersList.size(); i++) {
            int userId = i + 1;
            response = httpRequest.post(user.getName());
        }
        response.then().extract().response();
        response.then().statusCode(200);
    }
}
