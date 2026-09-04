// goal -> 10000 steps per day

import java.util.Scanner;

class Solution
{
    //--------------------------------------------------------------------//
    // Function Name : CheckWeeklyGoal
    // Description   : Counts the days on which the daily step goal is achieved.
    // Input         : Array containing steps for each day
    // Output        : Number of goal-achieved days and maximum steps
    // Author        : Pranav Avinash Narkhede
    // Date          : 24-07-2026
    //--------------------------------------------------------------------//
    public void CheckWeeklyGoal(int Arr[])
    {
        int GoalAchieved = 0 ;
        int MaxSteps = 0 ;
        int i = 0  ;

        for(i = 0 ; i < Arr.length ; i++)
        {
            if(Arr[i] < 0)
            {
                System.out.println("Invalid input");
                return;
            }
        }

        if(Arr.length == 0)
        {
            System.out.println("Invalid input");
            return;
        }

        MaxSteps = Arr[0];

        for(i = 0 ; i < Arr.length ; i++)
        {
            if(Arr[i] >= 10000)
            {
                GoalAchieved++;
            }
            if(MaxSteps < Arr[i])
            {
                MaxSteps = Arr[i];
            }
        }

        System.out.println("Goal Achieved Days : "+GoalAchieved);
        System.out.println("Maximum Steps in Week : "+MaxSteps);

    }
}

class Assignment52_3
{
//--------------------------------------------------------------------//
// Application to check the weekly step goal.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int steps[] = new int[7] ;

        for(int i = 0 ; i < steps.length ; i++)
        {
            System.out.print("Enter day "+(i+1)+" steps : ");
            steps[i] = sobj.nextInt();
        }

        Solution suobj = new Solution();

        suobj.CheckWeeklyGoal(steps);

    }
}