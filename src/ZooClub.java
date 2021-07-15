import java.util.*;
import java.util.Map.Entry;


public class ZooClub {

    private static ZooClub zooclub;
    private Map<Person, List<Animal>> zooClubMembers = new HashMap<>();

    public static synchronized ZooClub getZooClub() {
        if (zooclub == null) {
            zooclub = new ZooClub();
        }
        return zooclub;
    }

    public void addZooClubMember() {
        System.out.println("Введіть імя");
        Scanner scanner = new Scanner(System.in);
        String namePerson = scanner.next();

        System.out.println("Введіть вік");
        scanner = new Scanner(System.in);
        int agePerson = scanner.nextInt();
        Person personClubMember = new Person(namePerson, agePerson);
        zooclub.zooClubMembers.put(personClubMember, new ArrayList<>());
        System.out.println(personClubMember);

    }

    public void addAnimalClubMember() {
        System.out.println("ВВедіть імя тваринки");
        Scanner scanner = new Scanner(System.in);
        String nameAnimal = scanner.next();
        System.out.println("ВВедіть тип тваринки");
        scanner = new Scanner(System.in);
        String typeAnimal = scanner.next();

        Animal animal = new Animal(typeAnimal, nameAnimal);

        System.out.println("Введіть до якої персони потрібно додати тваринку");
        scanner = new Scanner(System.in);
        String scanName = scanner.next();

        Iterator<Entry<Person, List<Animal>>> iterator = zooClubMembers.entrySet().iterator();

        while (iterator.hasNext()) {
            Entry<Person, List<Animal>> next = iterator.next();
            if (next.getKey().getNamePerson().equals(scanName)) {
                List<Animal> value = next.getValue();
                value.add(animal);
                next.setValue(value);
            }
        }
        System.out.println(zooClubMembers);

    }

    public void removeAnimalClubMember() {
        System.out.println("Введіть тваринку яку ви хочете видалити");
        Scanner scanner = new Scanner(System.in);
        String scanName = scanner.next();

        System.out.println("Введіть номер тваринки яку хочете видалити");
        scanner = new Scanner(System.in);
        int scanInt = scanner.nextInt();

        Iterator<Entry<Person, List<Animal>>> iterator = zooClubMembers.entrySet().iterator();

        while (iterator.hasNext()) {
            Entry<Person, List<Animal>> next = iterator.next();
            if (next.getKey().getNamePerson().equals(scanName)) {
                List<Animal> value = next.getValue();
                value.remove(scanInt);
                next.setValue(value);
            }
        }
        System.out.println(zooClubMembers);

    }
    public void removeClubMember() {
        System.out.println("Введіть імя учасника клубу");
        Scanner scanner = new Scanner(System.in);
        String namePerson = scanner.next();
        Iterator<Entry<Person, List<Animal>>> iterator = zooClubMembers.entrySet().iterator();

        while (iterator.hasNext()) {
            Entry<Person, List<Animal>> next = iterator.next();
            if (next.getKey().getNamePerson().equals(namePerson)) {
                zooclub.zooClubMembers.remove(next.getKey());
            }
        }
    }

    public void removeAnimalFromAllClubMembers() {
        System.out.println("Ââåä³òü òèï òâàðèíêè ÿêó ïîòð³áíî âèäàëèòè");
        Scanner scanner = new Scanner(System.in);
        String typeAnimal = scanner.next();

        Iterator<Entry<Person, List<Animal>>> iteratorRunMap = zooClubMembers.entrySet().iterator();

        while (iteratorRunMap.hasNext()) {
            Entry<Person, List<Animal>> next = iteratorRunMap.next();
            List<Animal> valueOfAnmimalList = next.getValue();
            Iterator<Animal> iteratorRunAnimals = valueOfAnmimalList.iterator();
            while (iteratorRunAnimals.hasNext()) {
                Animal animalValue = iteratorRunAnimals.next();
                if (animalValue.getType().equalsIgnoreCase(typeAnimal)) {
                    iteratorRunAnimals.remove();
                }
            }

        }

    }
    public void showZooClub() {
        System.out.println(zooclub);
    }

    public void exit() {
        System.exit(0);
    }

    @Override
    public String toString() {
        return "ZooClub{" +
                "zooClubMembers=" + zooClubMembers +
                '}';
    }
}
