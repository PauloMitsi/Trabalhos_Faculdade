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
    printf("Insert the temperature in Fahrenheit: ");
    scanf("%lf", &n);

    //returning the variable
    return n;
}

//Converting the temperature to fahrenheit
double ToFahrenhiet(double temp)
{
    return (9 * temp / 5) + 32;
}

//Converting the temperature to Celcius
double ToCelcius(double temp)
{
    return 5 * (temp - 32) / 9;
}

int main()
{

    // reading the temperature and inserting in the variables.

    double fahrenheit = NumberRead();
    double celcius = ToCelcius(fahrenheit);

    printf("\n%.2lf Degrees Celcius", celcius);
    printf("\n%.2lf Degrees Fahrenheit", fahrenheit);

    return 0;
}
