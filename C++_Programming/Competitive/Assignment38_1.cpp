// write generic program which accept one value and one number from user. print that value that number of times on screen.

//      Input : M   7
//      Output : M  M   M   M   M   M   M

#include<iostream>
using namespace std;

template <class T>
void Display(T value , int Size)
{
    int i = 0 ;

    for(i = 0 ; i < Size ; i++)
    {
        cout<<value<<"\t";
    }
    cout<<endl;
}

int main()
{
    Display('M' , 7);
    Display(11 , 3);

    return 0;
}