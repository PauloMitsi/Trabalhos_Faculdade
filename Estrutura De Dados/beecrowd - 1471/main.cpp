#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <iostream>

typedef struct mergulhadores
{
    int id;
    bool hasReturned;

    struct mergulhadores *prev;
    struct mergulhadores *next;
} Mergulhadores;

void printNotReturned(Mergulhadores *m)
{
    if (m == NULL)
    {
        printf("*");
    }
    while (m != NULL)
    {
        printf("%d ", m->id);
        m = m->next;
    }
}

Mergulhadores *insert(Mergulhadores *m, int id, bool hR)
{

    Mergulhadores *newM;
    Mergulhadores *aux = m;

    newM = (Mergulhadores *)malloc(sizeof(Mergulhadores));
    newM->prev = NULL;
    newM->next = NULL;

    if (m == NULL)
    {
        newM->id = id;
        newM->hasReturned = hR;
        return newM;
    }

    while (aux->next != NULL)
    {
        aux = aux->next;
    }
    newM->id = id;
    newM->hasReturned = hR;

    aux->next = newM;
    newM->prev = aux;
    newM->next = NULL;

    return m;
}

Mergulhadores *remove(Mergulhadores *m, int id)
{
    Mergulhadores *aux = m;

    while (aux->id != id)
    {
        aux = aux->next;
    };

    if (aux->prev == NULL)
    {
        m = aux->next;
        m->prev = NULL;
        free(aux);
        return m;
    }
    else if (aux->next == NULL)
    {
        aux->prev->next = aux->next;
        free(aux);
        return m;
    }
    else
    {
        aux->prev->next = aux->next;
        aux->next->prev = aux->prev;
        free(aux);
        return m;
    }
}

Mergulhadores *createList(int n, int r)
{
    Mergulhadores *m = NULL;
    int who;

    if (n == r)
    {
        return NULL;
    }

    // create
    for (int i = 0; i < n; i++)
    {
        m = insert(m, i + 1, false);
    }

    Mergulhadores *aux = m;

    // insert who has return
    for (int j = 0; j < r; j++)
    {
        scanf("%d", &who);
        while (aux != NULL)
        {
            if (aux->id == who)
            {
                aux->hasReturned = true;
                m = remove(m, who);
                break;
            }
            aux = aux->next;
        }
        aux = m;
    }

    return m;
}

int main(int argc, char const *argv[])
{
    int n, r;

    scanf("%d %d", &n, &r);
    Mergulhadores *m = NULL;

    m = createList(n, r);

    printNotReturned(m);
    
    return 0;
}
