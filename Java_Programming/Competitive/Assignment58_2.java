import java.util.*;

class Assignment58_2
{
//--------------------------------------------------------------------//
// Function Name : CountFrequency
// Description   : Counts the frequency of a given element in a 2D matrix.
// Input         : 2D matrix and key element
// Output        : Frequency of the given element
// Author        : Pranav Avinash Narkhede
// Date          : 15/09/2026
//--------------------------------------------------------------------//
    public static int CountFrequency(int arr[][] , int iKey)
    {
        int i = 0 , j = 0 ;
        int iCount = 0 ;

        for(i = 0 ; i < arr.length ; i++)
        {
            for(j = 0 ; j < arr[i].length ; j++)
            {
                if(arr[i][j] == iKey)
                {
                    iCount++;
                }
            }
        }

        return iCount;
    }
    
//--------------------------------------------------------------------//
// Application to count the frequency of an element in a 2D matrix.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0 ;
        int iCol = 0 ;
        int iInput = 0 ;
        int iNo = 0 ;
        int i = 0 , j = 0  , iRet = 0 ;

        System.out.println("Enter number of rows : ");
        iRow = sobj.nextInt();
        
        System.out.println("Enter number of columns : ");
        iCol = sobj.nextInt();

        System.out.println("Enter number to count its frequency : ");
        iNo = sobj.nextInt();

        if(iRow <=0 || iCol <= 0)
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

        iRet = CountFrequency(Matrix , iNo);

        System.out.println("Frequency of "+iNo+" is : "+iRet);

    }
}