/*
    Program Name : Assignment48_1
    Purpose      : Calculate the fine based on the number of days
                   a book is kept.
*/

import java.util.Scanner;

class Solution
{

//--------------------------------------------------------------------//
//  Function Name : CalculateFine
//  Description   : Calculates the total fine based on the number
//                    of days the book is kept.
//  Input         : Integer (number of days)
//  Output        : Integer (total fine)
//  Author        : Pranav Avinash Narkhede
//  Date          : 18-08-2026
//--------------------------------------------------------------------//

    public int CalculateFine(int iDays)
    {
        if(iDays < 0 )
        {
            return -1 ;
        }

        int i = 0 ;
        int TotalFine = 0 ;

        for(i = 8 ; i <= iDays ; i++)
        {
            if((i > 7) && (i <= 12))
            {
                TotalFine = TotalFine + 5;
            }
            else if(i > 12)
            {
                TotalFine = TotalFine + 10 ;
            }
        }

        return TotalFine;
    } 
}


class Assignment48_1
{
    
//--------------------------------------------------------------------//
//
//  Application to calculate fine based on the number of days
//
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int daysKept = 0 ;
        int iRet = 0 ;

        System.out.println("Enter the total number of days the book borrowed : ");
        daysKept = sobj.nextInt();

        Solution suobj = new Solution();

        iRet = suobj.CalculateFine(daysKept);

        if(iRet == -1)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println("Total Fine to be paid : "+iRet + " Rupees");
        }

    }
}