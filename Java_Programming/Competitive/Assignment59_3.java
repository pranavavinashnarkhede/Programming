import java.util.*;

class Assignment59_3
{
//--------------------------------------------------------------------//
// Function Name : ReverseColumn
// Description   : Reverses the elements of each column in the matrix.
// Input         : Two-dimensional integer array
// Output        : Matrix with reversed columns
// Author        : Pranav Avinash Narkhede
// Date          : 17/09/2026
//--------------------------------------------------------------------//

    public static void ReverseColumn(int arr[][])
    {
        int i = 0  , j = 0 ;
        int iTemp = 0 ;

         System.out.println("Matrix Elements before reversing content of each column : ");

        for(i = 0 ; i < arr.length ; i++)
        {
            for(j = 0 ; j < arr[i].length ; j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println();

        for(i = 0 ; i < arr.length/2 ; i++)
        {
            for(j = 0 ; j < arr[i].length ; j++)
            {
                iTemp = arr[i][j];
                arr[i][j] = arr[arr.length - 1 - i][j];
                arr[arr.length - 1 - i][j] = iTemp;
            }
        
        }

        System.out.println("Matrix Elements after reversing content of each column: ");
        for(i = 0 ; i < arr.length ; i++)
        {
            for(j = 0 ; j < arr[i].length ; j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        
    }

//--------------------------------------------------------------------//
// Application to reverse the elements of each column in a matrix.
//--------------------------------------------------------------------//

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0 ;
        int iCol = 0 ;
        int i = 0 , j = 0 ;

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

        ReverseColumn(Matrix);
    }
}