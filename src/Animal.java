import java.util.Objects;

public class Animal {

    private String type;
    private String nameAnimal;

    public Animal(String type, String nameAnimal) {
        this.type = type;
        this.nameAnimal = nameAnimal;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return type.equals(animal.type) && nameAnimal.equals(animal.nameAnimal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, nameAnimal);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", nameAnimal='" + nameAnimal + '\'' +
                '}';
    }
}
