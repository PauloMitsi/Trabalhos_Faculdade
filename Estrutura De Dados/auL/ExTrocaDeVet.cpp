#include <iostream>

void printVet(int *v)
{
    for (int i = 0; i < 20; i++)
    {
        printf("v[%d] = %d\n", i, v[i]);
    }
}
void changePosition(int *v, int *v2)
{
    for (int i = 0; i < 20; i++)
    {

        if (20 - i > i)
        {
            v[20 - i] = v2[i];
            v[i] = v2[20 - i];
        }
    }
}

int main(int argc, char const *argv[])
{
    int v[20] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    int *p = (int *)malloc(20 * sizeof(int));
    int *pInv = (int *)malloc(20 * sizeof(int));

    p = v;
    pInv = v;

    // changePosition(p);
    printVet(p);

    changePosition(p, pInv);
    printVet(pInv);

    return 0;
}
