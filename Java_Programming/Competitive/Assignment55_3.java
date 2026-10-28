import java.util.*;

class Assignment55_3
{
    //--------------------------------------------------------------------//
    // Function Name : CheckSpy
    // Description   : Checks whether the given number is a Spy Number.
    // Input         : Integer number
    // Output        : Boolean result
    // Author        : Pranav Avinash Narkhede
    // Date          : 28/07/2026
    //--------------------------------------------------------------------//
    public static boolean CheckSpy(int iNo)
    {
        int iDigit = 0 ;
        int iSum = 0 ;
        int iProduct = 0 ;

        iProduct = 1 ;
        while(iNo != 0)
        {
            iDigit = iNo % 10 ;
            iSum = iSum + iDigit;
            iProduct = iProduct * iDigit;
            iNo = iNo / 10 ;
        }

       return iSum == iProduct;
    }
    //--------------------------------------------------------------------//
    // Application to check whether a number is a Spy Number.
    //--------------------------------------------------------------------//

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iNo = 0 ;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        if(iNo <= 0)
        {
            System.out.println("Invalid input");
            return;
        }

        bRet = CheckSpy(iNo);

        if(bRet == true)
        {
            System.out.println("It is Spy Number ");
        }
        else
        {
            System.out.println("It is not a Spy Number  ");
        }
        
    }
}