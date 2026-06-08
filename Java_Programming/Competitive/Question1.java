// Accept one number from user and print that number of * on screen.
import java.util.Scanner;

class Question1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0 ;
        int iCnt = 0 ;

        System.out.println("Enter number :");
        iValue = sobj.nextInt();

        for(iCnt = 0 ;iCnt < iValue ; iCnt++)
        {
            System.out.print("*\t");
        }
        
    }
}