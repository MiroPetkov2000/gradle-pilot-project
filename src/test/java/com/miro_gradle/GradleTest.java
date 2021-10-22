package com.miro_gradle;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.junit5.SerenityTest;
import org.junit.jupiter.api.Test;

import static net.serenitybdd.rest.SerenityRest.given;
@SerenityTest
public class GradleTest {

    @Test
    public void test1() {
        Response response = given()
                .accept(ContentType.JSON)
                .and()
                .auth().basic("admin", "admin")
                .when()
                .get("http://44.195.19.167:7000/api/spartans")
                .then()
                .statusCode(200)
                .and()
                .contentType(ContentType.JSON).extract().response();
        System.out.println(response.statusCode());
        System.out.println(response.contentType());
    }
}
