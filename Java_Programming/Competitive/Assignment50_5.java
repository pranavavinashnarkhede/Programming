import java.util.Scanner;

class Solution
{
    public void DisplayWarning(int Battery)
    {
        if(!(Battery >= 0 && Battery <= 100 ))
        {
            System.out.println("Invalid Input");
        }

        if(Battery <= 5)
        {
            System.out.println("Battery Percentage : "+Battery +" %");
            System.out.println("Status : Critical");

        }
        else if(Battery <= 15)
        {
            System.out.println("Battery Percentage : "+Battery +" %");
            System.out.println("Status : Low");
        }
        else
        {
            System.out.println("Battery Percentage : "+Battery +" %");
            System.out.println("Status : Normal");
        }

    }
}


class Assignment50_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Battery_Percentage = 0 ;

        System.out.println("Enter the Battery Percentage : ");
        Battery_Percentage = sobj.nextInt();
        
        Solution suobj = new Solution();

        suobj.DisplayWarning(Battery_Percentage);

    }
}