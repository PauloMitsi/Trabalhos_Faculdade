#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <iostream>

typedef struct list
{
    int v;
    struct list *next;
} List;

struct Stack
{
    List *top;
}; // Em uma lista encadeada simples, inicio da lista é o topo da stack,

void imprimir(Stack *s)
{
    List *aux = s->top;
    while (aux != NULL)
    {
        printf("%d", aux->v);
        aux = aux->next;
    }
}

void push(Stack *s, int v)
{
    List *l = (List *)malloc(sizeof(List));
    l->next = NULL;
    l->v = v;

    if (s->top == NULL)
    {
        s->top = l;
    }
    else
    {
        l->next = s->top;
        s->top = l;
    }
}

void pop(Stack *s)
{
    List *aux = s->top;
    s->top = s->top->next;
    free(aux);
}

void removePares(Stack *s)
{
    Stack *listaPar = (Stack *)malloc(sizeof(Stack));
    listaPar->top = NULL;
    while (s->top != NULL)
    {
        if (s->top->v % 2 == 0)
        {
            push(listaPar, s->top->v);
        }
        pop(s);
    }

    s->top = listaPar->top;
}

int main(int argc, char const *argv[])
{
    Stack *s = (Stack *)malloc(sizeof(Stack));
    s->top = NULL;

    for (int i = 0; i < 5; i++)
    {
        push(s, i);
    }

    imprimir(s);
    printf("====");
    removePares(s);
    imprimir(s);
    printf("====");
    removePares(s);
    imprimir(s);

    return 0;
}
