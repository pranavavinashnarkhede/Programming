/*
--------------------------------------------------------------------------------
Program     : Saddle Point in 2D Array
Description : Find the saddle point in a 2D array.
              A saddle point is an element that is the minimum in its row
              and maximum in its column.

Author      : Pranav Avinash Narkhede
Date        : 30/08/2026
--------------------------------------------------------------------------------
*/

import java.util.Scanner;

class Saddle_Point
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0, iCol = 0;
        int iMin = 0, iMinIndex = 0;
        int i = 0, j = 0, k = 0;
        boolean bSadden = true;

        System.out.println("Enter the rows count : ");
        iRow = sobj.nextInt();

        System.out.println("Enter the columns count : ");
        iCol = sobj.nextInt();

        int Arr[][] = new int[iRow][iCol];

        for(i = 0; i < Arr.length; i++)
        {
            System.out.println();
            System.out.println("Enter element for " + (i + 1) + " row");

            for(j = 0; j < Arr[i].length; j++)
            {
                System.out.print("Enter " + (j + 1) + " column element : ");
                Arr[i][j] = sobj.nextInt();
            }
        }

        for(i = 0; i < Arr.length; i++)
        {
            iMin = Arr[i][0];
            iMinIndex = 0;

            for(j = 1; j < Arr[i].length; j++)
            {
                if(Arr[i][j] < iMin)
                {
                    iMin = Arr[i][j];
                    iMinIndex = j;
                }
            }

            bSadden = true;

            for(k = 0; k < Arr.length; k++)
            {
                if(Arr[k][iMinIndex] > iMin)
                {
                    bSadden = false;
                    break;
                }
            }

            if(bSadden)
            {
                System.out.println("Saddle Point : " + iMin);
                return;
            }
        }

        System.out.println("There is no Saddle Point");
    }
}