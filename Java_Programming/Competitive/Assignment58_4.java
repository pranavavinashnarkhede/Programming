import java.util.*;

class Assignment58_4
{
//--------------------------------------------------------------------//
// Function Name : AddColumns
// Description   : Calculates the sum of each column in a matrix.
// Input         : 2D matrix
// Output        : Sum of each column
// Author        : Pranav Avinash Narkhede
// Date          : 15/09/2026
//--------------------------------------------------------------------//
    public static void SumColumns(int arr[][])
    {
        int i = 0  , j = 0 ;
        int iSum = 0 ;

        for(i = 0 ; i < arr[0].length ; i++)
        {
            for(j = 0 ; j < arr.length ; j++)
            {
                iSum = iSum + arr[j][i];
            }

            System.out.print(iSum+"\t");
            iSum = 0 ;
        }
        
    }
    
//--------------------------------------------------------------------//
// Application to calculate the sum of each column in a matrix.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0 ;
        int iCol = 0 ;
        int iInput = 0 ;
        int i = 0 , j = 0 ;

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

        SumColumns(Matrix);
    }
}