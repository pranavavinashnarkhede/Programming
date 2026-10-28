import java.util.Scanner;

class DigitX
{
    public void DisplayDigits(int iNo)
    {
        
        while(iNo != 0)
        {
            System.out.println(iNo % 10);

            iNo = iNo / 10 ;
        }
    }
}

class program25
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        DigitX dobj = new DigitX();

        int iValue = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        dobj.DisplayDigits(iValue);

    }
}

// Time complexity : O(N)
// where N = number of digits
