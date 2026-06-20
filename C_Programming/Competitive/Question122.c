/* 
    Accept character from user . If character is small dispaly its corresponding captial character ,
    and if it small then display its corresponding capital . in other cases display as it is .

    Input :     Q
    Output :    q

    Input :     m
    Output :    M

    Input :     4
    Output :    4

*/

#include<stdio.h>

void Display(char ch)
{
   if((ch >= 'A') && (ch <='Z'))
   {
        printf("%c",(ch+32));
   }
   else if((ch >= 'a') && (ch <='z'))
   {
        printf("%c",(ch-32));
   } 
   else
   {
        printf("%c",ch);
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
