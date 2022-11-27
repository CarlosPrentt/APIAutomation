package pojo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import java.util.List;

public class User {
    private int id;

    public User(int id, String name, String lastName, int accountNumber, int amount, String transactionType, String email, boolean active, String country, String telephone) {
        this.setId(id);;
        this.setName(name);
        this.setLastName(lastName);
        this.setAccountNumber(accountNumber);
        this.setAmount(amount);
        this.setTransactionType(transactionType);
        this.setEmail(email);
        this.setActive(active);
        this.setCountry(country);
        this.setTelephone(telephone);
    }

    private String name;
    private String lastName;
    private int accountNumber;
    private int amount;
    private String transactionType;
    private String email;
    private boolean active;
    private String country;
    private String telephone;

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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
