import java.util.*;

class Assignment59_5
{
//--------------------------------------------------------------------//
// Function Name : IsSparse
// Description   : Checks whether the given matrix is a sparse matrix.
// Input         : Two-dimensional integer array
// Output        : Boolean result
// Author        : Pranav Avinash Narkhede
// Date          : 17/09/2026
//--------------------------------------------------------------------//

    public static boolean IsSparse(int arr[][])
    {
        int i = 0  , j = 0 ;
        int iZeroCount = 0 ;
        int iTotalEle = 0 ;
        int iNonZero = 0 ;

        for(i = 0 ; i < arr.length; i++)
        {
            iTotalEle = iTotalEle + arr[i].length;

            for(j = 0 ; j < arr[i].length ; j++)
            {
                if(arr[i][j] == 0)
                {
                    iZeroCount++;
                }
            }
        
        }

        iNonZero = iTotalEle - iZeroCount ;

        if(iZeroCount > iNonZero)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    
//--------------------------------------------------------------------//
// Application to check whether a matrix is a sparse matrix.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0 ;
        int iCol = 0 ;
        int i = 0 , j = 0 ;
        boolean bRet = false;

        System.out.println("Enter number of rows : ");
        iRow = sobj.nextInt();
        
        System.out.println("Enter number of columns : ");
        iCol = sobj.nextInt();

        int Matrix[][] = new int[iRow][iCol];

        System.out.println("Enter the Matrix elements : ");
        System.out.println();
        for(i = 0 ; i < iRow ; i++)
        {
            System.out.println("Enter "+(i+1)+" row element : ");
            for(j = 0 ; j < iCol ; j++)
            {
                System.out.print("Enter "+(j+1)+" column element : ");
                Matrix[i][j] = sobj.nextInt();
            }
            System.out.println();
        }

        bRet = IsSparse(Matrix);

        System.out.println(bRet);
    }
}