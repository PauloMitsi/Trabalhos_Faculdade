#include <iostream>

using namespace std;

struct Produto
{
    char nome[10];
    int codigo;
    float preco;
};

int main()
{
    Produto *pon;

    pon =(Produto*)malloc(sizeof(Produto));

    //nome
    printf("insira o nome do produto: ");
    scanf("%s", &pon->nome);

    //codigo
    printf("insira o codigo do produto: ");
    scanf("%d", &pon->codigo);

    //preco
    printf("insira o preco do produto: ");
    scanf("%f", &pon->preco);

    printf("Nome: %p\n"
           "Preco: R$ %p\n"
           "Codigo: %p",
           &pon->nome, &pon->preco, &pon->codigo);

    return 0;
}
