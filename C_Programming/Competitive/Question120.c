/* accept division of student from user and depends on the division display exam timing . 
    There are 4 divisions in school as A,B,C,D. Exam of division A at 7 AM ,
    B at 8.30 AM , C at 9.20 AM and D at 10.30 AM . (Application should be case insensitive)

input : C
output : Your exam at 9.20 AM

input : d
output : Your exam at 9.20 Am

*/

#include<stdio.h>

void DisplaySchedule(char ch)
{
    if(ch == 65 || ch == 97)
    {
        printf("Your exam at 7 AM");
    }
    else if(ch == 66 || ch == 98)
    {
        printf("Your exam at 8.30 AM");
    }
    else if(ch == 67 || ch == 99)
    {
        printf("Your exam at 9.20 AM");
    }
    else if(ch == 68 || ch == 100)
    {
        printf("Your exam at 10.30 AM");
    }
    else
    {
        printf("Invalid Division");
    }

}

int main()
{
    char cValue = '\0';

    printf("Enter the character : ");
    scanf("%c",&cValue);

    DisplaySchedule(cValue);

    return 0 ;
}
