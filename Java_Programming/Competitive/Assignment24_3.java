/*
    Accept number of rows and number of columns from user and display below
    pattern.

    Input : iRow = 3 iCol = 5
    Output : 
                    A A A A A
                    B B B B B
                    C C C C C

*/

import java.util.Scanner;

class Assignment24_3
{
    static void Pattern(int iRow , int iCol)
    {
        char cValue = 'A' ;
        for(int i = 1 ; i <= iRow ; i++)
        {
            for(int j = 1 ; j <= iCol ; j++)
            {
                System.out.print(cValue+"\t");
            }          
            cValue++;
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