/*
    Write a program which accept distance in kilometre and convert it into meter. (1
    kilometre = 1000 Meter)

    Input : 5
    Output : 5000
*/


import java.util.Scanner;

class Assignment8_3
{
    static int KMtoMeter(int iNo)
    {
        return 1000*iNo;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;
        int iRet = 0 ;

        System.out.println("Enter distance : ");
        iValue = sobj.nextInt();

        iRet = KMtoMeter(iValue );

        System.out.println("Distance in meter is  : "+iRet);

    }

}