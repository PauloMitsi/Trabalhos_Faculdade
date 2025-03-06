#include <iostream>

using namespace std;

struct digimon {

    int vida, defesa, ataque;
    char nome[20];
};

int main()
{
    digimon d;

    //vida
    printf("digite a vida do digimon: ");
    scanf("%d", &a.vida);

    //defesa
    printf("digite a defesa do digimon: ");
    scanf("%d", &a.defesa);

    //ataque
    printf("digite a ataque do digimon: ");
    scanf("%d", &a.ataque);

    fflush(stdin);
    //nome
    printf("digite o nome do digimon: ");
    gets(a.nome);

    printf("\nnome: %s\n"
           "ataque: %d\n"
           "vida: %d\n"
           "defesa: %d\n",
        d.nome, d.ataque, d.vida, d.defesa);

    return 0;
}
