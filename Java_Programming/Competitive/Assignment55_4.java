import java.util.*;

class Assignment55_4
{
    //--------------------------------------------------------------------//
    // Function Name : CheckSunny
    // Description   : Checks whether the given number is a Sunny Number.
    // Input         : Integer number
    // Output        : Boolean result
    // Author        : Pranav Avinash Narkhede
    // Date          : 29/07/2026
    //--------------------------------------------------------------------//
    public static boolean CheckSunny(int iNo)
    {
        int iNum = 0 ;

        iNum = (int)Math.sqrt(iNo+1);

        return iNo + 1 == iNum * iNum;

    }
    //--------------------------------------------------------------------//
    // Application to check whether a number is a Sunny Number.
    //--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);  
        
        int iNo = 0 ;
        boolean iRet = false;

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        if(iNo < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        iRet = CheckSunny(iNo);

        if(iRet == true)
        {
            System.out.println("It is Sunny Number ");
        }
        else
        {
            System.out.println("It is not a Sunny Number  ");
        }
        
    }
}