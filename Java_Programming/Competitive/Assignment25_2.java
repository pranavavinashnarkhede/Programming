/*
    Accept number of rows and number of columns from user and display
    below pattern.

    Input : iRow = 4 iCol = 4
    Output : 
                    2 4 6 8 10
                    1 3 5 7 9
                    2 4 6 8 10
                    1 3 5 7 9

*/

import java.util.Scanner;

class Assignment25_2
{
    static void Pattern(int iRow , int iCol)
    {
        int iValue = 0 ;

        for(int i = 1 ; i <= iRow ; i++)
        {
            if(i % 2 == 0 )
            {
                iValue = 1;
            }
            else
            {
                iValue = 2 ;
            }
            for(int j = 1 ; j <= iCol ; j++)
            {
                System.out.print(iValue+"\t");
                iValue = iValue + 2;

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