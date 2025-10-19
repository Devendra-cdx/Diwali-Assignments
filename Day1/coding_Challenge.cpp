// 1. You are given an array of strings. 
// Your task is to determine the length of the
// longest string in the array.

#include <iostream>
#include <string>
using namespace std;

// Function to find length of longest string
int maxStringLen(string arr[], int n) {
    int maxLength = 0;
    for (int i = 0; i < n; i++) {
        if (arr[i].length() > maxLength)
            maxLength = arr[i].length();
    }
    return maxLength;
}

int main() {
    string arr[] = {"hello", "how", "elephant", "Mango", "Tomato"};
    int n = sizeof(arr) / sizeof(arr[0]);  // Calculate number of elements

    int maxLen = maxStringLen(arr, n);
    cout << "Length of the longest string is: " << maxLen << endl;

    return 0;
}
