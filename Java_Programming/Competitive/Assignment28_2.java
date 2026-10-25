/*
    Accept number of rows and number of columns from user and display below
    pattern.

    Input : iRow = 4 iCol = 4
    Output : 
                * * * #
                * * # @
                * # @ @
                # @ @ @
*/

import java.util.Scanner;

class Assignment28_2
{
    static void Pattern(int iRow , int iCol)
    {
        for(int i = iRow ; i > 0 ; i--)
        {
            for(int j = 1 ; j <= iCol ; j++)
            {
                if(i == j)
                {
                    System.out.print("#\t");
                }
                else if(i > j)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("@\t");
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