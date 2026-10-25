import java.util.Scanner;

class Solution
{

//--------------------------------------------------------------------//
// Function Name : CalculateTicket
// Description   : Calculates the ticket fare based on distance, class and age.
// Input         : Distance, class type, booking hours and age
// Output        : Final ticket fare
// Author        : Pranav Avinash Narkhede
// Date          : 22-07-2026
//--------------------------------------------------------------------//

    public void CalculateTicket(int distance , String classType , int bookinghoursbefore , int age )
    {
        int finalFare = 0 ;
        int baseFare = 0 ;
        int classCharges = 0 ;
        int tatkalCharges = 0 ;
        int Discount = 0 ;

        if((distance < 0) || (!classType.equals("Sleeper") && !classType.equals("3AC") && !classType.equals("2AC")) || (bookinghoursbefore < 0) || (age < 0) )
        {
            System.out.println("Invalid input");
            return;
        }

        if(distance <= 200)
        {
            baseFare = 200 ;
        }
        else if(distance <= 500)
        {
            baseFare = 500 ;
        }
        else
        {
            baseFare = 850 ;
        }

        if(classType.equals("Sleeper"))
        {
            classCharges = 100 ;
        
        }
        else if(classType.equals("3AC"))
        {
            classCharges = 300 ;
        
        }
        else
        {
            classCharges = 500 ;
            
        }

        finalFare = baseFare + classCharges ;

        if(bookinghoursbefore <= 24)
        {
            tatkalCharges = (finalFare * 30) / 100 ;
            finalFare = finalFare + tatkalCharges;
        }

        if(age >= 60)
        {
            Discount = (finalFare * 40) / 100;
            finalFare = finalFare - Discount;
        }

        System.out.println("-----------------------------------------------------------------");
        System.out.println("--------------------Ticket Booking System------------------------");
        System.out.println("-----------------------------------------------------------------");
        
        System.out.println("Base Fare : "+baseFare);
        System.out.println("Class Charge : "+classCharges);
        System.out.println("Tatkal Charges : "+tatkalCharges);
        System.out.println("Senior Citizen Discount : "+Discount);
        System.out.println("Final Fare : "+finalFare);
    }
}

class Assignment51_2
{

//--------------------------------------------------------------------//
// Application to calculate railway ticket fare.
//--------------------------------------------------------------------//

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Distance = 0 ;
        String ClassType = null ;
        int BookingHoursBefore = 0 ;
        int age = 0 ;

        System.out.println("Enter the Distance : ");
        Distance = sobj.nextInt();

        System.out.println("Enter the class type (Sleeper / 3AC / 2AC) : ");
        ClassType = sobj.next();

        System.out.println("Enter Booking Hours Before : ");
        BookingHoursBefore = sobj.nextInt();

        System.out.println("Enter the age : ");
        age = sobj.nextInt();

        Solution suobj = new Solution();

        suobj.CalculateTicket( Distance ,  ClassType , BookingHoursBefore ,  age );
    }
}