package Zad3;

import java.io.IOException;

public class IOExceptionThrowing {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Koniec programu");
        }
    }

    public static void throwException() throws CustomIOException {
        throw new CustomIOException();
    }
}
