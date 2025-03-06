// Algorithm created by Paulo Mitsi
// The main purpose of this code is calculate the purchasing power lost and show to the user.

#include <iostream>

using namespace std;

//Function responsible for read what user inputs and return it to a variable
double NumberRead()
{
    //local variable
    double n;

    //reading the number of what user input
    printf("\nInsert the salary: ");
    scanf("%lf", &n);

    //returning the variable
    return n;
}

//Calculation the purchasing power based in inflation
double PurchasingPowerLost(double salary)
{
    return salary*(10.67/100);
}

//Calculation of salary based in purchasing power lost.
double SalaryReadjustment(double salary)
{
    return salary + PurchasingPowerLost(salary);
}

int main()
{
    // reading the salary and with it calculate other variables.
    double salary = NumberRead();
    double purchasingPowerLost = PurchasingPowerLost(salary);
    double newSalary = SalaryReadjustment(salary);

    //Showing to the user the informations.
    printf("The person who earned R$%.2lf in 2015, should be earn R$%.2lf in 2016."
           "\nDue the inflation, he has lost of R$%.2lf of purchasing power.\n",salary, newSalary, purchasingPowerLost);

    return 0;
}
