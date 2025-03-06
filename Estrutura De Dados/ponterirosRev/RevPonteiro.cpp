#include <iostream>

using namespace std;

void printNumbersIn(int *prt)
{
    prt - 10;
    printf("%p\n", prt);
    for (int i = 0; i < 10; i++)
    {

        printf("v[%d] = %d\n", i, *prt);
        prt++;
    }
}

int main()
{
    int v[10]; 
    int *p = (int)calloc(10, sizeof(int)); 

    p = v; // p = &v[0]

    printf("%p\n", p);
    printf("%p\n", v);

    for (int i = 0; i < 10; i++)
    {
        // printf("v[%d] =", i);
        // scanf("%d", p);
        p++;
    }

    printf("%p\n", p);
    printf("%p\n", v);

    printNumbersIn(p);

    return 0;
}
