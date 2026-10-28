import java.util.Scanner;

class Solution
{
//--------------------------------------------------------------------//
// Function Name : CalculateWaterBill
// Description   : Calculates the water bill with late fee and meter charges.
// Input         : Units consumed and number of late weeks
// Output        : Final due amount
// Author        : Pranav Avinash Narkhede
// Date          : 22-07-2026
//--------------------------------------------------------------------//

    public void CalculateWaterBill(int units, int lateWeeks)
    {
        int billAmount = 0;
        int lateFee = 0;
        int penaltyPercent = 0;
        int meterCharges = 120;

        if(units < 0 || lateWeeks < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        for(int i = 1; i <= units; i++)
        {
            if(i <= 100)
            {
                billAmount = billAmount + 5;
            }
            else if(i <= 200)
            {
                billAmount = billAmount + 8;
            }
            else
            {
                billAmount = billAmount + 10;
            }
        }

        penaltyPercent = 2 * lateWeeks;

        if(penaltyPercent > 10)
        {
            penaltyPercent = 10;
        }

        lateFee = (billAmount * penaltyPercent) / 100;

        billAmount = billAmount + lateFee + meterCharges;

        System.out.println("Total Units Consumed : " + units);
        System.out.println("Meter Charges : " + meterCharges);
        System.out.println("Late Fee : " + lateFee);
        System.out.println("Final Due Amount : " + billAmount);
    }
}

class Assignment51_4
{
//--------------------------------------------------------------------//
// Application to calculate the water bill.
//--------------------------------------------------------------------//

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Units = 0;
        int LateWeeks = 0;

        System.out.println("Enter the Units : ");
        Units = sobj.nextInt();

        System.out.println("Enter the number of late weeks : ");
        LateWeeks = sobj.nextInt();

        Solution suobj = new Solution();

        suobj.CalculateWaterBill(Units, LateWeeks);
    }
}