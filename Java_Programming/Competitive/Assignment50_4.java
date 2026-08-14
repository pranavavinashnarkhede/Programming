import java.util.Scanner;

class Solution
{
    public void CalculatePurchase(int amount , int items , int price[])
    {
        int Items_Purchasad = 0 ;
        int i = 0 ;

        if(amount < 0 || items < 0)
        {
            System.out.println("Invalid input");
        }

        for(i = 0 ; i < items ; i++)
        {
            if(price[i] > 0)
            {
                System.out.println("Invalid input");
            }
        }
        
        for(i = 0 ; i < items ; i++)
        {
            if(amount >= price[i])
            {
                Items_Purchasad++;
                amount = amount - price[i];
            }
            else
            {
                break;
            }
        }

        System.out.println("Items Purchased : "+Items_Purchasad);
        System.out.println("Remaining Balance : "+amount);


    }
}


class Assignment50_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Amount = 0 ;
        int Number_Of_Items = 0 ;

        System.out.println("Enter the amount : ");
        Amount = sobj.nextInt();

        System.out.println("Enter the number of items : ");
        Number_Of_Items = sobj.nextInt();

        int N_Item_Prices[] = new int[Number_Of_Items];

        System.out.println("Enter the items price : ");
        for(int i = 0 ; i < Number_Of_Items ; i++)
        {
            N_Item_Prices[i] = sobj.nextInt();    
        }
        
        Solution suobj = new Solution();

        suobj.CalculatePurchase(Amount , Number_Of_Items , N_Item_Prices);

        
        
    }
}