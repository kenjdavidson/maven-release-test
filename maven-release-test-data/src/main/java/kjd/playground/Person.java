package kjd.playground;

public class Person {
    public final String GivenName;
    public final String Surname;
    public final int Age;

    public Person(
        String given,
        String surname,
        int age
    ) {
        this.GivenName = given;
        this.Surname = surname;
        this.Age = age;
    }

    public Person(
        Person person
    ) {
        this.GivenName = person.GivenName;
        this.Surname = person.Surname;
        this.Age = person.Age;
    }
}
