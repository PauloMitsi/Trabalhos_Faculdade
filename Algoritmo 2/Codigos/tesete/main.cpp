#include <iostream>

using namespace std;

struct No
{
    int valor;
    No *p;
};

int main()
{

    No *inicio;
    inicio = (No*)malloc(sizeof(No));

    inicio->valor = 10;

    inicio->p = (No*)malloc(sizeof(No));
    printf("%d", inicio->valor);

    return 0;
}
