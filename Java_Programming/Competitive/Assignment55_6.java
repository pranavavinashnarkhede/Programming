import java.util.*;

class Assignment55_6
{
    //--------------------------------------------------------------------//
    // Function Name : CheckTrimorphic
    // Description   : Checks whether the given number is a Trimorphic Number.
    // Input         : Integer number
    // Output        : Boolean result
    // Author        : Pranav Avinash Narkhede
    // Date          : 29/07/2026
    //--------------------------------------------------------------------//
    public static boolean CheckTrimorphic(int iNo)
    {
        int iCube = 0 ;

        iCube = (int)Math.pow(iNo , 3);

        while(iNo != 0)
        {
            if((iCube % 10) != (iNo % 10))
            {
                break;
            }
            else
            {
                iCube = iCube / 10 ;
                iNo = iNo / 10 ;
            }
        }

        return iNo == 0;

    }
    //--------------------------------------------------------------------//
    // Application to check whether a number is a Trimorphic Number.
    //--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iNo = 0 ;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        if(iNo < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        bRet = CheckTrimorphic(iNo);

        if(bRet == true)
        {
            System.out.println("It is Trimorphic Number ");
        }
        else
        {
            System.out.println("It is not a Trimorphic Number  ");
        }
        
    }
}