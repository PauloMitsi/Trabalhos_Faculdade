// Algorithm created by Paulo Mitsi
// The main purpose of this code is to convert celcius to fahrenheit.

#include <iostream>

using namespace std;

//Function responsible for read what user inputs and return it to a variable
double NumberRead()
{
    //local variable
    double n;

    //reading the number of what user input
    printf("Insert the temperature in celcius: ");
    scanf("%lf", &n);

    //returning the variable
    return n;
}

//Converting the temperature to fahrenheit
double ToFahrenhiet(double temp)
{
    return (9*temp/5)+32;
}

int main()
{

// reading the temeperature and inserting in the variables.
    double celcius = NumberRead();
    double fahrenheit = ToFahrenhiet(celcius);

    printf("%.2lf Degrees Fahrenheit",fahrenheit);

    return 0;
}
