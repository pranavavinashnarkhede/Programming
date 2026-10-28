import java.util.*;

class Assignment54_3
{
    //--------------------------------------------------------------------//
    // Function Name : CheckPerfect
    // Description   : Checks whether the given number is a Perfect Number.
    // Input         : Integer number
    // Output        : Boolean result
    // Author        : Pranav Avinash Narkhede
    // Date          : 27/07/2026
    //--------------------------------------------------------------------//
    public static boolean CheckPerfect(int iNo)
    {
       int iSum = 0 ;
       int i = 0 ;

       for(i = 1 ; i <= iNo /2 ; i++)
       {
            if(iNo % i == 0)
            {
                iSum = iSum + i;
            }
       }

       return iSum == iNo ;
    }
//--------------------------------------------------------------------//
// Application to check whether a number is a Perfect Number.
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

        bRet = CheckPerfect(iNo);

        if(bRet == true)
        {
            System.out.println("It is Perfect Number ");
        }
        else
        {
            System.out.println("It is not a Perfect Number  ");
        }
        
    }
}