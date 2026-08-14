import java.util.Scanner;

class Solution
{
    public int CalculateFair(int distance , String str)
    {
        int i = 0 ;
        int Total_Fair = 50 ;

        if(distance < 0  || !(str.equals("Yes") && !str.equals("No")))
        {
            return -1 ;
        }
        for(i = 1 ; i <= distance ; i++)
        {
            if(i <= 10)
            {
                Total_Fair = Total_Fair + 12;
            }
            else
            {
                Total_Fair = Total_Fair + 15 ;
            }
        }

        if(str.equals("Yes"))
        {
            Total_Fair = Total_Fair + (Total_Fair * 20) / 100 ; 
        }
       
        return Total_Fair;

    }
}


class Assignment50_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Distance = 0 ;
        String Peak_Hours = null;
        int iRet = 0 ;

        System.out.println("Enter the distance : ");
        Distance = sobj.nextInt();
        
        System.out.println("Enter whether peak hours or not : ");
        Peak_Hours = sobj.next();

        Solution suobj = new Solution();

        iRet = suobj.CalculateFair(Distance , Peak_Hours);

        if(iRet == -1)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            System.out.println("Distance : "+Distance+" KM");
            System.out.println("Peak Hours: "+Peak_Hours);
            System.out.println("Total Fare : "+iRet+ " rupees");
        }

        
    }
}