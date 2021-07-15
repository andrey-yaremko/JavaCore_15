import java.util.Objects;

public class Person {

    private String namePerson;
    private int agePerson;

    public Person(String namePerson, int agePerson) {
        super();
        this.namePerson = namePerson;
        this.agePerson = agePerson;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public int getAgePerson() {
        return agePerson;
    }

    public void setAgePerson(int agePerson) {
        this.agePerson = agePerson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(namePerson, person.namePerson) && Objects.equals(agePerson, person.agePerson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namePerson, agePerson);
    }


    @Override
    public String toString() {
        return "Person{" +
                "namePerson='" + namePerson + '\'' +
                ", agePerson=" + agePerson +
                '}';
    }
}
