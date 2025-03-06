#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct lista
{
    char simb;
    struct lista *next;
} Lista;

typedef struct stack
{
    Lista *top;
} Stack;

void push(Stack *p, char c)
{
    Lista *l = (Lista *)malloc(sizeof(Lista));
    l->simb = c;

    l->next = p->top;
    p->top = l;
}

void pop(Stack *p)
{
    Lista *aux = p->top->next;
    free(p->top);
    p->top = aux;
};

int contaDiamantes(Stack *s)
{
    int diamantes = 0;
    int abriu = 0;
    while (s->top != NULL)
    {
        if (s->top->simb == '>')
        {
            abriu++;
        }
        else if (s->top->simb == '<' && abriu > 0)
        {
            abriu--;
            diamantes++;
        }
        pop(s);
    }
    return diamantes;
};

int main(int argc, char const *argv[])
{
    Stack *p = (Stack *)malloc(sizeof(Stack));
    p->top = NULL;

    char a[1000];
    int qtd = 0;
    scanf("%d", &qtd);

    for (int i = 0; i < qtd; i++)
    {
        scanf("%s", &a);

        char aux = ' ';
        int i = 0;
        while (aux != '\0')
        {
            push(p, a[i]);
            i++;
            aux = a[i];
        }
        printf("%d\n", contaDiamantes(p));
    }

    return 0;
}
