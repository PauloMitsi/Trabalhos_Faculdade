#include <iostream>

using namespace std;

int v[5] = {4, 1, 5, 3, 1};

int rec(int n)
{
    if (n == -1)
    {
        return 0;
    }
    else
    {

        int x = rec(n - 1);
        if (v[n] >= 3 && v[n] <= 8)
        {
            return x + 1;
        }
        else
        {
            return x;
        }
    }
}

int main()
{
    printf("%d", rec(4));
    return 0;
}
