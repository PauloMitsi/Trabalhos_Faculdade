#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <iostream>

typedef struct lista
{
    int v;
    struct lista *prev;
    struct lista *next;
} Lista;

void imprimir(Lista *aux)
{

    printf("=============================\n");
    do
    {
        printf("%d\n", aux->v);
        aux = aux->next;
    } while (aux != NULL);
    printf("=============================\n");
}

Lista *insertBegin(Lista *l, int v)
{
    Lista *element;
    Lista *aux = l;
    element = (Lista *)malloc(sizeof(Lista));
    element->prev = NULL;
    element->next = NULL;
    element->v = v;

    if (l == NULL)
    {
        return element;
    }

    aux->prev = element;
    element->next = aux;
    return element;
}

Lista *insertEnd(Lista *l, int v)
{
    Lista *element;
    Lista *aux = l;

    element = (Lista *)malloc(sizeof(Lista));
    element->prev = NULL;
    element->next = NULL;
    element->v = v;

    // initiate list
    if (l == NULL)
    {
        return element;
    }
    // insert element
    else
    {
        while (aux->next != NULL)
        {
            aux = aux->next;
        }

        aux->next = element;
        element->prev = aux;
        return l;
    }
}

Lista *remove(Lista *l, int v)
{
    lista *aux = l;

    while (aux != NULL && aux->v != v)
    {
        aux = aux->next;
    }

    if (aux == NULL)
    {
        printf("Value \"%d\" not found\n", v);
        return l;
    }
    else if (aux->prev == NULL)
    {
        printf("Value \"%d\" removed\n", v);
        aux->next->prev = NULL;
        l = aux->next;
        free(aux);
        return l;
    }
    else if (aux->next == NULL)
    {

        printf("Value \"%d\" removed\n", v);

        aux->prev->next = NULL;
        free(aux);
        return l;
    }
    else
    {

        printf("Value \"%d\" removed\n", v);

        aux->prev->next = aux->next;
        aux->next->prev = aux->prev;

        free(aux);
        return l;
    }
}

Lista *InsertGreaterInBegin(Lista *l)
{
    Lista *aux = l;
    int maior = 0;

    while (aux != NULL && maior != aux->v)
    {
        maior = aux->v;
        aux = aux->next;
    }

    l = remove(l, maior);
    l = insertBegin(l, maior);
    return l;
}

int main(int argc, char const *argv[])
{
    Lista *l = NULL;

    l = insertEnd(l, 1);
    l = insertEnd(l, 2);
    l = insertBegin(l, 3);
    l = insertBegin(l, 21);
    l = insertEnd(l, 212);

    imprimir(l);

   // l = remove(l, 21);

    l = InsertGreaterInBegin(l);
    imprimir(l);

    return 0;
}
