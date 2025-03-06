#include <iostream>
#include <stdio.h>
#include<stdlib.h>
using namespace std;

int oquefaz(int a)
{
    if(a==1)
        return a + a + 4;
    else
    {
        return 7 + oquefaz(a-1);
    }
}

void fazAlgo(int i)
{

    if(i%2==0)
    {
        printf("\n%d é par",i);
    }
    else
    {
        printf("\n%d é ímpar",i);
    }

    if(i!=1)
    {
        fazAlgo(i-1);
    }

}
int main(int argc, char *argv[])
{
    fazAlgo(3);
}
