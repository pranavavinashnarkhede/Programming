import java.util.Scanner;

class Solution
{
    public void PlaceOrder(int stock , int required)
    {
        if(stock < 0 || required <= 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(required > stock)
        {
            System.out.println("Order Failed : Insufficient Stock");
        }
        else 
        {
            stock = stock - required;
            System.out.println("Order Processed Successfully");
            System.out.println("Remaining Stock : "+stock);
        
            if(stock < 5)
            {
                System.out.println("Low Stock Alert");
            }
        }


    } 
}


class Assignment49_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Current_Stock = 0 ;
        int Requested_Quantity = 0 ;

        System.out.println("Enter Current Stock : ");
        Current_Stock = sobj.nextInt();

        System.out.println("Enter Requested Quantity : ");
        Requested_Quantity= sobj.nextInt();

        Solution suobj = new Solution();

        suobj.PlaceOrder(Current_Stock , Requested_Quantity);

        
    }
}