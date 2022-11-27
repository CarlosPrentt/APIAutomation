package pojo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import java.util.List;

public class user {
    private int id;
    private String name;
    private String lastName;
    private int accountNumber;
    private int amount;
    private String transactionType;
    private String email;
    private boolean active;
    private String country;
    private int telephone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

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
        for(String user : usersList)
        {
            System.out.println("User: " + user);
        }
    }
}
