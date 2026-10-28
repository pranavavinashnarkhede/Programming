// write generic program to multiply two numbes.

#include<iostream>
using namespace std;

template <class T>
T Multiply(T No1 , T No2)
{
    T ans;
    ans = No1 * No2;
    return ans;
}

int main()
{
    cout<<"Multiplication is : "<<Multiply(10 ,11)<<endl;

    cout<<"Multiplication is : "<<Multiply(10.5 ,11.5)<<endl;

    return 0 ;
}