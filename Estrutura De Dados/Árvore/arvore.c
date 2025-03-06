#include <stdio.h>
#include <stdlib.h>

typedef struct tree
{
    int v;
    struct tree *l;
    struct tree *r;
} Tree;

Tree *newNode(int inf)
{
    Tree *t = (Tree *)malloc(sizeof(Tree));

    t->v = inf;
    t->r = NULL;
    t->l = NULL;

    return t;
}

void imprimeArv(Tree *t)
{
}

void imprime_Pre(Tree *t)
{

    if (t == NULL)
        return;

    printf("[%d]", t->v);
    imprime_Pre(t->l);
    imprime_Pre(t->r);
}

void imprime_Pos(Tree *t)
{

    if (t == NULL)
        return;

    imprime_Pos(t->l);
    imprime_Pos(t->r);
    printf("[%d]", t->v);
}

void imprime_Ord(Tree *t)
{

    if (t == NULL)
        return;

    imprime_Ord(t->l);
    printf("[%d]", t->v);
    imprime_Ord(t->r);
}

int retornaMaior(Tree *t)
{
    if (!(t->r == NULL && t->l == NULL))
        return t->v;

    int a = retornaMaior(t->r);
    int b = retornaMaior(t->l);

    printf("a: %d , b: %d", a, b);
}

Tree *insBinTree(Tree *t, int f)
{

    if (!(t->r != NULL && t->l != NULL))
    {
        if (t->v < f)
        {
            return insBinTree(t->r, f);
        }
        else
        {
            return insBinTree(t->l, f);
        }
    }
    else
    {
        t = newNode(f);
    }
}
/*
                1
            2       7
          3   4          8
         5 6               9
*/
int main(int argc, char const *argv[])
{

    Tree *t = newNode(1);

    t->l = newNode(2);
    t->l->l = newNode(3);
    t->l->r = newNode(4);
    t->l->r->l = newNode(5);
    t->l->r->r = newNode(6);
    t->r = newNode(7);
    t->r->r = newNode(8);
    t->r->r->l = newNode(9);
    imprime_Pre(t);
    printf("^Pre-order^\n");
    imprime_Ord(t);
    printf("^Order-Simetric^\n");
    imprime_Pos(t);
    printf("^Pos-order^\n");
    printf("\n");

    printf("%d", retornaMaior(t));
    return 0;
}
