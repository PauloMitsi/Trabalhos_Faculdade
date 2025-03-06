#include <iostream>

using namespace std;

void ler(int *a)
{
    printf("\nDigite o ano:");
    scanf("%d",a);
}

void calcular(int *b,int *c)
{
    *b = 2022 - *c;
}

void apresentar(int *d)
{
    printf("\nIdade: %d",*d);
}

int main(int argc, char** argv)
{
    int *ano, *idade;
    ano = (int*)malloc(sizeof(int));
    idade = (int*)malloc(sizeof(int));
    ler(ano);
    calcular(idade, ano);
    apresentar(idade);
    return 0;
}



