//======================================================================
// Import : java.util
// Purpose: Provides utility classes such as Scanner for taking input.
//======================================================================

import java.util.*;

class Solution
{

//======================================================================
// Function : AnalyzeCinemaSeats
// Purpose  : Count booked seats, find maximum booking row,
//            and check whether any row is completely booked.
// Input    : 2D array of seats (1 = Booked, 0 = Available)
// Output   : Total Booked Seats
//            Row With Maximum Bookings
//            Full Row Exists (Yes/No)
// Date     : 25/07/2026
// Author   : Pranav Avinash Narkhede
//======================================================================

    public void AnalyzeCinemaSeats(int Arr[][])
    {
        int i = 0 , j = 0 ;
        int TotalBooked = 0 ;
        int MaxBookingRow = 0 ;
        String str = null;
        int iCount = 0 ;
        int iRowFullSize[] = new int[Arr.length];
        int iMax = 0 ;

    //--------------------Validation-----------------------------//

    for(i = 0 ; i < Arr.length ; i++)
    {
        for(j = 0 ; j < Arr[i].length ; j++)
        {
            if((Arr[i][j] < 0) || (Arr[i][j] > 1))
            {
                System.out.println("Invalid input");
                return ;
            }
        }
    }

    for(i = 0 ; i < Arr.length ; i++)
    {
        for(j = 0 ; j < Arr[i].length ; j++)
        {
            if(Arr[i][j] == 1)
            {
                TotalBooked++;
                iCount++;
            }
        }

        iRowFullSize[i] = iCount;
        iCount = 0 ;
    }

    iMax = iRowFullSize[0];

    for(i = 0 ; i < iRowFullSize.length ; i++)
    {
        if(iRowFullSize[i] >= iMax)
        {
            MaxBookingRow = i+1;

            if(iRowFullSize[i] == Arr[0].length)
            {
                str = "Yes";
            }
            else
            {
                str = "No";
            }
        }

    }

    System.out.println("----------------------------------------------------------------------------");
    System.out.println("-----------------------Cinema Hall Booking-----------------------");
    System.out.println("----------------------------------------------------------------------------");
    
    System.out.println("Total Booked Seats : "+TotalBooked);
    System.out.println("Row With Maximum Bookings : "+MaxBookingRow);
    System.out.println("Full Row Exists : "+str);

    }
}


class Assignment53_2
{

//======================================================================
// Main Function : main
// Purpose       : Accept cinema rows, columns and seat details.
// Input         : Rows, columns and seat status (1 = Booked, 0 = Empty)
// Output        : Displays cinema seat booking details.
// Date          : 25/07/2026
// Author        : Pranav Avinash Narkhede
//======================================================================

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRows = 0 ;
        int iColumns = 0 ;
        int iInput = 0 , i = 0 , j = 0 ;

        System.out.println("Enter number of rows : ");
        iRows = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iColumns = sobj.nextInt();

        if(iRows < 0 || iColumns == 0)
        {
            System.out.println("Invalid input ");
            return;
        }

        int Seats[][] = new int[iRows][iColumns];

        for(i = 0 ; i < iRows ; i++)
        {
            System.out.println("Enter "+(i+1)+" rows seat details (1 -> booked , 0 -> empty ) : ");
            for(j = 0 ; j < iColumns ; j++)
            {
                System.out.println("Enter "+(j+1)+" seat detail : ");
                iInput = sobj.nextInt();

                Seats[i][j] = iInput;
            }
        }
        
        for(i = 0 ; i < iRows ; i++)
        {
            for(j = 0 ; j < iColumns ; j++)
            {
                System.out.print(Seats[i][j]+"\t");
            }
            System.out.println();
        }

        Solution suobj = new Solution();
        suobj.AnalyzeCinemaSeats(Seats);
    }
}