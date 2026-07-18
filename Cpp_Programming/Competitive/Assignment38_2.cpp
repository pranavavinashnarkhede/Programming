// write a generic program to accept N values and count frequency of any specific value.
// Input : 10   20  30  10  30  40  10  40  10
// value to check frequency : 10
// output : 4

#include<iostream>
using namespace std;

template <class T>
int Frequency(T *arr , int Size , T No)
{
    int i = 0 ;
    int Count = 0 ;

    for(i = 0  ; i < Size ; i++)
    {
        if(arr[i] == No)
        {
            Count++;
        }
    }

    return Count;
}

int main()
{
    int arr[] = {10,20,30,10,30,40,10,40,10};

    cout<<"Frequency is : "<<Frequency(arr ,9 , 10)<<endl;
    
    return 0 ;
}