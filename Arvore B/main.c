#include <stdio.h>
#include <stdlib.h>


#define MAX 3
#define MIN 2

struct NoB
{
    int valores[MAX + 1], contador;
    struct NoB *filho[MAX + 1];
};

struct NoB *raiz;

struct NoB *criarNo(int valor, struct NoB *filho)
{
    struct NoB *novoNo;
    novoNo = (struct NoB *)malloc(sizeof(struct NoB));
    novoNo->valores[1] = valor;
    novoNo->contador = 1;
    novoNo->filho[0] = raiz;
    novoNo->filho[1] = filho;
    return novoNo;
}

//----------------------------------------------------------------//
//---------------------REMOVER E MERGE----------------------------//
//----------------------------------------------------------------//

void removerValor(struct NoB *meuNo, int pos)
{
    int i = pos + 1;
    while (i <= meuNo->contador)
    {
        meuNo->valores[i - 1] = meuNo->valores[i];
        meuNo->filho[i - 1] = meuNo->filho[i];
        i++;
    }
    meuNo->contador--;
}

int removerValorDoNo(int valor, struct NoB *meuNo)
{
    int pos, flag = 0;
    if (meuNo)
    {
        if (valor < meuNo->valores[1])
        {
            pos = 0;
            flag = 0;
        }
        else
        {
            for (pos = meuNo->contador; (valor < meuNo->valores[pos] && pos > 1); pos--)
                ;
            if (valor == meuNo->valores[pos])
            {
                flag = 1;
            }
            else
            {
                flag = 0;
            }
        }
        if (flag)
        {
            if (meuNo->filho[pos - 1])
            {
                copiarSucessor(meuNo, pos);
                flag = removerValorDoNo(meuNo->valores[pos], meuNo->filho[pos]);
                if (flag == 0)
                {
                    printf("Dado fornecido não está presente na Árvore B\n");
                }
            }
            else
            {
                removerValor(meuNo, pos);
            }
        }
        else
        {
            flag = removerValorDoNo(valor, meuNo->filho[pos]);
        }
        if (meuNo->filho[pos])
        {
            if (meuNo->filho[pos]->contador < MIN)
                ajustarNo(meuNo, pos);
        }
    }
    return flag;
}

void remover(int valor, struct NoB *meuNo)
{
    struct NoB *tmp;
    if (!removerValorDoNo(valor, meuNo))
    {
        printf("Não presente\n");
        return;
    }
    else
    {
        if (meuNo->contador == 0)
        {
            tmp = meuNo;
            meuNo = meuNo->filho[0];
            free(tmp);
        }
    }
    raiz = meuNo;
    return;
}

void unirNos(struct NoB *meuNo, int pos)
{
    int j = 1;
    struct NoB *x1 = meuNo->filho[pos], *x2 = meuNo->filho[pos - 1];

    x2->contador++;
    x2->valores[x2->contador] = meuNo->valores[pos];
    x2->filho[x2->contador] = meuNo->filho[0];

    while (j <= x1->contador)
    {
        x2->contador++;
        x2->valores[x2->contador] = x1->valores[j];
        x2->filho[x2->contador] = x1->filho[j];
        j++;
    }

    j = pos;
    while (j < meuNo->contador)
    {
        meuNo->valores[j] = meuNo->valores[j + 1];
        meuNo->filho[j] = meuNo->filho[j + 1];
        j++;
    }
    meuNo->contador--;
    free(x1);
}

void ajustarNo(struct NoB *meuNo, int pos)
{
    if (!pos)
    {
        if (meuNo->filho[1]->contador > MIN)
        {
            deslocarEsquerda(meuNo, 1);
        }
        else
        {
            unirNos(meuNo, 1);
        }
    }
    else
    {
        if (meuNo->contador != pos)
        {
            if (meuNo->filho[pos - 1]->contador > MIN)
            {
                deslocarDireita(meuNo, pos);
            }
            else
            {
                if (meuNo->filho[pos + 1]->contador > MIN)
                {
                    deslocarEsquerda(meuNo, pos + 1);
                }
                else
                {
                    unirNos(meuNo, pos);
                }
            }
        }
        else
        {
            if (meuNo->filho[pos - 1]->contador > MIN)
                deslocarDireita(meuNo, pos);
            else
                unirNos(meuNo, pos);
        }
    }
}

//----------------------------------------------------------------//
//---------------------ISERÇÃO E SPLIT----------------------------//
//----------------------------------------------------------------//

void dividirNo(int valor, int *pval, int pos, struct NoB *no,
               struct NoB *filho, struct NoB **novoNo)
{
    int mediana, j;

    if (pos > MIN)
        mediana = MIN + 1;
    else
        mediana = MIN;

    *novoNo = (struct NoB *)malloc(sizeof(struct NoB));
    j = mediana + 1;
    while (j <= MAX)
    {
        (*novoNo)->valores[j - mediana] = no->valores[j];
        (*novoNo)->filho[j - mediana] = no->filho[j];
        j++;
    }
    no->contador = mediana;
    (*novoNo)->contador = MAX - mediana;

