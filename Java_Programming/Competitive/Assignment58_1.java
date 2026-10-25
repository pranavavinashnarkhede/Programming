import java.util.*;

class Assignment58_1
{
//--------------------------------------------------------------------//
// Function Name : AddDiagonals
// Description   : Calculates the sum of the primary diagonal elements.
// Input         : 2D square matrix
// Output        : Sum of primary diagonal elements
// Author        : Pranav Avinash Narkhede
// Date          : 15/09/2026
//--------------------------------------------------------------------//
    public static int AddDiagonals(int arr[][])
    {
        int i = 0 , j = 0 ;
        int iSum = 0 ;

        for(i = 0 ; i < arr.length ; i++)
        {
            iSum = iSum + arr[i][i];  
        }

        return iSum;
    }
    
//--------------------------------------------------------------------//
// Application to calculate the sum of primary diagonal elements.
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

        iRet = AddDiagonals(Matrix);

        System.out.println("Summation of Diagonals are : "+iRet);

    }
}