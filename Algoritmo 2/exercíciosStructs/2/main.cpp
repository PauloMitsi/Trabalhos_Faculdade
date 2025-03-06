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
    Produto *pon;

    pon = &p;

    //nome
    printf("insira o nome do produto: ");
    scanf("%s", &(*pon).nome);

    //codigo
    printf("insira o codigo do produto: ");
    scanf("%d", &(*pon).codigo);

    //preco
    printf("insira o preco do produto: ");
    scanf("%f", &(*pon).preco);

    printf("Nome: %s\n"
           "Preco: R$ %.2f\n"
           "Codigo: %d",
        p.nome, p.preco, p.codigo);

    return 0;
}
