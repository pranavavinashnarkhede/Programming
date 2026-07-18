// write a generic program to accept N values and search first occurrence of any specific value.
// Input : 10   20  30  10  30  40  10  40  10
// value to search : 40
// output : 6

#include<iostream>
using namespace std;

template <class T>
int SearchFirst(T *arr , int Size , T No)
{
    int i = 0 ;

    for(i = 0 ; i < Size ; i++)
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

    cout<<"First occurence is : "<<SearchFirst(arr , 9 , 40)<<endl;

    return 0 ;
}