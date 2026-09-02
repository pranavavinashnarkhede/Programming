
import java.util.Scanner;

class Solution
{
//--------------------------------------------------------------------//
// Function Name : CinemaSeatBooking
// Description   : Processes seat bookings and calculates the total cost.
// Input         : Seat matrix, row prices, booked seats and requested seats
// Output        : Booking status, total cost and remaining seats
// Author        : Pranav Avinash Narkhede
// Date          : 22-07-2026
//--------------------------------------------------------------------//

    public static void CinemaSeatBooking(int seats[][] , int price[] , int booked[][] , int requested[][])
    {
        double Total_pay = 0 ;
        int bookedseat = 0 ;
        int totalseats = 0 ;
        int i = 0 , j = 0  ;
        int rowvalue = 0 , colvalue = 0 ;

        for(i = 0 ; i < seats.length ; i++)             // calculate total seats
        {
            totalseats = totalseats + seats[i].length;
        }

        for(i = 0 ; i < booked.length ; i++)            // make the booked seat marked as 1 in seats matric
        {
            rowvalue = booked[i][0];
            colvalue = booked[i][1];

            seats[rowvalue -1][colvalue -1] = 1 ;
        }

        for(i = 0 ; i < requested.length ; i++)
        {
            rowvalue = requested[i][0];
            colvalue = requested[i][1];

            if(seats[rowvalue - 1][colvalue -1] == 0)
            {
                seats[rowvalue-1][colvalue-1] = 1 ;
                Total_pay = Total_pay + price[rowvalue-1];
                bookedseat++;
            }
            else
            {
                System.out.println("Booking Failed : Seat is already booked");
                return;
            }
        }

        if(bookedseat >= 6)
        {
            Total_pay = Total_pay * 0.90 ;
        }

        System.out.println("Booking Successful");
        System.out.println("Total Cost : "+Total_pay);
        System.out.println("Remaining Seats : "+(totalseats - bookedseat));

    }
}

class Assignment51_5
{
//--------------------------------------------------------------------//
// Application to perform cinema seat booking and calculate the total cost.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRows = 0  , iCols = 0 ;
        int i = 0 ;
        int iBooked = 0  , iRequested = 0 ;

        System.out.println("Enter number of rows : ");
        iRows = sobj.nextInt();

        System.out.println("Enter number of cols : ");
        iCols = sobj.nextInt();

        if(iRows <= 0 || iCols <= 0)
        {
            System.out.println("Invalid input");
            return;
        }

        int Seats[][] = new int[iRows][iCols];
        int price[] = new int[iRows];

        System.out.println("Enter price of each rows : ");
        for(i = 0 ; i < iRows ; i++)
        {
            price[i] = sobj.nextInt();
        }

        System.out.println("Enter number of booked seats : ");
        iBooked = sobj.nextInt();

        int Booked[][] = new int[iBooked][2];
        
        for(i = 0 ; i < Booked.length ; i++)
        {
            System.out.println("Enter booked seat "+(i+1)+" row and column : ");
            Booked[i][0] = sobj.nextInt();
            Booked[i][1] = sobj.nextInt();

        }

        System.out.println("Enter number of requested seats : ");
        iRequested = sobj.nextInt();

        int Requested[][] = new int[iRequested][2];

        for(i = 0 ; i < Requested.length ; i++)
        {
            System.out.println("Enter requested seat "+(i+1)+" row and column : ");
            Requested[i][0] = sobj.nextInt();
            Requested[i][1] = sobj.nextInt();

        }

        CinemaSeatBooking(Seats , price , Booked , Requested);

    }
}