#include <stdio.h>
#include <stdlib.h>

typedef struct no{
    int valor;
    struct no* prox;
    struct no* ant; 
}No;

No* criaLista(No* ref, int valor){
    ref = (No*)malloc(sizeof(No));
    ref->valor = valor;
    ref->prox = NULL;
    ref->ant = NULL;
}

No* preencheLista(No* ref, int valor){
    No* novo = (No*)malloc(sizeof(No));
    novo->valor = valor;
    novo->prox = NULL;
    novo->ant = ref;
    ref->prox = novo;
    return novo;
}

int procuraMaior(No* ref){
    int temp;
    while(ref->prox!=NULL){   
        if(ref->valor >= ref->prox->valor){
            temp = ref->valor;
        }
        else{
            temp = ref->prox->valor;
        }
        ref = ref->prox;
    }
    return temp;
}

No* trocaMaior(No* ref, int maior){
    No* aux = ref;
    while(aux->valor != maior){
        aux = aux->prox;
    }
    aux->prox = ref;
    ref->ant = aux;
    aux->ant = NULL;
    return aux;
}

int main(){
    No* ref = NULL;
    No* aux;
    ref = criaLista(ref, 10);
    aux = preencheLista(ref, 20);
    preencheLista(aux, 30);

    while(ref!=NULL){
        printf("%d\t", ref->valor);
        ref = ref->prox;
    }

    printf("\n");

    int maior = procuraMaior(ref);
    printf("%d", maior);
    
    ref = trocaMaior(ref, maior);
    while(ref!=NULL){
        printf("%d\t", ref->valor);
        ref = ref->prox;
    }
}