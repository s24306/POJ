package Zad4;

public class Person {
    private String name;
    private String surname;
    private int dob;

    public Person(String name, String surname, int dob){
        try {
            checkPersonData(name, surname, dob);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        this.name = name;
        this.surname = surname;
        this.dob = dob;
    }

    public void checkPersonData(String name, String surname, int dob) throws Exception{
        if (name == ""){
            throw new Exception("Name is invalid!");
        }
        if (surname == ""){
            throw new Exception("Surname is invalid!");
        }
        if ((dob < 1900) || (2020 < dob)){
            throw new Exception("Date of birth is invalid!");
        }
    }

    @Override
    public String toString() {
        return name + ", " + surname + ", " + dob + ".";
    }
}
