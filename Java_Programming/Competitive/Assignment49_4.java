import java.util.Scanner;

class Solution
{
    public int CalculateFine(String str1 , String str2 , String str3)
    {
        int Total_Fine = 0 ;

        if((str1.equals("Yes") || str1.equals("No")) && (str2.equals("Yes") || str2.equals("No")) && (str3.equals("Yes") || str3.equals("No")))
        {
            if(str1.equals("No"))
            {
                Total_Fine = Total_Fine + 500;
            }
            if(str2.equals("No"))
            {
                Total_Fine = Total_Fine + 1000;
            }
            if(str3.equals("No"))
            {
                Total_Fine = Total_Fine + 1500;
            }
        }
        else 
        {
            return -1;

        }

        return Total_Fine;

    } 
}


class Assignment49_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Helmet_worn = null ;
        String Licence_availabe = null ;
        String Overspeeding = null ;
        int iRet = 0 ;

        System.out.println("Does Helmet Worn : ");
        Helmet_worn = sobj.nextLine();

        System.out.println("Does License Available : ");
        Licence_availabe = sobj.nextLine();

        System.out.println("Does Overspeeding : ");
        Overspeeding = sobj.nextLine();

        Solution suobj = new Solution();

        iRet = suobj.CalculateFine(Helmet_worn , Licence_availabe , Overspeeding);

        if(iRet == -1)
        {
            System.out.println("Invalid Input");
        }
        else 
        {
            System.out.println("Total Fine Amount : "+iRet+" rupees");
        }
    }
}