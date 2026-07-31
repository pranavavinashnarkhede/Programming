/*
    Write a program which accept number from user and count frequency of 2 in it.
    
    Input : 2395
    Output : 1
    Input : 1018
    Output : 0
*/


import java.util.Scanner;

class Assignment12_3
{
    static int CountTwo(int iNo)
    {
        int iCount = 0 ;

        while(iNo != 0)
        {
            if(iNo % 10 == 2)
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

        iRet = CountTwo(iValue);

        System.out.println("Frequency of 2 is : "+iRet);

    }

}