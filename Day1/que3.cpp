// 3. Calculate factorial of a number
//  Input: Integer n
//  Output: n! (e.g., 5! = 120)


#include <iostream>
using namespace std;

// Function to calculate factorial
double Factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
        fact = fact * i;
    }
    return fact;
}

int main() {
    int n;
    //Take input from user
    cout << "Enter a number: ";
    cin >> n;

    //Check: Number is negitive or not
    if (n < 0)
        cout << "We can't find factorial of a negative number.";
    else
        cout << "Factorial of " << n << " is: " << Factorial(n);

}
