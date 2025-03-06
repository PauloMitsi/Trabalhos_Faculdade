/*Estrutura de Dados - 2022.2
Detalhes da atividade
Avaliação 1
DANILO SIPOLI SANCHES
•
13:59
100 pontos
Data de entrega: 19:00
Desenvolva os seguintes códigos:


a) Lista Duplamente Encadeada;
Escreva uma função em C para trocar os valores m e n de uma lista duplamente encadeada (m e n podem valores definidos pelo usuario).

b) Fila
Desenvolver uma função que inverte os k primeiros elementos de uma Fila

Observações:
- Só poderá ser utilizado as funções e estruturas previamente fornecidas nos arquivos .c
- Enviar os códigos .c junto com um arquivo.txt com as saídas da função printf() dentro da função main()
- Prazo para envio: 19/Outubro até 23:59
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct lista
{
    int valor;
    struct lista *prox;
} Lista;

typedef struct fila
{
    Lista *ini;
    Lista *fim;
} Fila;

typedef struct pilha
{
    Lista *topo;
} Pilha;

void push(Pilha *P, int info)
{
    Lista *novo = (Lista *)malloc(sizeof(Lista));
    novo->valor = info;
    novo->prox = P->topo;
    P->topo = novo;
}

int pop(Pilha *P)
{
    int retorno = 0;
    Lista *aux = P->topo;
    if (aux != NULL)
    {
        P->topo = aux->prox;
        retorno = aux->valor;
        free(aux);
        return retorno;
    }
}

void removeFila(Fila *F)
{
    Lista *aux = F->ini;

    // Verica Fila vazia
    if (F->ini != NULL)
    {
        F->ini = aux->prox;
        free(aux);
        if (F->ini == NULL)
            F->fim = NULL;
    }
}

void insereFila(Fila *F, int info)
{
    Lista *novo = (Lista *)malloc(sizeof(Lista));
    novo->valor = info;
    novo->prox = NULL;

    // Verifica fila vazia
    if (F->ini == NULL)
    {
        F->ini = novo;
        F->fim = novo;
    }
    else
    {
        F->fim->prox = novo;
        F->fim = novo;
    }
}

void imprime(Fila *F)
{
    Lista *aux = F->ini;
    while (aux != NULL)
    {
        printf("%d ", aux->valor);
        aux = aux->prox;
    }
    printf("\n");
}

void inverte_kprimeiros(Fila *F, int k)
{
    Fila *fNovo = (Fila *)malloc(sizeof(Fila));
    fNovo->ini = NULL;
    fNovo->fim = NULL;

    int vInicial = F->ini->valor;
    insereFila(fNovo, k);

    if (F->ini->valor != k)
    {
        while (F->ini != NULL)
        {
            if (F->ini->valor != vInicial && F->ini->valor != k)
            {
                insereFila(fNovo, F->ini->valor);
            }
            if (F->ini->valor == k)
            {
                insereFila(fNovo, vInicial);
            }
            removeFila(F);
        }
        F->ini = fNovo->ini;
        F->fim = fNovo->fim;
    }
}

/*
Desenvolver uma função que inverte os k primeiros
elementos de uma Fila
Ex:
Entrada:
k = 3
Fila: 1 2 3 4 5
Saída:
3 2 1 4 5
*/

int main()
{

    // Cria a Fila
    Fila *F = (Fila *)malloc(sizeof(Fila));
    F->ini = NULL;
    F->fim = NULL;
    insereFila(F, 1);
    insereFila(F, 2);
    insereFila(F, 3);
    insereFila(F, 4);
    insereFila(F, 5);
    imprime(F);

    inverte_kprimeiros(F, 1);
    imprime(F);
    inverte_kprimeiros(F, 2);
    imprime(F);
    inverte_kprimeiros(F, 3);
    imprime(F);
    inverte_kprimeiros(F, 4);
    imprime(F);
    inverte_kprimeiros(F, 5);
    imprime(F);

    return (0);
}
