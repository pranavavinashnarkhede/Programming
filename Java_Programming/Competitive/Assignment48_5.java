import java.util.Scanner;

class Solution
{
//--------------------------------------------------------------------//
// Function Name : CalculateDiscount
// Description   : Calculates the discount based on amount and membership.
// Input         : Amount and membership type
// Output        : Total payable amount
// Author        : Pranav Avinash Narkhede
// Date          : 18-08-2026
//--------------------------------------------------------------------//
    public int CalculateDiscount(int amount, String str)
    {
        int Discount = 0 ;
        
        if(amount <= 0 || !((str.equals("Premium")) || (str.equals("Regular"))) )
        {
            return -1 ;
        }

        if(amount > 5000)
        {
            Discount = (amount * 20 ) / 100;
            amount = amount - Discount;
        }
        else if(amount > 2000)
        {
            Discount = (amount * 10 ) / 100;
            amount = amount - Discount;
        }

        if(str.equals("Premium"))
        {
            Discount = (amount * 5) / 100 ; 
            amount = amount - Discount;
        }

        return amount;

    } 
}


class Assignment48_5
{
    
//--------------------------------------------------------------------//
//  Application to calculate discount based on amount and membership.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Amount = 0 ;
        String Member_Type = null;
        int iRet = 0 ;

        System.out.println("Enter the amount : ");
        Amount = sobj.nextInt();

        System.out.println("Enter the membership type (Premium / Regular) : ");
        Member_Type = sobj.next();

        Solution suobj = new Solution();

        iRet = suobj.CalculateDiscount(Amount , Member_Type);

        if(iRet == -1)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println("Original Amount : "+Amount);
            System.out.println("Total Discount : "+(Amount - iRet));
            System.out.println("Total Payable Amount : "+iRet+" rupees");
        }

    }
}