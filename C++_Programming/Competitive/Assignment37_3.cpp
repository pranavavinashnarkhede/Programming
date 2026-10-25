// write a generic program to accept N values from user and return addition of that values.

#include<iostream>
using namespace std;

template <class T>
T AddN(T *arr , int Size)
{
    T sum = 0 ;
    int i = 0 ;

    if( Size <= 0)
    {
        return T{};
    }
    
    for(i = 0 ; i < Size ; i++)
    {
        sum = sum + arr[i];
    }
    return sum;
     
}

int main()
{
    int arr[] = {10,20,30,40,50};
    float brr[] = {10.2f,20.2f,30.2f,40.2f};

    cout<<"Summation is : "<<AddN( arr , 5)<<endl;
    cout<<"Summation is : "<<AddN(brr , 4)<<endl;


    return 0;
}