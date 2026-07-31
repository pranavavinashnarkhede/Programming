/*
    Write a program which accept number from user and check whether it contains 0
    in it or not.

    Input : 2395
    Output : There is no Zero
    Input : 1018
    Output : It Contains Zero
*/


import java.util.Scanner;

class Assignment12_2
{
    static boolean ChkZeor(int iNo)
    {
        boolean bFlag = false;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            if(iNo % 10 == 0)
            {
                bFlag = true;
                break;
            }
            iNo = iNo / 10 ;
        }
        return bFlag;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        bRet = ChkZeor(iValue );

        if(bRet)
        {
            System.out.println("Number contains Zero");
        }
        else
        {
            System.out.println("Number does not contain Zero");
        }

    }

}