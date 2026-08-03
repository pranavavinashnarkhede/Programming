/*
    Accept number from user and display below pattern.
    Input : 5
    Output : A B C D E
*/

import java.util.Scanner;

class Assignment22_1
{
    static void Pattern(int iNo)
    {
        char cValue = 'A' ;
        
        for(int i = 1 ; i <= iNo ; i++)
        {
            System.out.print(cValue+"\t");
            cValue++;
            
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Pattern(iValue);
    }
}