// Program to print 5 to 1 numbers on screen.

#include<iostream>

void Display()
{
    int iCnt = 0 ;

    for(iCnt = 5 ; iCnt >= 1 ; iCnt--)
    {
        std::cout<<iCnt<<"\n";
    }
}

int main()
{
    Display();

    return 0 ;
}