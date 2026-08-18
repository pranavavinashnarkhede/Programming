import java.util.Scanner;

class Solution
{
//--------------------------------------------------------------------//
//  Function Name : Transaction
//  Description   : Performs withdrawal after checking balance,
//                  limit, denomination, and minimum balance.
//  Input         : Integer balance, Integer withdrawal amount
//  Output        : Integer remaining balance or error code
//  Author        : Pranav Avinash Narkhede
//  Date          : 18-08-2026
//--------------------------------------------------------------------//

    public int Transaction(int iBalance , int Amount)
    {
        if((iBalance < 0) || (Amount <= 0))
        {
            return -1;
        }

       if(Amount > 25000)
       {
            return -2 ;
        }

        if(Amount % 100 != 0)
        {
            return -3;
        }

        if((iBalance - Amount) >= 1000)
        {
            iBalance = iBalance - Amount;
        }
        else
        {
            return -4;
        }

        return iBalance;


    } 
}


class Assignment48_2
{

//--------------------------------------------------------------------//
//  Application to perform a withdrawal transaction.
//--------------------------------------------------------------------//

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iBalance = 0 ;
        int Withdrawal = 0 ;
        int iRet = 0 ;

        System.out.println("Enter the balance : ");
        iBalance = sobj.nextInt();
        
        System.out.println("Enter the amount to withdrawal : ");
        Withdrawal = sobj.nextInt();

        Solution suobj = new Solution();

        iRet = suobj.Transaction(iBalance , Withdrawal);

        if(iRet == -1)
        {
            System.out.println("Invalid input");
        }
        else if(iRet == -2)
        {
            System.out.println("Maximum withdrawal per transaction is 25000 rupees");
        }
        else if(iRet == -3)
        {
            System.out.println("The withdrawal amount must be a multiple of 100");
        }
        else if (iRet == -4)
        {
            System.out.println("Transaction Failed : After withdrawal the minimum balance should be 1000 rupees");
        }
        else
        {
            System.out.println("Transaction Successful");
            System.out.println("Remaining Balance : " + iRet+" rupees");
        }

    }
}