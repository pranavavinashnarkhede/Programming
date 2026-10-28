import java.util.Scanner;

class Solution
{
    public int CalculateCharges(int weight)
    {
        int Total_Charges = 0 ;
        int i = 0 ;

        if(weight <= 0)
        {
            return -1;
        }

        if(weight == 1)
        {
            Total_Charges = 50;
        }
        else if(weight > 1 && weight <= 5)
        {
            Total_Charges = 50 + 20 * (weight -1);
        }
        else if(weight > 5)
        {
            Total_Charges = 150 + 30 * (weight -5);
        }

        return Total_Charges;

    }
}


class Assignment50_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Weight = 0 ;
        int iRet = 0 ;

        System.out.println("Enter the Weight : ");
        Weight = sobj.nextInt();
        
        Solution suobj = new Solution();

        iRet = suobj.CalculateCharges(Weight);

        if(iRet == -1)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println("Parvel Weight : "+Weight+" Kg");
            System.out.println("Courier Charges : "+iRet);
        }
        
    }
}