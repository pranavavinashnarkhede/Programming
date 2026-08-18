import java.util.Scanner;

class Solution
{

//--------------------------------------------------------------------//
//  Function Name : CalculateResult
//  Description   : Validates marks, calculates average, and
//                  displays the final result.
//  Input         : Integer array containing marks
//  Output        : Displays average marks and final result
//  Author        : Pranav Avinash Narkhede
//  Date          : 18-08-2026
//--------------------------------------------------------------------//

    public void CalculateResult(int Brr[])
    {
        int i = 0 ;
        int Sum = 0 ;
        int Average = 0 ;

        for(i = 0 ; i < Brr.length ; i++)
        {
            if(Brr[i] < 0 || Brr[i] > 100)
            {
               System.out.println("Invalid input");
               return;
            }
        }

        for(i = 0 ; i < Brr.length ; i++)
        {
            if(Brr[i] < 35)
            {
                System.out.println("Result : Fail");
                return;
            }
        }

        for(i = 0 ; i < Brr.length ; i++)
        {
            Sum = Brr[i] + Sum;
        }

        Average = Sum / Brr.length;

        if(Average >= 75)
        {
            System.out.println("Average Marks : "+Average);
            System.out.println("Final Result : Distinction");

        }
        else if(Average >= 60)
        {
            System.out.println("Average Marks : "+Average);
            System.out.println("Final Result : First Class");
        }
        else if(Average >= 50)
        {
            System.out.println("Average Marks : "+Average);
            System.out.println("Final Result : Second Class");
        }
        else if(Average < 50)
        {
            System.out.println("Average Marks : "+Average);
            System.out.println("Final Result : Pass");
        }
    } 
}


class Assignment48_3
{

//--------------------------------------------------------------------//
//  Application to calculate the result of a student.
//--------------------------------------------------------------------//

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = new int[5];

        System.out.println("Enter the marks of student : ");
        for(int i = 0 ; i < 5 ; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    
        Solution suobj = new Solution();

        suobj.CalculateResult(Arr);

    }
}