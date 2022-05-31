package Zad3;
import java.util.*;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("Dawid", "Hoffmeister");
        Person person2 = new Person("Maksymilian", "Wolański");
        Person person7 = new Person("Dawid", "Wolański");
        Person person3 = new Person("Michał", "Majerowski");
        Person person4 = new Person("Jędrek", "Stańczewski");
        Person person5 = new Person("Piotr", "Dubiel");
        Person person6 = new Person("Michał", "Białek");
        List<Person> people = new ArrayList<Person>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        System.out.println(people);
        Collections.sort(people);
        System.out.println(people);
    }
}
