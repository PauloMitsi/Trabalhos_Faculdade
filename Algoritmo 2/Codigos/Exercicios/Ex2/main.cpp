// Algorithm created by Paulo Mitsi
// The main purpose of this code is to read two number input by user and tell which one is greater.

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

//Comparing two numbers and returning the greatest of them
int ComparisionOf(int n1, int n2)
{
    //local variable
    int greaterNumber;

    //comparing the numbers
    if (n1 < n2) {
        greaterNumber = n2;
    }
    else {
        greaterNumber = n1;
    }

    //returning the greatest number
    return greaterNumber;
}

int main()
{

    // reading the numbers and inserting in the variables.
    int firstNumber = NumberRead();
    int secondNumber = NumberRead();
    int gretestNumber = ComparisionOf(firstNumber, secondNumber);

    //telling the user the outcome
    printf("\n%d is the greatest number", gretestNumber);

    return 0;
}
