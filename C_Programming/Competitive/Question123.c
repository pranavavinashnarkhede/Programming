/* 
    Accept character from user. if it is capital then display all the characters from the input characters till Z .
    if input character is small then print all the characters in reverse order till a . in other cases return directly .

    Input :   Q
    Output :  Q   R   S   T   U   V   W   X   Y   Z

    Input :   m
    Output :  m l   k   j   i   h   g   f   e   d   c   b   a

    Input :   8
    Output :   

*/

#include<stdio.h>

void Display(char ch)
{
    int Cnt = 0 ;
    if((ch >= 65) && (ch <= 90))
    {
        for(Cnt = ch ; Cnt <= 90 ; Cnt++)
        {
            printf("%c\t",Cnt);
        }
    }
    else if((ch >= 97) && (ch <= 122))
    {
        for(Cnt = ch ; Cnt >= 97 ; Cnt--)
        {
            printf("%c\t",Cnt);
        }
    }
    else
    {
        printf("");
    }     

}

int main()
{
    char cValue = '\0';
    
    printf("Enter the character : ");
    scanf("%c",&cValue);
 
    Display(cValue);

    return 0 ;
}
