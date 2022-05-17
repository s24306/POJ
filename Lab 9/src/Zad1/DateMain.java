package Zad1;
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please choose date format:\n" +
                "1. yyyy-MM-dd\n" +
                "2. dd-MM-yyyy\n" +
                "3. dd-MM-yyyy HH:mm:ss\n" +
                "4. yyyy-MM-dd HH:mm:ss\n");
        int option = scanner.nextInt();
        String format ="";
        while(format.isEmpty()){
            switch (option){
                case 1:
                    format = "yyyy-MM-dd";
                    break;
                case 2:
                    format = "dd-MM-yyyy";
                    break;
                case 3:
                    format = "dd-MM-yyyy HH:mm:ss";
                    break;
                case 4:
                    format = "yyyy-MM-dd HH:mm:ss";
                    break;
                default:
                    System.out.println("Please pick an option between 1 and 4");
                    break;
            }
        }

        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern(format);
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("The date is: " + formattedDate);
    }
}
