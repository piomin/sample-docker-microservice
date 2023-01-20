package pl.piomin.microservices.spring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApiTests {

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    void findAll() {
        Person[] persons = restTemplate.getForObject("/persons", Person[].class);
        Assertions.assertTrue(persons.length > 0);
    }

    @Test
    void findById() {
        Person person = restTemplate.getForObject("/persons/{id}", Person.class, 1);
        Assertions.assertNotNull(person);
        Assertions.assertEquals(1, person.getId());
    }
}
