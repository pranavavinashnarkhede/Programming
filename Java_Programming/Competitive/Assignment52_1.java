import java.util.Scanner;

class Solution
{
//--------------------------------------------------------------------//
// Function Name : CalculateCharges
// Description   : Calculates the total stay charges with a discount.
// Input         : Number of days of stay
// Output        : Total bill amount
// Author        : Pranav Avinash Narkhede
// Date          : 23-07-2026
//--------------------------------------------------------------------//

    public int CalculateCharges(int days)
    {
        int ChargesPerDay = 3000;
        int TotalAmount = 0 ;

        if(days <= 0)
        {
            return -1 ;
        }
        //---------Calculate Total Amount ------------------//
        TotalAmount = ChargesPerDay * days;

        // ----------Discount on bill if days > 7 ---------//
        if(days > 7)
        {
            TotalAmount = TotalAmount - (TotalAmount * 5) / 100;
        }

        return TotalAmount;

    }
}

class Assignment52_1
{
//--------------------------------------------------------------------//
// Application to calculate the total stay charges.
//--------------------------------------------------------------------//

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int days = 0 ;
        int iRet = 0 ;

        System.out.println("Enter number of days you stay : ");
        days = sobj.nextInt();

        Solution suobj = new Solution();

        iRet = suobj.CalculateCharges(days);

        if(iRet == -1)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println("Total Stay Duration : "+days+" days");
            System.out.println("Total Bill Amount : "+iRet);
        }

    }
}