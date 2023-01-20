package pl.piomin.microservices.quarkus;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class PersonResourceTests {

    @Test
    public void findAll() {
        given()
                .when().get("/persons")
                .then()
                .statusCode(200)
                .assertThat().body("size()", is(4));
    }

    @Test
    public void findById() {
        Person person = given()
                .when().get("/persons/1")
                .then()
                .statusCode(200)
                .extract()
                .body().as(Person.class);
        assertNotNull(person);
        assertEquals(1, person.getId());
    }
}
