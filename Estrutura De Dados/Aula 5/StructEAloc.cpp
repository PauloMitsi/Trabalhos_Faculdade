#include <stdio.h>
#include <iostream>
#include <string.h>

typedef struct aluno
{
    char nome[20];
    int RA;
    int media;
} Aluno;

typedef struct carro
{
    char marca[20];
    int ano;
} Carro;

int main(int argc, char const *argv[])
{

    Carro c;

    strcpy(c.marca, "Ronaldo");

    c.ano = 1204;

    printf("Nome:%s , ano:%d\n", c.marca, c.ano);

    c = {"Gol", 500}; // Literal composto

    printf("Nome:%s , ano:%d\n", c.marca, c.ano);

    Aluno *a = (Aluno *)malloc(2 * sizeof(Aluno));

    strcpy(a->nome, "Cleber");
    a->media = (3 + 4 + 9) / 3;
    a->RA = 2410362;

    strcpy((a + 1)->nome, "Chozz");
    (a + 1)->media = (4 + 7 + 2) / 3;
    (a + 1)->RA = 2410510;

    printf("Nome:%s , RA:%d ,media: %d \n", a->nome, a->RA, a->media);
    printf("Nome:%s , RA:%d ,media: %d \n", (a + 1)->nome, (a + 1)->RA, (a + 1)->media);

    return 0;
}
