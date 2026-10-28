import java.util.*;

class Assignment55_2
{
    //--------------------------------------------------------------------//
    // Function Name : CheckAutomorphic
    // Description   : Checks whether the given number is an Automorphic Number.
    // Input         : Integer number
    // Output        : Boolean result
    // Author        : Pranav Avinash Narkhede
    // Date          : 28/07/2026
    //--------------------------------------------------------------------//
    public static boolean CheckAutomorphic(int iNo)
    {
        int iSquare = 0 ;

        iSquare = (int)Math.pow(iNo , 2);

        while(iNo != 0)
        {
            if((iSquare % 10) != (iNo % 10))
            {
                break;
            }
            else
            {
                iSquare = iSquare / 10 ;
                iNo = iNo / 10 ;
            }
        }

        return iNo == 0;
        
    }

    //--------------------------------------------------------------------//
    // Application to check whether a number is an Automorphic Number.
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

        bRet = CheckAutomorphic(iNo);

        if(bRet == true)
        {
            System.out.println("It is Automorphic Number ");
        }
        else
        {
            System.out.println("It is not a Automorphic Number  ");
        }
        
    }
}