/*
    Accept number of rows and number of columns from user and display below
    pattern.

    Input : iRow = 5 iCol = 5
    Output : 
                1 2 3 4
                  2 3 4
                    3 4
                      4
*/

import java.util.Scanner;

class Assignment27_5
{
    static void Pattern(int iRow , int iCol)
    {
        for(int i = 1 ; i <= iRow ; i++)
        {
            for(int j = 1 ; j <= iCol ; j++)
            {
                if(j >= i)
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