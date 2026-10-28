/*
    Accept number of rows and number of columns from user and display below
    pattern.

    Input : iRow = 3 iCol = 4
    Output : 
                    1 2 3 4
                    5 6 7 8
                    9 10 11 12

*/

import java.util.Scanner;

class Assignment24_5
{
    static void Pattern(int iRow , int iCol)
    {
        int iValue = 1 ;

        for(int i = 1 ; i <= iRow ; i++)
        {
            for(int j = 1 ; j <= iCol ; j++)
            {
                System.out.print(iValue+"\t");
                iValue++;
            }         
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