import java.util.Scanner;

class Solution
{
    public void CheckCriteria(int marks ,int attendance ,int income)
    {
        if(!(marks >= 0 && marks <= 100) || !(attendance >= 0 && attendance <= 100) || !(income >= 0))
        {
            System.out.println("Invalid input");
            return;
        }

        if(marks >= 80)
        {
            if(attendance >= 75)
            {
                if(income <= 300000)
                {
                    System.out.println("Scholarship Approved");
                }
                else
                {
                    System.out.println("Scholarship Rejected : Family income does not match to the scholarship criteria");
                }
            }
            else
            {
                System.out.println("Scholarship Rejected : Attendance does not match to the scholarship criteria");
            }
        }
        else
        {
            System.out.println("Scholarship Rejected : Marks does not match to the scholarship criteria");
        }


    }
}


class Assignment50_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Marks = 0 ;
        int Attendance = 0 ;
        int Income = 0 ;

        System.out.println("Enter the Marks : ");
        Marks = sobj.nextInt();
        
        System.out.println("Enter the Attendance : ");
        Attendance = sobj.nextInt();

        System.out.println("Enter the Family Income : ");
        Income = sobj.nextInt();

        Solution suobj = new Solution();

        suobj.CheckCriteria(Marks , Attendance , Income);

        
    }
}