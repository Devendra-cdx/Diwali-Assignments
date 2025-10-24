package test;

import java.util.Scanner;

import study.Calculator;
import study.WrongOperatorException;

public class TestCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("\n---------- CALCULATOR MENU ----------");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulus (%)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 6) {
                System.out.println("Goodbye!......");
                break;
            }

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            String op = "";
            switch (choice) {
                case 1: op = "+"; break;
                case 2: op = "-"; break;
                case 3: op = "*"; break;
                case 4: op = "/"; break;
                case 5: op = "%"; break;
                default:
                	System.out.println("--------------------------------------------");
                    System.out.println("Invalid choice!");
                    System.out.println("--------------------------------------------");
                    continue;
            }

            try {
                int result = Calculator.calculate(num1, num2, op);
                System.out.println("--------------------------------------------");
                System.out.println("Result: " + result);
                System.out.println("--------------------------------------------");
            } catch (WrongOperatorException | ArithmeticException e) {
            	System.out.println("--------------------------------------------");
                System.out.println("Error: " + e.getMessage());
                System.out.println("--------------------------------------------");
            }
        }

        sc.close();


	}

}
