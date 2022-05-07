package Zad2;

public class ExceptionThrowingCompetition {
    public static void main(String[] args) {
        try{
            throwException();
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public static void throwException() throws RuntimeException{
        throw new RuntimeException("Runtime Error");
    }
}
