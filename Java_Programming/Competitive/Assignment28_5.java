/*
    Accept number of rows and number of columns from user and display below
    pattern.

    Input : iRow = 6 iCol = 6
    Output : 
               1 2 3 4 5
                1 2    5
                1  3   5
                1    4 5
                1 2 3 4 5
*/

import java.util.Scanner;

class Assignment28_5
{
    static void Pattern(int iRow , int iCol)
    {
        for(int i = 1 ; i <= iRow ; i++)
        {
            for(int j = 1 ; j <= iCol ; j++)
            {
                if(i == 1 || j == 1 || i == iRow || j == iCol || i == j)
                {
                    System.out.print(j+"\t");
                }
                else
                {
                    System.out.print(" \t");
                }
            }
            System.out.println();

        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0 , iValue2 = 0;

        System.out.println("Enter number of rows : ");
        iValue1 = sobj.nextInt();
        
        System.out.println("Enter number of columns : ");
        iValue2 = sobj.nextInt();

        Pattern(iValue1 , iValue2);
    }
}