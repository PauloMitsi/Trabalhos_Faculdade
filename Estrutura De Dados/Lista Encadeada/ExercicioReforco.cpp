#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <iostream>

typedef struct lista
{
    int v;
    struct lista *next;
} Lista;

Lista *insertBegin(Lista *l, int v)
{

    Lista *nL = (Lista *)malloc(sizeof(Lista));
    nL->v = v;
    nL->next = l;

    l = nL;
    return l;
}

void imprimir(Lista *aux)
{
    printf("=============================\n");
    while (aux != NULL)
    {
        printf("%d\n", aux->v);
        aux = aux->next;
    }
    printf("=============================\n");
}

Lista *insertEnd(Lista *aux, int v)
{
    if (aux == NULL)
    {
        Lista *l = (Lista *)malloc(sizeof(Lista));

        l->v = v;
        l->next = NULL;

        return l;
    }
    else
    {
        Lista *l;
        l = aux;
        while (l->next != NULL)
        {
            l = l->next;
        }
        l->next = (Lista *)malloc(sizeof(Lista));
        l->next->v = v;
        l->next->next = NULL;
        return aux;
    }
}

Lista *remove(Lista *l, int v)
{
    Lista *lPrev = NULL, *aux = NULL, *lNext = NULL;

    aux = l;

    while (aux->v != v)
    {
        try
        {
            lPrev = aux;
            aux = aux->next;

            if (aux == NULL)
            {
                throw v;
            }

            lNext = aux->next;
        }
        catch (int n)
        {
            printf("Value \"%d\" not found\n", n);
            return l;
        }
    }

    if (lPrev == NULL)
    {
        printf("Value \"%d\" removed\n", v);

        return aux->next;
    }

    else
    {
        free(aux);
        lPrev->next = lNext;
        printf("Value \"%d\" removed\n", v);
        return l;
    }
}

Lista *InsertGreaterInBegin(Lista *l)
{

    Lista *aux = l, *auxMaior = NULL;
    int maior = 0;

    while (aux != NULL)
    {
        if (aux->v > maior)
        {
            maior = aux->v;
            auxMaior = aux;
        }

        aux = aux->next;
    }

    l = remove(l, maior);
    l = insertBegin(l, maior);

    return l;
}

int main(int argc, char const *argv[])
{

    Lista *l = NULL;

    l = insertEnd(l, 6);
    l = insertEnd(l, 2);
    l = insertEnd(l, 10);
    l = insertEnd(l, 4);
    l = insertEnd(l, 8);
    l = insertEnd(l, 10);

    imprimir(l);

    l = InsertGreaterInBegin(l);

    imprimir(l);

    return 0;
}
