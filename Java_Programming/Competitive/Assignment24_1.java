/*
    Accept number of rows and number of columns from user and display below
    pattern.

    Input : iRow = 4 iCol = 4
    Output : 
                    A B C D
                    A B C D
                    A B C D
                    A B C D

*/

import java.util.Scanner;

class Assignment24_1
{
    static void Pattern(int iRow , int iCol)
    {
        char cValue = 'A' ;
        for(int i = 1 ; i <= iRow ; i++)
        {
            for(int j = 1 ; j <= iCol ; j++)
            {
                System.out.print(cValue+"\t");
                cValue++;
            }
            cValue = 'A';
            System.out.println();
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0 , iValue2 = 0 ;

        System.out.println("Enter number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of Columns : ");
        iValue2 = sobj.nextInt();

        Pattern(iValue1 , iValue2);
    }
}