#include <iostream>

using namespace std;

int calcQuarta(int n,int i)
{

    if(i == 1)
    {
        return n;
    }
    else
    {
        return n * calcQuarta(n, i-1);
    }
}

int main()
{
    int a;
    do{
        printf("\ndigite algo:");
        scanf("%d", &a);
        switch(a)
        {
        case 1:
            printf("\nVoc� digitou 1");
            break;
        case 2:
            printf("\nVoc� digitou 2");
            break;
        case 0:
            printf("\nVoc� digitou 0. Tchau!");
            break;
        }
    }
    while(a!=0);
}
