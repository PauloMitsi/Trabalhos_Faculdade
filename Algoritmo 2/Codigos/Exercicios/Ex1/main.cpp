// Algorithm created by Paulo Mitsi
// The main purpose of this code is to read a number that user inputs and tell if the number is odd or even.

#include <iostream>

using namespace std;

//Function responsible for read what user inputs and return it to a variable
int NumberRead()
{
    //local variable
    int n;

    //reading the number of what user input
    printf("Insert a number: ");
    scanf("%d", &n);

    //returning the variable
    return n;
}

//Comparing if the number is odd or even
bool IsEven(int n)
{
    //variable
    bool result;

    //comparing the number
    if (n % 2 == 0) {
        result = true;
    }
    else {
        result = false;
    }

    //returning the variable
    return result;
}


int main()
{
    //reading the variables through functions
    int number = NumberRead();
    bool isTheNumberEven = IsEven(number);

    //telling to user the outcome
    if (isTheNumberEven == true) {
        printf("\nThe number %d is even", number);
    }
    else {
        printf("\nThe number %d is odd", number);
    }

    return 0;
}
