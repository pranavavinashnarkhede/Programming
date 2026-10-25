import java.util.*;

class Assignment59_4
{

//--------------------------------------------------------------------//
// Function Name : IsIdentity
// Description   : Checks whether the given matrix is an identity matrix.
// Input         : Two-dimensional integer array
// Output        : Boolean result
// Author        : Pranav Avinash Narkhede
// Date          : 17/09/2026
//--------------------------------------------------------------------//
    public static boolean IsIdentity(int arr[][])
    {
        int i = 0  , j = 0 ;
        boolean bFlag = true;

        if(arr.length != arr[0].length)
        {
            return false;
        }

        for(i = 0 ; i < arr.length; i++)
        {
            for(j = 0 ; j < arr[i].length ; j++)
            {
                if(i == j)
                {
                    if(arr[i][j] != 1)
                    {
                        bFlag = false;
                        return bFlag;
                    }
                    
                }
                else if(arr[i][j] != 0)
                {
                    bFlag = false;
                    return bFlag;
                }
            }
        
        }

        return bFlag;
        
    }

//--------------------------------------------------------------------//
// Application to check whether a matrix is an identity matrix.
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

        bRet = IsIdentity(Matrix);

        System.out.println(bRet);
    }
}