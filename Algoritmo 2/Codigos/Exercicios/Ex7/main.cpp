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
    printf("\nInsert the temperature: ");
    scanf("%lf", &n);

    //returning the variable
    return n;
}

//Menu to choose what the user want to do
int Menu()
{
    int optionChosen;

    //Showing at the console
    printf("\n1 - Convert Celcius to Fahrenheit"
           "\n2 - Convert Fahrenheit to Celcius"
           "\n0 - Quit"
           "\nChoose an Option: ");
    scanf("%d", &optionChosen);

    return optionChosen;
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
    int option = Menu();

    //Displaying the menu while the user dont choose to quit
    while(option != 0)
    {

        if(option == 1)//Converting celcius to fahrenheit
        {
            double celcius = NumberRead();
            double fahrenheit = ToFahrenhiet(celcius);

            printf("\n%.2lf Degrees celcius is %.2lf Degrees Fahrenheit\n", celcius, fahrenheit);
        }
        else if (option == 2)// converting fahrenheit to celcius
        {
            double fahrenheit = NumberRead();
            double celcius = ToCelcius(fahrenheit);

            printf("\n%.2lf Degrees Fahrenheit is %.2lf Degrees Celcius\n", fahrenheit, celcius);
        }

        option = Menu();
    }
    printf("\nClosing the program\n");
    return 0;
}
