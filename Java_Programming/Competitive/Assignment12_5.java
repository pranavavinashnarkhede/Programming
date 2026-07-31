/*
    Write a program which accept number from user and count frequency of such a
    digits which are less than 6.

    Input : 2395
    Output : 3
    Input : 1018
    Output : 3
*/


import java.util.Scanner;

class Assignment12_5
{
    static int Count(int iNo)
    {
        int iCount = 0 ;

        while(iNo != 0)
        {
            if((iNo % 10) < 6)
            {
                iCount++;
            }
            iNo = iNo / 10 ;
        }
        return iCount;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;
        int iRet = 0 ;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        iRet = Count(iValue);

        System.out.println("Frequency is : "+iRet);

    }

}