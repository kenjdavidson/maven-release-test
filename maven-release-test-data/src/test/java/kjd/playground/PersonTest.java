package kjd.playground;

public class PersonTest {

    @Test
    public void testNewPerson() {
        Person person = new Person("Ken", "Davidson", 42);

        assertEquals("Ken", person.GivenName);
        assertEquals("Davidson", person.Surname);
        assertEquals(42, person.Age);
    }
    
}