    if (pos <= MIN)
    {
        adicionarValorAoNo(valor, pos, no, filho);
    }
    else
    {
        adicionarValorAoNo(valor, pos - mediana, *novoNo, filho);
    }
    *pval = no->valores[no->contador];
    (*novoNo)->filho[0] = no->filho[no->contador];
    no->contador--;
}

void insercao(int valor)
{
    int flag, i;
    struct NoB *filho;

    flag = definirValorNo(valor, &i, raiz, &filho);
    if (flag)
        raiz = criarNo(i, filho);
}

void copiarSucessor(struct NoB *meuNo, int pos)
{
    struct NoB *dummy;
    dummy = meuNo->filho[pos];

    for (; dummy->filho[0] != NULL;)
        dummy = dummy->filho[0];
    meuNo->valores[pos] = dummy->valores[1];
}

void deslocarDireita(struct NoB *meuNo, int pos)
{
    struct NoB *x = meuNo->filho[pos];
    int j = x->contador;

    while (j > 0)
    {
        x->valores[j + 1] = x->valores[j];
        x->filho[j + 1] = x->filho[j];
        j--;
    }
    x->valores[1] = meuNo->valores[pos];
    x->filho[1] = x->filho[0];
    x->contador++;

    x = meuNo->filho[pos - 1];
    meuNo->valores[pos] = x->valores[x->contador];
    meuNo->filho[pos] = x->filho[x->contador];
    x->contador--;
    return;
}

void deslocarEsquerda(struct NoB *meuNo, int pos)
{
    int j = 1;
    struct NoB *x = meuNo->filho[pos - 1];

    x->contador++;
    x->valores[x->contador] = meuNo->valores[pos];
    x->filho[x->contador] = meuNo->filho[pos]->filho[0];

    x = meuNo->filho[pos];
    meuNo->valores[pos] = x->valores[1];
    x->filho[0] = x->filho[1];
    x->contador--;

    while (j <= x->contador)
    {
        x->valores[j] = x->valores[j + 1];
        x->filho[j] = x->filho[j + 1];
        j++;
    }
    return;
}

//----------------------------------------------------------------//
//----------------------------------------------------------------//
//----------------------------------------------------------------//

int definirValorNo(int valor, int *pval, struct NoB *no,
                   struct NoB **filho)
{
    int pos;
    if (!no)
    {
        *pval = valor;
        *filho = NULL;
        return 1;
    }

    if (valor < no->valores[1])
    {
        pos = 0;
    }
    else
    {
        for (pos = no->contador;
             (valor < no->valores[pos] && pos > 1); pos--)
            ;
        if (valor == no->valores[pos])
        {
            printf("Duplicatas não são permitidas\n");
            return 0;
        }
    }
    if (definirValorNo(valor, pval, no->filho[pos], filho))
    {
        if (no->contador < MAX)
        {
            adicionarValorAoNo(*pval, pos, no, *filho);
        }
        else
        {
            dividirNo(*pval, pval, pos, no, *filho, filho);
            return 1;
        }
    }
    return 0;
}

void adicionarValorAoNo(int valor, int pos, struct NoB *no,
                        struct NoB *filho)
{
    int j = no->contador;
    while (j > pos)
    {
        no->valores[j + 1] = no->valores[j];
        no->filho[j + 1] = no->filho[j];
        j--;
    }
    no->valores[j + 1] = valor;
    no->filho[j + 1] = filho;
    no->contador++;
}

void buscar(int valor, int *pos, struct NoB *meuNo)
{
    if (!meuNo)
    {
        return;
    }

    if (valor < meuNo->valores[1])
    {
        *pos = 0;
    }
    else
    {
        for (*pos = meuNo->contador;
             (valor < meuNo->valores[*pos] && *pos > 1); (*pos)--)
            ;
        if (valor == meuNo->valores[*pos])
        {
            printf("%d presente na Árvore B", valor);
            return;
        }
    }
    buscar(valor, pos, meuNo->filho[*pos]);
    return;
}

void percorrer(struct NoB *meuNo)
{
    int i;
    if (meuNo)
    {
        for (i = 0; i < meuNo->contador; i++)
        {
            percorrer(meuNo->filho[i]);
            printf("%d ", meuNo->valores[i + 1]);
        }
        percorrer(meuNo->filho[i]);
    }
}

int main()
{
    int valor, opcao;

    int chaves[] = {3, 7, 1, 9, 5, 2, 4, 6, 8, 10};
    int tamanho = sizeof(chaves) / sizeof(chaves[0]);
    for (int i = 0; i < tamanho; i++)
    {
        insercao(chaves[i]);
    }

    percorrer(raiz);

    remover(3, raiz);

    printf("\n");
    percorrer(raiz);
}