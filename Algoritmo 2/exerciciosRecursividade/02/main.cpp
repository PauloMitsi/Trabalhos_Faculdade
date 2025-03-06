#include <iostream>

using namespace std;

double Factorial(int i)
{
    if (i == 1)
    {
        return 1;
    }
    else
    {
        return Factorial(i - 1) * i;
    }
}

int main()
{
    double n, f;
    printf("\nType a number: ");
    scanf("%lf", &n);

    f = Factorial(n);
    printf("%.0lf! = %.0lf", n, f);
    return 0;
}
