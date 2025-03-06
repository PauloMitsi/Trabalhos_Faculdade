#include <iostream>

using namespace std;

int soma(int i)
{
    if (i == 1)
    {
        return 1;
    }
    else
    {
        return soma(i - 1) + i;
    }
}

int main()
{
    int n;
    printf("Type a number: ");
    scanf("%d", &n);

    int retSoma = soma(n);
    printf("%d", retSoma);

    return 0;
}
