import java.util.*;

class Assignment58_3
{
//--------------------------------------------------------------------//
// Function Name : MaxDiagonal
// Description   : Finds the maximum element from both diagonals of a matrix.
// Input         : 2D square matrix
// Output        : Maximum element from both diagonals
// Author        : Pranav Avinash Narkhede
// Date          : 15/09/2026
//--------------------------------------------------------------------//
    public static int MaxDiagonal(int arr[][])
    {
        int i = 0 ;
        int iMax = arr[0][0] ;

        for(i = 0 ; i < arr.length ; i++)
        {   
            
            if(arr[i][i] > iMax)
            {
                iMax = arr[i][i];
            }
            
            if(arr[i][arr.length - 1 - i] > iMax)
            {
                iMax = arr[i][arr.length - 1 - i];
            }
            
        }
        return iMax;
    }
    
//--------------------------------------------------------------------//
// Application to find the maximum element from both diagonals.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0 ;
        int iCol = 0 ;
        int iInput = 0 ;
        int i = 0 , j = 0  , iRet = 0 ;

        System.out.println("Enter number of rows : ");
        iRow = sobj.nextInt();
        
        System.out.println("Enter number of columns : ");
        iCol = sobj.nextInt();

        if(iRow != iCol)
        {
            System.out.println("Invalid input");
            return ;
        }
        
        int Matrix[][] = new int[iRow][iCol];

        System.out.println("Enter the Matrix elements : ");
        System.out.println();
        for(i = 0 ; i < iRow ; i++)
        {
            System.out.println("Enter "+(i+1)+" row element : ");
            for(j = 0 ; j < iCol ; j++)
            {
                System.out.print("Enter "+(j+1)+" column element : ");
                iInput = sobj.nextInt();

                Matrix[i][j] = iInput;
            }
            System.out.println();
        }

        iRet = MaxDiagonal(Matrix);

        System.out.println("Maximum number for diagonals are : "+iRet);

    }
}