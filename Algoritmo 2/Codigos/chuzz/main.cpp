#include <iostream>

using namespace std;

void recursividade(int n)
{
    if(n >= 1)
    {

        recursividade(n-1);

        if(n%2 == 0)
        {
            printf("%d par\n", n);
        }
        else
        {
            printf("%d impar\n", n);
        }
    }

}

void meuWhile()
{

    int a;
    printf("\nMenu:");
    printf("\n1-Dizer oi");
    printf("\nOutro número para sair\n");
    scanf("%d",&a);
    if(a != 1)
    {
        meuWhile();
    }
}

int main()
{
    // recursividade(5);

    meuWhile();
    printf("\nOi");

    return 0;
}
