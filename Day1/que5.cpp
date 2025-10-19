// 5. Check if a number is even or odd
//     Input: Integer n
//     Output: "Even" or "Odd"

#include <iostream>
using namespace std;

// Function to check if a number is even
bool isEven(int n) {
    return n % 2 == 0;
}

int main() {
    int n;
    cout << "Enter a number: ";
    cin >> n;

    if (isEven(n))
        cout << n << " is Even";
    else
        cout << n << " is Odd";

    return 0;
}
