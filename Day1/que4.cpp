// 4. Generate Fibonacci series up to n terms
//     Input: Integer n
//     Output: First n Fibonacci numbers

#include <iostream>
using namespace std;

//Function to generate Fibonacci Series
void Fibonacci(int n) {
    int a = 0, b = 1, c;

    cout << "Fibonacci series up to " << n << " terms: ";

    for (int i = 1; i <= n; i++) {
        cout << a << " ";
        c = a + b;
        a = b;
        b = c;
    }
}

int main() {
    int n;
    //Take input from user
    cout << "Enter number of terms: ";
    cin >> n;

    if (n <= 0) //Number must be positive and > 0
        cout << "Please enter a positive number.";
    else
        Fibonacci(n); //Function call

}
