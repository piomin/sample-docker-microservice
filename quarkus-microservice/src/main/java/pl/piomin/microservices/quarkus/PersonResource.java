package pl.piomin.microservices.quarkus;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.jboss.logging.Logger;

import java.util.ArrayList;
import java.util.List;

@Path("/persons")
public class PersonResource {

    private Logger log;

    private List<Person> persons;

    public PersonResource(Logger log) {
        this.log = log;
        persons = new ArrayList<>();
        persons.add(new Person(1, "Jan", "Kowalski", 22));
        persons.add(new Person(2, "Adam", "Malinowski", 33));
        persons.add(new Person(3, "Tomasz", "Janowski", 25));
        persons.add(new Person(4, "Alina", "Iksińska", 54));
    }

    @GET
    public List<Person> findAll() {
        log.info("Api.findAll()");
        return persons;
    }

    @GET
    @Path("/{id}")
    public Person findById(@PathParam("id") Integer id) {
        log.infof("Api.findById(%d)", id);
        return persons.stream()
                .filter(p -> (p.getId().intValue() == id))
                .findAny()
                .orElseThrow();
    }

}
