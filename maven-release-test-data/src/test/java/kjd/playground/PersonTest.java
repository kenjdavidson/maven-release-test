package kjd.playground;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void testNewPerson() {
        Person person = new Person("Ken", "Davidson", 42);

        assertEquals("Ken", person.GivenName);
        assertEquals("Davidson", person.Surname);
        assertEquals(42, person.Age);
    }

    @Test
    public void testNewPersonFromPerson() {
        Person person = new Person("Ken", "Davidson", 42);
        Person person2 = new Person(person);

        assertEquals("Ken", person2.GivenName);
        assertEquals("Davidson", person2.Surname);
        assertEquals(42, person2.Age);
    }
    
}
