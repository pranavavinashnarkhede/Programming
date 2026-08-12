/*
    Accept division of student from user and depends on the division
    display exam timing. There are 4 divisions in school as A,B,C,D. Exam
    of division A at 7 AM, B at 8.30 AM, C at 9.20 AM and D at 10.30 AM.
    (Application should be case insensitive)
    
    Input : C
    Output : Your exam at 9.20 AM
    Input : d
    Output : Your exam at 10.30 AM

*/

import java.util.Scanner;

class Assignment29_5
{

    static void DisplaySchedule(char cValue)
    {
        if(cValue == 'a' || cValue == 'A')
        {
            System.out.println("Your exam time is 7 AM");
        }
        else if(cValue == 'b' || cValue == 'B')
        {
            System.out.println("Your exam time is 8:30 AM");
        }
        else if(cValue == 'c' || cValue == 'C')
        {
            System.out.println("Your exam time is 9:20 AM");
        }
        else if(cValue == 'd' || cValue == 'D')
        {
            System.out.println("Your exam time is 10:30 AM");
        }
        else
        {
            System.out.println("Invalid Division");
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        char cValue = '\0';

        System.out.println("Enter your Division : ");
        cValue = sobj.next().charAt(0);

        DisplaySchedule(cValue);
 
    }
}
