#include <stdio.h>
#include <stdlib.h>

typedef struct lista
{
    int valor;
    struct lista *prox;
    struct lista *ant;
} ListaD;

ListaD *insereIni(ListaD *L, int info)
{
    ListaD *novo = (ListaD *)malloc(sizeof(ListaD));
    novo->valor = info;
    novo->prox = L;
    novo->ant = NULL;
    if (L != NULL)
        L->ant = novo;
    return novo;
}

ListaD *insereFim(ListaD *L, int info)
{
    ListaD *novo = (ListaD *)malloc(sizeof(ListaD));
    novo->valor = info;
    novo->prox = NULL;

    if (L == NULL)
    {
        novo->ant = NULL;
        return novo;
    }
    else
    {
        ListaD *aux = L;
        while (aux->prox != NULL)
        {
            aux = aux->prox;
        }
        novo->ant = aux;
        aux->prox = novo;
    }
    return L;
}

void imprime(ListaD *L)
{
    printf("Lista:\n");
    while (L != NULL)
    {
        printf("%d\n", L->valor);
        L = L->prox;
    }
}
ListaD *liberaLista(ListaD *L)
{
    ListaD *aux = L;
    while (L != NULL)
    {
        L = L->prox;
        free(aux);
        aux = L;
    }
    return NULL;
}

ListaD *trocaValores(ListaD *L, int M, int N)
{

    ListaD *aux = L;
    ListaD *listOriginal = L;

    ListaD *auxM = (ListaD *)malloc(sizeof(ListaD));
    auxM->valor = M;

    ListaD *auxN = (ListaD *)malloc(sizeof(ListaD));
    auxN->valor = N;

    int mExiste = 0;
    int nExiste = 0;

    while (aux != NULL)
    {

        if (aux->valor == M)
        {
            if (aux->ant == NULL)
            {
                auxN->ant = NULL;
                auxN->prox = aux->prox;
                aux->prox->ant = auxN;
                L = auxN;
            }
            else if (aux->prox == NULL)
            {
                aux->ant->prox = auxN;
                auxN->ant = aux->ant;
                auxN->prox = NULL;
            }
            else
            {
                aux->ant->prox = auxN;
                aux->prox->ant = auxN;
                auxN->ant = aux->ant;
                auxN->prox = aux->prox;
            }
            free(aux);
            aux = auxN;
            nExiste = 1;
        }
        else if (aux->valor == N)
        {
            if (aux->ant == NULL)
            {
                auxM->ant = NULL;
                auxM->prox = aux->prox;
                L = auxM;
            }
            else if (aux->prox == NULL)
            {

                aux->ant->prox = auxM;
                auxM->ant = aux->ant;
                auxM->prox = NULL;
            }
            else
            {
                aux->ant->prox = auxM;
                aux->prox->ant = auxM;
                auxM->ant = aux->ant;
                auxM->prox = aux->prox;
            }
            free(aux);
            aux = auxM;
            mExiste = 1;
        }
        aux = aux->prox;
    }
    if (mExiste == 1 && nExiste == 1)
    {
        return L;
    }
    else
    {
        printf("\n%d ou %d nao existe na lista\n", M, N);
        return listOriginal;
    }
}

int main(void)
{
    ListaD *L = NULL;
    // caso 1
    L = insereIni(L, 1);
    L = insereFim(L, 3);
    L = insereFim(L, 5);
    L = insereFim(L, 7);
    L = insereFim(L, 11);
    L = insereFim(L, 13);
    L = insereFim(L, 17);
    L = insereFim(L, 19);
    imprime(L);

    L = trocaValores(L, 11, 13);
    imprime(L);
    L = trocaValores(L, 1, 5);
    imprime(L);
    L = trocaValores(L, 5, 7);
    imprime(L);
    L = trocaValores(L, 7, 19);
    imprime(L);
    L = trocaValores(L, 13, 25);
    imprime(L);

    L = liberaLista(L);
}