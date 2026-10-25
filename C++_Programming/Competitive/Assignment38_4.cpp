// write a generic program to accept N values and search last occurrence of any specific value.
// Input : 10   20  30  10  30  40  10  40  10
// value to search : 40
// output : 8

#include<iostream>
using namespace std;

template <class T>
int SearchLast(T *arr , int Size , T No)
{
    int i = 0 ;

    for(i = Size-1 ; i >= 0 ; i--)
    {
        if(arr[i] == No)
        {
            break;
        }
    }

    return i+1;
}

int main()
{
    int arr[] = {10,20,30,10,30,40,10,40,10};

    cout<<"Last occurence is : "<<SearchLast(arr , 9 , 10)<<endl;

    return 0 ;
}