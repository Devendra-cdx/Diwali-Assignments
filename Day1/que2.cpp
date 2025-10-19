// 2. Generate all prime numbers up to n
//     Input: Integer n
//     Output: List of primes ≤ n

#include <iostream>
using namespace std;

// Function to check if a number is prime
bool isPrime(int num) {
    if (num <= 1)
        return false;
    for (int i = 2; i <= num / 2; i++) {
        if (num % i == 0)
            return false;
    }
    return true;
}

int main() {
    int n;
    //take value of n from user
    cout << "Enter a number: ";
    cin >> n;

    cout << "Prime numbers up to " << n << " are: ";

    //Print all prime numbers up to n
    for (int i = 2; i <= n; i++) {
        if (isPrime(i))
            cout << i << " ";
    }

}
