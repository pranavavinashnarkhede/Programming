/*
    Accept number of rows and number of columns from user and display
    below pattern.

    Input : iRow = 5 iCol = 5
    Output : 
                    1 2 3 4 5
                    -1 -2 -3 -4 -5
                    1 2 3 4 5
                    -1 -2 -3 -4 -5
                    1 2 3 4 5

*/

import java.util.Scanner;

class Assignment25_4
{
    static void Pattern(int iRow , int iCol)
    {
        for(int i = 1 ; i <= iRow ; i++)
        {
            for(int j = 1 ; j <= iCol ; j++)
            {
                if(i % 2 == 0)
                {
                    System.out.print(-j+"\t");
                }
                else
                {
                    System.out.print(j+"\t");
                }
                
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