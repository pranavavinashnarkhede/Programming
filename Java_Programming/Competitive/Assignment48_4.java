import java.util.Scanner;

class Solution 
{
//--------------------------------------------------------------------//
// Function Name : CalculateBill
// Description   : Calculates the electricity bill based on units.
// Input         : Number of units
// Output        : Total electricity bill
// Author        : Pranav Avinash Narkhede
// Date          : 18-08-2026
//--------------------------------------------------------------------//
    public int CalculateBill(int units)
    { 
        int i = 0 ; 
        int TotalAmount = 0 ;
        if(units < 0 ) 
        { 
            return -1 ;
        } 
        for(i = 1 ; i <= units ; i++) 
        {
            if(i <= 100)
            {
                TotalAmount = TotalAmount + 5 ; 
            } 
            else if((i > 100) && (i <= 200)) 
            {
                 TotalAmount = TotalAmount + 7 ;
            } 
            else if (i > 200)
            {
                 TotalAmount = TotalAmount + 10 ; 
            } 
        } 
        return TotalAmount;
    } 
} 

class Assignment48_4 
{

//--------------------------------------------------------------------//
//  Application to calculate electricity bill based on units consumed.
//--------------------------------------------------------------------//
    public static void main(String A[]) 
    { 
        Scanner sobj = new Scanner(System.in); 
        int Units = 0 ; 
        int iRet = 0 ; 
        
        System.out.println("Number of units customer consumed : "); 
        Units = sobj.nextInt(); 
        
        Solution suobj = new Solution(); 
        iRet = suobj.CalculateBill(Units); 
        
        if(iRet == -1) 
        {
            System.out.println("Invalid input"); 
        }
        else 
        { 
            System.out.println("Total Units Consumed : "+Units);
            System.out.println("Total Electricity Bill : "+iRet+" rupees"); 
        } 
    } 
}



