#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <iostream>

typedef struct lista
{
    int plane;
    struct lista *next;
} Lista;

typedef struct
{
    Lista *first;
    Lista *last;
} Fila;

typedef struct
{
    Lista *first;
    Lista *last;
} FilaNorth;

typedef struct
{
    Lista *first;
    Lista *last;
} FilaSouth;

typedef struct
{
    Lista *first;
    Lista *last;
} FilaWest;

typedef struct
{
    Lista *first;
    Lista *last;
} FilaEast;

void enqueue(Fila *f, int p)
{
    Lista *l = (Lista *)malloc(sizeof(Lista));
    l->next = NULL;
    l->plane = p;

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

// -1 west -> -3 north -> -2 south -> -4 east
int main(int argc, char const *argv[])
{

    Fila *f = (Fila *)malloc(sizeof(Fila));
    f->first = NULL;
    f->last = NULL;
    
    FilaNorth *fN = (FilaNorth *)malloc(sizeof(FilaNorth));
    fN->first = NULL;
    fN->last = NULL;

    FilaSouth *fS = (FilaSouth *)malloc(sizeof(FilaSouth));
    FilaWest *fW = (FilaWest *)malloc(sizeof(FilaWest));
    FilaEast *fE = (FilaEast *)malloc(sizeof(FilaEast));


    printf("%d", f->first->plane);
    printf("%d", f->last->plane);
    return 0;
}
