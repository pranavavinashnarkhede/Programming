// write a generic program to find largest number from three numbers.

#include<iostream>
using namespace std;

template <class T>
T Max(T No1 , T No2 , T No3)
{
    if (No1 > No2 && No1 > No3)
    {
        return No1;
    }
    else if(No2 > No3)
    {
        return No2;
    }
    else
    {
        return No3;
    }
}

int main()
{
    cout<<"Largest Number is : "<<Max(32 ,11,23 )<<endl;
    cout<<"Largest Number is : "<<Max(11.23f ,45.4f,23.43f )<<endl;
    cout<<"Largest Number is : "<<Max( 10.214,11.4874,23.21 )<<endl;

    return 0 ;
}