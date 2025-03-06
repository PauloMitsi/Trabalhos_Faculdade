#include <iostream>

using namespace std;

int fibho(int p)
{
    if(p<3)
    {
        return 1;
    }
    else
    {
        return fibho(p-1) + fibho(p-2);
    }
}

/*int fhibo(int a,int b,int i, int termo)
{
    if(i<=termo)
    {
        int c = a + b;
        a=b;
        b=c;
        return fhibo(a,b,i+1,termo);
    }
    else
    {
        return b;
    }
}
*/
int main()
{

    printf("%d",fibho(6));
    return 0;
}
