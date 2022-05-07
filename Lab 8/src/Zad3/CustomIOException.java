package Zad3;

import java.io.IOException;

public class CustomIOException extends IOException {
    @Override
    public String getMessage() {
        return "You got (1) new IO Exception.";
    }
}
