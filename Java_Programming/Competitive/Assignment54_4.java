import java.util.*;

class Assignment54_4
{
    //--------------------------------------------------------------------//
    // Function Name : CheckHarshad
    // Description   : Checks whether the given number is a Harshad Number.
    // Input         : Integer number
    // Output        : Boolean result
    // Author        : Pranav Avinash Narkhede
    // Date          : 27/07/2026
    //--------------------------------------------------------------------//
    public static boolean CheckHarshad(int iNo)
    {
       int iSum = 0 ;
       int iTemp = 0 ;

       iTemp = iNo ;

       while(iTemp != 0)
       {
            iSum = iSum + (iTemp % 10);
            iTemp = iTemp / 10 ;
       }

       return iNo % iSum == 0;
       
    }
    
    //--------------------------------------------------------------------//
    // Application to check whether a number is a Harshad Number.
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

        bRet = CheckHarshad(iNo);

        if(bRet == true)
        {
            System.out.println("It is Harshad Number ");
        }
        else
        {
            System.out.println("It is not a Harshad Number  ");
        }
        
    }
}