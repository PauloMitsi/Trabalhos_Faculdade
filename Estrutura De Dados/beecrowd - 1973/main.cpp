#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <iostream>

typedef struct farm
{
    int v;
    struct farm *next;
    struct farm *prev;
} Farm;

void imprimir(Farm *f)
{
    while (f != NULL)
    {
        printf("[%d] ", f->v);
        f = f->next;
    }
}

Farm *insert(Farm *f, int n)
{
    Farm *aux = f;
    Farm *nF = (Farm *)malloc(sizeof(Farm));
    nF->prev = NULL;
    nF->next = NULL;

    if (f == NULL)
    {
        nF->v = n;
        return nF;
    }

    while (aux->next != NULL)
    {
        aux = aux->next;
    }

    nF->v = n;
    nF->prev = f;
    aux->next = nF;
    return f;
}

Farm *createFarm(int n)
{
    int sheepStoled = 0;
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &sheepStoled);
    }
    return NULL;
}

int main(int argc, char const *argv[])
{

    Farm *f = NULL;

    imprimir(f);

    return 0;
}
