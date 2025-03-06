#include <iostream>

using namespace std;

struct digimon
{
    int vida, defesa, ataque;
    char nome[20];
};

//Função pra criar digimon
digimon criaDigimon()
{
    digimon a;

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

    return a;
}

//Função pra demonstrar os dados no console
void printaDigimon(digimon *d)
{

    printf("nome: %s\n"
           "ataque: %d\n"
           "vida: %d\n"
           "defesa: %d\n",
           d->nome, d->ataque, d->vida, d->defesa);

}

int main()
{

    digimon d;

    d = criaDigimon();
    printaDigimon(&d);

    return 0;
}
