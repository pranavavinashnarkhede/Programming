// write a generic program which accept N values from user and return largest value

#include<iostream>
using namespace std;

template <class T>
T Max(T *arr , int Size)
{
    T max {} ;
    int i = 0 ;

    if(arr == NULL || Size <= 0)
    {
        return T{};
    }

    for(i = 0 ; i < Size ; i++)
    {
        if(max < arr[i])
        {
            max = arr[i];
        }
    }
    return max;
}

int main()
{
    int arr[] = {10,20,30,40,50};
    float brr[] = {10.0 , 3.7 , 9.8 , 8.7};

    cout<<"Maximum number is : "<<Max(arr , 5)<<endl;
    cout<<"Maximum number is : "<<Max(brr , 4)<<endl;



    return 0 ;
}