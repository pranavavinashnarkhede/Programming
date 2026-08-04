/*
    Accept number of rows and number of columns from user and display
    below pattern.

    Input : iRow = 3 iCol = 4
    Output : 
                * # * #
                * # * #
                * # * #

*/

import java.util.Scanner;

class Assignment23_4
{

    static void Pattern(int iRow , int iCol)
    {
        int i = 0 , j = 0 ;

        for(i = 1 ; i <= iRow ; i++)
        {
            for(j = 1 ; j <= iCol ; j++)
            {
                if(j % 2 == 0)
                {
                    System.out.print("#\t");
                }
                else
                {
                    System.out.print("*\t");
                }
                
            }
            System.out.println();
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0 ; 
        int iValue2 = 0 ;

        System.out.println("Enter number of rows : ");
        iValue1 = sobj.nextInt();
        
        System.out.println("Enter number of columns : ");
        iValue2 = sobj.nextInt();

        Pattern(iValue1 , iValue2);
    }
}