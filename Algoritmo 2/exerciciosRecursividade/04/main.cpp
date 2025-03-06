#include <iostream>

using namespace std;

int Valores[5] = { 1, 2, 1, 3, 8 };

int ContaPares(int n)
{
    if (n == -1)
    {
        return 0;
    }
    else
    {

        int x = ContaPares(n - 1);
        if (Valores[n] % 2 == 0)
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
    printf("%d", ContaPares(4));
    return 0;
}
