package Zad4;

import java.util.Objects;
import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Dodawanie\n" +
                "2. Odejmowanie\n" +
                "3. Mnożenie\n" +
                "4. Dzielenie");
        String choseOperation;
        while (true){
            System.out.println("Number: ");
            choseOperation = scanner.nextLine();
            if((Objects.equals(choseOperation, "1")) || (Objects.equals(choseOperation, "2"))
                    || (Objects.equals(choseOperation, "3")) || (Objects.equals(choseOperation, "4"))){
                break;
            } else{
                System.out.println("Only numbers between 1 and 4: ");
                continue;
            }
        }
        double num1, num2;
        while(true){
            try{
                num1 = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e){
                System.out.println("Only integers");
            }
        }
        while(true){
            try{
                num2 = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e){
                System.out.println("Only integers");
            }
        }
        double operation;
        String operationName;
        switch (choseOperation){
            case  "1":
                operation = num1 + num2;
                operationName = "dodawania";
                message(operationName, operation, num1, num2);
                break;
            case  "2":
                operation = num1 - num2;
                operationName = "odejmowania";
                message(operationName, operation, num1, num2);
                break;
            case  "3":
                operation = num1 * num2;
                operationName = "mnożenia";
                message(operationName, operation, num1, num2);
                break;
            case  "4":
                try{
                    if(num2 == 0){
                        throw new ArithmeticException();
                    }
                    operation = num1 / num2;
                    operationName = "dzielenia";
                    message(operationName, operation, num1, num2);
                    break;
                } catch (ArithmeticException e){
                    System.out.println("Division by 0 is illegal");
                }
        }
    }

    public static void message(String operationName, double operation, double num1, double num2){
        System.out.printf("Wynik %s na liczbach ‘%.2f’ oraz ‘%.2f’ wynosi ‘%.2f’",operationName, num1, num2, operation);
    }
}
