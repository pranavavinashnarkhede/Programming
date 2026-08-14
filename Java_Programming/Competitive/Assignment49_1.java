import java.util.Scanner;

class Solution
{
    public int CalcParkingCharges(int duration)
    {
        int i = 0 ;
        int Total_Amount = 0 ;

        if(duration < 0)
        {
            return -1;
        }

        if(duration >= 1 )
        {
            Total_Amount = 20;
        }

        for(i = 3 ; i <= duration ; i++)
        {
            Total_Amount = Total_Amount + 10 ;
        }

        if(duration > 10)
        {
            Total_Amount = Total_Amount + 50 ;          // 50 rs penalty
        }

        return Total_Amount;
    
    } 
}


class Assignment49_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Total_Hours = 0 ;
        int iRet = 0 ;

        System.out.println("Enter total parking hours : ");
        Total_Hours = sobj.nextInt();

        Solution suobj = new Solution();

        iRet = suobj.CalcParkingCharges(Total_Hours);

        if(iRet == -1)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println("Total Parking Duration : "+Total_Hours + " hours");
            System.out.println("Total Parking Fee : "+iRet+" rupees");
        }

    }
}