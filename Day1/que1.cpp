// 1. Check if a number is prime
// -Input: Integer n
// -Output: True if prime, False otherwise

#include <iostream>
using namespace std;

//Function for check prime or not
bool isPrime(int n) {
    if (n <= 1) //number must be > 1
        return false;

    for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0)
            return false;
    }
    return true;
}

int main() {
    int n;
    //Take inpur from user
    cout << "Enter a number: ";
    cin >> n;

    //Check: Function 'isPrime' return true or false
    if (isPrime(n))
        cout << "True (Number is Prime)";
    else
        cout << "False (Number is Not Prime)";

}