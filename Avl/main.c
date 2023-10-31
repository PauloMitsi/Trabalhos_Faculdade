#include <stdio.h>
#include <stdlib.h>

typedef struct No
{
  int chave;
  struct No *esquerda;
  struct No *direita;
  int altura;
} No;

No *novoNo(int chave)
{
  No *no = (No *)malloc(sizeof(No));
  no->chave = chave;
  no->esquerda = NULL;
  no->direita = NULL;
  no->altura = 1;
  return (no);
}

int altura(No *N)
{
  if (N == NULL)
    return 0;
  return N->altura;
}

int max(int a, int b)
{
  return (a > b) ? a : b;
}

No *rotR(No *y)
{
  No *x = y->esquerda;
  No *T2 = x->direita;

  x->direita = y;
  y->esquerda = T2;

  y->altura = max(altura(y->esquerda), altura(y->direita)) + 1;
  x->altura = max(altura(x->esquerda), altura(x->direita)) + 1;

  return x;
}

No *rotL(No *x)
{
  No *y = x->direita;
  No *T2 = y->esquerda;

  y->esquerda = x;
  x->direita = T2;

  x->altura = max(altura(x->esquerda), altura(x->direita)) + 1;
  y->altura = max(altura(y->esquerda), altura(y->direita)) + 1;

  return y;
}

int getBalanceamento(No *N)
{
  if (N == NULL)
    return 0;
  return altura(N->esquerda) - altura(N->direita);
}

No *inserir(No *no, int chave)
{

  if (no == NULL)
    return (novoNo(chave));

  if (chave < no->chave)
    no->esquerda = inserir(no->esquerda, chave);
  else if (chave > no->chave)
    no->direita = inserir(no->direita, chave);
  else
    return no;

  no->altura = 1 + max(altura(no->esquerda),
                       altura(no->direita));

  int balanceamento = getBalanceamento(no);

  if (balanceamento > 1 && chave < no->esquerda->chave)
    return rotR(no);

  if (balanceamento < -1 && chave > no->direita->chave)
    return rotL(no);

  if (balanceamento > 1 && chave > no->esquerda->chave)
  {
    no->esquerda = rotL(no->esquerda);
    return rotR(no);
  }

  if (balanceamento < -1 && chave < no->direita->chave)
  {
    no->direita = rotR(no->direita);
    return rotL(no);
  }

  return no;
}

int main()
{

  No *raiz = NULL;
  raiz = inserir(raiz, 10);
  for (int i = 0; i < 10; i++)
  {
    raiz = inserir(raiz, i);
  }

  return 0;
}