#include <iostream>

using namespace std;

int main()
{
    int a, *ponteiroA;

    a = 3;
    ponteiroA = &a;

    printf("\n%p \t%d",&a,a);
    printf("\n%p \t%p",&ponteiroA,ponteiroA);

    *ponteiroA = 30;

    printf("\n%p \t%d",&a,a);
    printf("\n%p \t%p",&ponteiroA, ponteiroA);

}
