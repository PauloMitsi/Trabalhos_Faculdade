#include <iostream>

using namespace std;

int Valores[5] = { 0, 1, 0, 3, 8 };

int ContaValores(int n)
{
    if (n == -1)
    {
        return 0;
    }
    else
    {
        int x = ContaValores(n - 1);
        if (Valores[n] >= 3 && Valores[n] <= 8)
        {
            return x + 1;
        }
        else
        {
            return x;
        }
    }
}

int main()
{
    printf("%d", ContaValores(4));
    return 0;
}
