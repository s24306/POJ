package Zad3;

public class Person implements Comparable<Person> {
    private String name, surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String toString(){
        return "{"+name+", "+surname+"}";
    }

    @Override
    public int compareTo(Person p) {
        int compared = surname.compareTo(p.getSurname());
        if(compared != 0){
            return -compared;
        } else {
            return -name.compareTo(p.getName());
        }
    }

}
