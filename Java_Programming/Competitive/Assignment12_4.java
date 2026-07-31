/*
    Write a program which accept number from user and count frequency of 4 in it.
    
    Input : 2395
    Output : 0
    Input : 1018
    Output : 0
*/


import java.util.Scanner;

class Assignment12_4
{
    static int CountFour(int iNo)
    {
        int iCount = 0 ;

        while(iNo != 0)
        {
            if(iNo % 10 == 4)
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

        iRet = CountFour(iValue);

        System.out.println("Frequency of 4 is : "+iRet);

    }

}