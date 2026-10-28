import java.util.*;

class Assignment59_3
{
//--------------------------------------------------------------------//
// Function Name : ReverseRow
// Description   : Reverses the elements of each row in the matrix.
// Input         : Two-dimensional integer array
// Output        : Matrix with reversed rows
// Author        : Pranav Avinash Narkhede
// Date          : 16/09/2026
//--------------------------------------------------------------------//

    public static void ReverseRow(int arr[][])
    {
        int i = 0  , j = 0 ;
        int iTemp = 0 ;

        System.out.println("Matrix Elements before reverse operation : ");

        for(i = 0 ; i < arr.length ; i++)
        {
            for(j = 0 ; j < arr[i].length ; j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        
        System.out.println();

        for(i = 0 ; i < arr.length ; i++)
        {
            for(j = 0 ; j < arr[i].length / 2 ; j++)
            {
                iTemp = arr[i][j];
                arr[i][j] = arr[i][arr[i].length- 1 - j];
                arr[i][arr[i].length - 1 - j] = iTemp;
            }
        
        }

        System.out.println("Matrix Elements after reverse operation : ");
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
// Application to reverse the elements of each row in a matrix.
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

        ReverseRow(Matrix);
    }
}