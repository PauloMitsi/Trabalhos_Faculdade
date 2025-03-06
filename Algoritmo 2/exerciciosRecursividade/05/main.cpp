#include <iostream>

using namespace std;

int Valores[5] = { 500, 12, 61, 31, 80 };


int MaiorNumero(int n)
{
    if (n == 0)
    {
        return Valores[n];
    }
    else
    {
        int x = MaiorNumero(n - 1);
        if (Valores[n] > x)
        {
            return Valores[n];
        }
        else
        {
            return x;
        }
    }
}

int main()
{
    printf("%d", MaiorNumero(4));
    return 0;
}
