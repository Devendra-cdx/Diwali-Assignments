import java.util.Scanner;

public class NumberOperationsMenu {

    // 1. Sum of first n even numbers
    static int sumOfEven(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 2 * i;
        }
        return sum;
    }

    // 2. Sum of first n odd numbers
    static int sumOfOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 2 * i - 1;
        }
        return sum;
    }

    // 3. Check if a number is a palindrome
    static boolean isPalindrome(int n) {
        int org = n, rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return org == rev;
    }

    // 4. Check if a number is an Armstrong number
    static boolean isArmstrong(int n) {
        int org = n;
        int size = String.valueOf(n).length();
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, size);
            n /= 10;
        }

        return org == sum;
    }

    // 5. Reverse a number
    static int reverseNumber(int n) {
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--------------- MENU ---------------");
            System.out.println("1. Sum of first n even numbers");
            System.out.println("2. Sum of first n odd numbers");
            System.out.println("3. Check if a number is a palindrome");
            System.out.println("4. Check if a number is an Armstrong number");
            System.out.println("5. Reverse a number");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("--------------------------------------------------");
                    System.out.print("Enter value of n: ");
                    int n1 = sc.nextInt();
                    System.out.println("Sum of first " + n1 + " even numbers: " + sumOfEven(n1));
                    System.out.println("--------------------------------------------------");
                    break;
                }

                case 2 -> {

                    System.out.println("--------------------------------------------------");
                    System.out.print("Enter value of n: ");
                    int n2 = sc.nextInt();
                    System.out.println("Sum of first " + n2 + " odd numbers: " + sumOfOdd(n2));
                    System.out.println("--------------------------------------------------");
                    break;
                }

                case 3 -> {

                    System.out.println("--------------------------------------------------");
                    System.out.print("Enter a number: ");
                    int p = sc.nextInt();
                    System.out.println(p + " is Palindrome: " + isPalindrome(p));
                    System.out.println("--------------------------------------------------");
                    break;
                }

                case 4 -> {

                    System.out.println("--------------------------------------------------");
                    System.out.print("Enter number: ");
                    int a = sc.nextInt();
                    System.out.println(a + " is Armstrong: " + isArmstrong(a));
                    System.out.println("--------------------------------------------------");
                    break;
                }

                case 5 -> {

                    System.out.println("--------------------------------------------------");
                    System.out.print("Enter number: ");
                    int r = sc.nextInt();
                    System.out.println("Reversed number: " + reverseNumber(r));
                    System.out.println("--------------------------------------------------");
                    break;
                }

                case 6 -> {

                    System.out.println("--------------------------------------------------");
                    System.out.println("Thankyou for choosing us...");
                    System.out.println("--------------------------------------------------");
                    break;
                }

                default -> {

                    System.out.println("--------------------------------------------------");
                    System.out.println("Invalid choice! Please try again.");
                    System.out.println("--------------------------------------------------");
                }
            }
        } while (choice != 6);

        sc.close();
    }
}