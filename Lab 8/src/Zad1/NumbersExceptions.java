package Zad1;
import java.util.*;

public class NumbersExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        while(true){
            System.out.print("Input first number: ");
            String a = scanner.nextLine();
            System.out.print("Input second number: ");
            String b = scanner.nextLine();
            try {
                num1 = Integer.parseInt(a);
                num2 = Integer.parseInt(b);
                break;
            } catch (NumberFormatException e){
                System.out.printf("Error: %s\n", e.getMessage());
            }
        }
        String operation;
        String operationsList[] = {"+", "-", "/", "*"};
        while (true){
            System.out.print("Input operation: ");
            String sign = scanner.nextLine();
            if (Arrays.asList(operationsList).contains(sign)){
                operation = sign;
                break;
            } else {
                System.out.println("Wrong sign, try again");
            }
        }
        switch (operation){
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                try{
                    System.out.println(num1 / num2);
                } catch (ArithmeticException e){
                    System.out.printf("Cannot divide %s\n", e.getMessage());
                }
                break;
        }
    }
}
