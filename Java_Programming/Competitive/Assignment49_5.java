import java.util.Scanner;

class Solution
{
    public int CalculateIncometax(int income)
    {
        int Total_Tax = 0 ;
        int temp = 0 ;
        int Remaining = 0 ;

        if(income < 0 )
        {
            return -1;
        }

        if(income <= 250000)
        {
            return Total_Tax;
        }
        else if(income <= 500000)
        {
            Total_Tax = (250000 * 5) / 100 ;

        }
        else if(income <= 1000000)
        {
            Total_Tax = (250000 * 5) / 100;
            Remaining = income - 500000;
            Total_Tax = Total_Tax + (Remaining * 20) / 100;
        }
        else
        {
            Total_Tax = (250000 * 5) / 100 ;
            Total_Tax = Total_Tax + (500000 * 20) / 100 ;
            Remaining = income - 1000000;
            Total_Tax = Total_Tax + (Remaining * 30) / 100;
        }

        return Total_Tax;

    } 
}


class Assignment49_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Income = 0 ;
        int iRet = 0 ;

        System.out.println("Enter the income : ");
        Income = sobj.nextInt();

        Solution suobj = new Solution();

        iRet = suobj.CalculateIncometax(Income);

        if(iRet == -1)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            System.out.println("Annual Income : "+Income+" rupees");
            System.out.println("Total Tax Payable : "+iRet+" rupees");
        }
    }
}