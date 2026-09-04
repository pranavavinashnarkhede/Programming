import java.util.Scanner;

class Solution
{
//--------------------------------------------------------------------//
// Function Name : CalculateBill
// Description   : Calculates the call charge based on call duration.
// Input         : Call duration in minutes
// Output        : Total call charge
// Author        : Pranav Avinash Narkhede
// Date          : 24-07-2026
//--------------------------------------------------------------------//
    public int CalculateBill(int minutes)
    {
        int Amount = 0 ;
        int Remaining = 0 ;

        if(minutes < 0)
        {
            return -1 ;
        }

        if(minutes <= 5)
        {
            return 0 ;
        }
        
        Remaining = minutes - 5 ;

        if(Remaining <= 10)
        {
            Amount = Remaining * 1 ;
        }
        else
        {
            Amount = 10 * 1 ;

            Remaining = Remaining - 10 ;

            Amount = Amount + (Remaining * 2);
        }

        return Amount;
    }
}

class Assignment52_4
{
//--------------------------------------------------------------------//
// Application to calculate the call charge.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int minutes = 0 ;
        int iRet = 0 ;

        System.out.println("Enter the minutes : ");
        minutes = sobj.nextInt();

        Solution suobj = new Solution();

        iRet = suobj.CalculateBill(minutes);

        if(iRet == -1)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println("Call Duration : "+minutes+" minutes");
            System.out.println("Total Call Charge : "+iRet);
        }

    }
}