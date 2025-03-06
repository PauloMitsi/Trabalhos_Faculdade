#include <iostream>

using namespace std;

struct Produto {
    char nome[10];
    int codigo;
    float preco;
};

int main()
{
    Produto p;

    //nome
    printf("insira o nome do produto: ");
    scanf("%s", &p.nome);

    //codigo
    printf("insira o codigo do produto: ");
    scanf("%d", &p.codigo);

    //preco
    printf("insira o preco do produto: ");
    scanf("%f", &p.preco);

    printf("Nome: %s\n"
           "Preco: R$ %.2f\n"
           "Codigo: %d",
        p.nome, p.preco, p.codigo);

    return 0;
}
