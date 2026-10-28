// Type 2

import java.util.Scanner;

class program7
{
    void CheckDivisible(int iNO)
    {
        if((iNO % 3 == 0) && (iNO % 5 == 0))
        {
            System.out.println("Number is divisible by 3 and 5");
        }
        else
        {
            System.out.println("Number is not divisible by 3 and 5");
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        CheckDivisible(iValue);                                                 // ERROR


    }
}