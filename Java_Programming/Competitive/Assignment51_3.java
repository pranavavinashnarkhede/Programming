import java.util.Scanner;

class Solution
{
//--------------------------------------------------------------------//
// Function Name : BestPlan
// Description   : Finds the cheapest mobile plan based on usage.
// Input         : Minutes, data usage and SMS count
// Output        : Recommended plan and total cost
// Author        : Pranav Avinash Narkhede
// Date          : 22-07-2026
//--------------------------------------------------------------------//

    public void BestPlan(int mins, int gb , int sms)
    {
        int PlanA = 199 ;
        int PlanB = 299 ;
        int PlanC = 399 ; 
        int PlanD = 599 ;

        int extra_min = 0 ;
        int extra_gb = 0 ;
        int extra_sms = 0 ;

        int CheapestCost = 99999 ;
        String Recommended = null ;

        if((mins < 0) ||  (gb < 0) || (sms < 0) )
        {
            System.out.println("Invalid input");
            return;
        }

        //----------------------Plan A-----------------------------//
        if(mins > 500)
        {
            extra_min = mins-500;
        }
        if(gb > 10)
        {
            extra_gb = gb - 10;
        }
        if(sms > 100)
        {
            extra_sms = sms - 100;
        }

        PlanA = PlanA + (extra_min * 1)+(extra_gb * 10)+(extra_sms*1);

        //----------------------Plan B-----------------------------//

        extra_min = 0 ;
        extra_gb = 0 ;
        extra_sms = 0 ;

        if(mins > 1000)
        {
            extra_min = mins-1000;
        }
        if(gb > 20)
        {
            extra_gb = gb - 20;
        }
        if(sms > 200)
        {
            extra_sms = sms - 200;
        }

        PlanB = PlanB + (extra_min * 1)+(extra_gb * 10)+(extra_sms*1);

        //----------------------Plan C-----------------------------//

        extra_min = 0 ;
        extra_gb = 0 ;
        extra_sms = 0 ;

        if(mins > 1500)
        {
            extra_min = mins-1500;
        }
        if(gb > 30)
        {
            extra_gb = gb - 30;
        }
        if(sms > 300)
        {
            extra_sms = sms - 300;
        }

        PlanC = PlanC + (extra_min * 1)+(extra_gb * 10)+(extra_sms*1);

        //----------------------Plan D-----------------------------//

        extra_min = 0 ;
        extra_gb = 0 ;
        extra_sms = 0 ;

        if(mins > 2000)
        {
            extra_min = mins-2000;
        }
        if(gb > 40)
        {
            extra_gb = gb - 40;
        }
        if(sms > 400)
        {
            extra_sms = sms - 400;
        }

        PlanD = PlanD + (extra_min * 1)+(extra_gb * 10)+(extra_sms*1);

        //----------------Calculate Cheapest Plan---------------------//

        if(PlanA < CheapestCost)
        {
            CheapestCost = PlanA;
            Recommended = "Plan A";
        }
        if(PlanB < CheapestCost)
        {
            CheapestCost = PlanB;
            Recommended = "Plan B";
        }
        if(PlanC < CheapestCost)
        {
            CheapestCost = PlanC;
            Recommended = "Plan C";
        }
        if (PlanD < CheapestCost)
        {
            CheapestCost = PlanD;
            Recommended = "Plan D";
        }

        System.out.println("-----------------------------------------------------------------");
        System.out.println("--------------------Mobile Plan Suggestion------------------------");
        System.out.println("-----------------------------------------------------------------");
        
        System.out.println("Recommended Plan : "+Recommended);
        System.out.println("Total Cost : "+CheapestCost);
       
    }
}

class Assignment51_3
{
//--------------------------------------------------------------------//
// Application to find the cheapest mobile plan.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int min = 0 ;
        int gb = 0 ;
        int sms = 0 ;

        System.out.println("Enter the Minutes : ");
        min = sobj.nextInt();

        System.out.println("Enter the Data used (GB) : ");
        gb = sobj.nextInt();

        System.out.println("Enter the SMS count : ");
        sms = sobj.nextInt();

        Solution suobj = new Solution();

        suobj.BestPlan( min , gb , sms);
    }
}