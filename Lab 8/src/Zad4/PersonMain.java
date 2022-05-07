package Zad4;
import java.util.*;

public class PersonMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Surname: ");
            String surname = scanner.nextLine();
            System.out.println("dob: ");
            int dob = Integer.parseInt(scanner.nextLine());
            try {
                Person p = new Person(name, surname, dob);
                break;
            } catch (ExceptionInInitializerError e){
                System.out.println(e.getMessage());
            }
        }
    }
}
