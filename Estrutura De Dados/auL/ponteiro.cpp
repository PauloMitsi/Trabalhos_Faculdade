#include <iostream>

void Realocar(int *p, int tamanho)
{
    p = (int *)realloc(p, sizeof(int) * tamanho);
}

int main(int argc, char const *argv[])
{

    // Alocando um vetor de tamanho 5
    int *p = (int *)malloc(5 * sizeof(int));
    printf("%d\n", sizeof(p));
    printf("%p\n", p);

    // Realocando um vetor para o tamanho 8
    // p = (int *)realloc(p, 8 * sizeof(int));
    Realocar(p, 8);

    printf("%d\n", sizeof(p));
    printf("%p\n", p);

    return 0;
}
