import java.util.Scanner;

public class CodingChallenge {
    static int reverseNumber(int n) {
        int rev = 0;

        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10; //Multiplying and dividing by 10 automatically ignore leading zeros
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int rev = reverseNumber(n);
        System.out.println("Reversed number: " + rev);

        sc.close();
    }
}
