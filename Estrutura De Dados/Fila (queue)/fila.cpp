#include <stdio.h>
#include <string.h>
 
#include <iostream>

typedef struct lista
{
    int v;
    struct lista *next;

} Lista;

typedef struct
{
    Lista *first;
    Lista *last;
} Fila;


void insert(Fila *f, int v)
{
    Lista *l = (Lista *)malloc(sizeof(Lista));
    l->v = v;
    l->next = NULL;

    if (f->first == NULL)
    {
        f->first = l;
        f->last = l;
    }
    else
    {
        f->last->next = l;
        f->last = l;
    }
}

void removeFila(Fila *f)
{
    Lista *auxL = f->first;

    if (f->first != NULL)
    {
        f->first = auxL->next;
        free(auxL);
    }

    if (f->first == NULL)
    {
        f->last = NULL;
    }
}

void imprimir(Fila *f)
{
    Lista *auxF = f->first;
    while (auxF != NULL)
    {
        printf("[%d]", auxF->v);
        auxF = auxF->next;
    }
    printf("\n");
}

int main(int argc, char const *argv[])
{

    Fila *f = (Fila *)malloc(sizeof(Fila));

    f->first = NULL;
    f->last = NULL;

    for (int i = 0; i < 10; i++)
    {
        insert(f, i);
    }

    imprimir(f);
   
    removeFila(f);

    imprimir(f);

    return 0;
}
